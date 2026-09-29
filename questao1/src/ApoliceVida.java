import java.util.List;

public class ApoliceVida extends Apolice {

    private static final double TAXA_ANUAL = 0.03;

    @Override
    public String linha() {
        return "Vida";
    }

    @Override
    public double premioMensal(double valor) {
        return valor * TAXA_ANUAL / 12;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("documento de identidade", "CPF");
    }
}
