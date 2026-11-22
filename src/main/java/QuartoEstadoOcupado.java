public class QuartoEstadoOcupado implements QuartoEstado {

    private QuartoEstadoOcupado() {};
    private static QuartoEstadoOcupado instance = new QuartoEstadoOcupado();
    public static QuartoEstadoOcupado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ocupado";
    }

}
