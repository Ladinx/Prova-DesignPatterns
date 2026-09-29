import java.util.List;

public abstract class Apolice {

    public abstract String linha();

    public abstract double premioMensal(double valor);

    public abstract List<String> documentosExigidos();
}
