import java.util.List;

public class ApoliceAuto extends Apolice {

    private static final double TAXA_ANUAL = 0.08;

    @Override
    public String linha() {
        return "Auto";
    }

    @Override
    public double premioMensal(double valor) {
        return valor * TAXA_ANUAL / 12;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("CNH", "CRLV");
    }
}
