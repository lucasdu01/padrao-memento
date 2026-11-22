public class QuartoEstadoReservado implements QuartoEstado {

    private QuartoEstadoReservado() {};
    private static QuartoEstadoReservado instance = new QuartoEstadoReservado();
    public static QuartoEstadoReservado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Reservado";
    }

}
