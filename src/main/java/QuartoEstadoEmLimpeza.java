public class QuartoEstadoEmLimpeza implements QuartoEstado {

    private QuartoEstadoEmLimpeza() {};
    private static QuartoEstadoEmLimpeza instance = new QuartoEstadoEmLimpeza();
    public static QuartoEstadoEmLimpeza getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em limpeza";
    }

}
