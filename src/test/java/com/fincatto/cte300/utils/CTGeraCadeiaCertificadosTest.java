package com.fincatto.cte300.utils;

import com.fincatto.cte300.classes.CTAmbiente;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Fagner Granella
 */
public class CTGeraCadeiaCertificadosTest {

    @Test
    public void geraCadeiaCertificadoHomologacao() throws Exception {
        final byte[] cadeia = CTGeraCadeiaCertificados.geraCadeiaCertificados(CTAmbiente.HOMOLOGACAO, "senha");
        Assert.assertTrue(cadeia.length > 0);
    }

    @Test
    public void geraCadeiaCertificadoProducao() throws Exception {
        final byte[] cadeia = CTGeraCadeiaCertificados.geraCadeiaCertificados(CTAmbiente.PRODUCAO, "senha");
        Assert.assertTrue(cadeia.length > 0);
    }
}