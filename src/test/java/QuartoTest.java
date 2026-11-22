import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoTest {

    @Test
    void deveArmazenarEstados() {
        Quarto quarto = new Quarto();
        quarto.setEstado(QuartoEstadoLivre.getInstance());
        quarto.setEstado(QuartoEstadoOcupado.getInstance());
        assertEquals(2, quarto.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Quarto quarto = new Quarto();
        quarto.setEstado(QuartoEstadoLivre.getInstance());
        quarto.setEstado(QuartoEstadoOcupado.getInstance());
        quarto.restauraEstado(0);
        assertEquals(QuartoEstadoLivre.getInstance(), quarto.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Quarto quarto = new Quarto();
        quarto.setEstado(QuartoEstadoLivre.getInstance());
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        quarto.setEstado(QuartoEstadoLivre.getInstance());
        quarto.setEstado(QuartoEstadoOcupado.getInstance());
        quarto.restauraEstado(2);
        assertEquals(QuartoEstadoLivre.getInstance(), quarto.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Quarto quarto = new Quarto();
            quarto.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
