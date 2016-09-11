package com.fincatto.nfe310.classes;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.nfe310.FabricaDeObjetosFake;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class NFProtocoloInfoTest {

    @Test
    public void deveObterIdentificadorComoFoiSetado() {
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        final String identificador = "ID798456123";
        protocoloInfo.setIdentificador(identificador);
        Assert.assertEquals(identificador, protocoloInfo.getIdentificador());
    }

    @Test
    public void deveObterVersaoAplicacaoComoFoiSetado() {
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        final String versaoAplicacao = "3.10";
        protocoloInfo.setVersaoAplicacao(versaoAplicacao);
        Assert.assertEquals(versaoAplicacao, protocoloInfo.getVersaoAplicacao());
    }

    @Test
    public void deveObterAmbienteComoFoiSetado() {
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        final NFAmbiente ambiente = NFAmbiente.HOMOLOGACAO;
        protocoloInfo.setAmbiente(ambiente);
        Assert.assertEquals(ambiente, protocoloInfo.getAmbiente());
    }

    @Test
    public void deveObterChaveComoFoiSetado() {
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        final String chave = "27453083767543876731879602388114613152665633";
        protocoloInfo.setChave(chave);
        Assert.assertEquals(chave, protocoloInfo.getChave());
    }

    @Test
    public void deveObterMotivoComoFoiSetado() {
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        final String motivo = "Autorizado o seu uso";
        protocoloInfo.setMotivo(motivo);
        Assert.assertEquals(motivo, protocoloInfo.getMotivo());
    }

    @Test
    public void deveObterValidadorComoFoiSetado() {
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        final String validador = "validador";
        protocoloInfo.setValidador(validador);
        Assert.assertEquals(validador, protocoloInfo.getValidador());
    }

    @Test
    public void deveObterNumeroProtocoloComoFoiSetado() {
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        final String numeroProtocolo = "123456789";
        protocoloInfo.setNumeroProtocolo(numeroProtocolo);
        Assert.assertEquals(numeroProtocolo, protocoloInfo.getNumeroProtocolo());
    }

    @Test
    public void deveObterStatusComoFoiSetado() {
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        final String status = "100";
        protocoloInfo.setStatus(status);
        Assert.assertEquals(status, protocoloInfo.getStatus());
    }

    @Test
    public void deveFormatarDataComOuSemTimeZone() throws Exception {
        final LocalDateTime formatoAntigo = LocalDateTime.parse("2015-01-01T10:20:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        final ZonedDateTime formatoNovo = ZonedDateTime.parse("2015-01-01T10:20:30-05:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        final NFProtocoloInfo protocoloInfo = new NFProtocoloInfo();
        protocoloInfo.setDataRecebimento("2015-01-01T10:20:30");
        Assert.assertEquals(formatoAntigo, protocoloInfo.getDataRecebimento());
        protocoloInfo.setDataRecebimento("2015-01-01T10:20:30-05:00");
        Assert.assertEquals(formatoNovo, protocoloInfo.getDataRecebimento());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFProtocoloInfo Id=\"ID798456123\"><tpAmb>2</tpAmb><verAplic>3.10</verAplic><chNFe>EAIOjea</chNFe><dhRecbto>2014-06-10T09:00:00-03:00</dhRecbto><nProt>490309504</nProt><digVal>gfsfgsrg</digVal><cStat>OK</cStat><xMotivo>jsoaosk</xMotivo></NFProtocoloInfo>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFProtocoloInfo().toString());
    }
}
