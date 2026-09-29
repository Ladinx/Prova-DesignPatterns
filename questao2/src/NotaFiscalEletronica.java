import java.util.Locale;

public class NotaFiscalEletronica implements DocumentoFiscal {

    private static final double ICMS = 0.18;

    @Override
    public String emitir(Pedido pedido) {
        double total = pedido.valor() * (1 + ICMS);
        return "Nota fiscal eletronica (NF-e) | ICMS 18% | total R$ "
                + String.format(Locale.of("pt", "BR"), "%,.2f", total);
    }
}
