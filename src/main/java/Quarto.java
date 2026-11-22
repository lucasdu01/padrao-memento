import java.util.ArrayList;
import java.util.List;

public class Quarto {

    private QuartoEstado estado;
    private List<QuartoEstado> memento = new ArrayList<QuartoEstado>();

    public QuartoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(QuartoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<QuartoEstado> getEstados() {
        return this.memento;
    }
}
