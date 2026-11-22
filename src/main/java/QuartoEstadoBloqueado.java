public class QuartoEstadoBloqueado implements QuartoEstado {

    private QuartoEstadoBloqueado() {};
    private static QuartoEstadoBloqueado instance = new QuartoEstadoBloqueado();
    public static QuartoEstadoBloqueado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Bloqueado";
    }

}
