public class QuartoEstadoEmManutencao implements QuartoEstado {

    private QuartoEstadoEmManutencao() {};
    private static QuartoEstadoEmManutencao instance = new QuartoEstadoEmManutencao();
    public static QuartoEstadoEmManutencao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em manutenção";
    }

}
