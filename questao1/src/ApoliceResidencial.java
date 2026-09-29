import java.util.List;

public class ApoliceResidencial extends Apolice {

    private static final double TAXA_ANUAL = 0.015;

    @Override
    public String linha() {
        return "Residencial";
    }

    @Override
    public double premioMensal(double valor) {
        return valor * TAXA_ANUAL / 12;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("escritura ou contrato de locacao");
    }
}
