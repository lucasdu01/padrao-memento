public class QuartoEstadoLivre implements QuartoEstado {

    private QuartoEstadoLivre() {};
    private static QuartoEstadoLivre instance = new QuartoEstadoLivre();
    public static QuartoEstadoLivre getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Livre";
    }

}
