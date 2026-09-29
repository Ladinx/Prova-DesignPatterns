import java.util.Locale;

public class VatInvoice implements DocumentoFiscal {

    private static final double IMPOSTO = 0.19;

    @Override
    public String emitir(Pedido pedido) {
        double total = pedido.valor() * (1 + IMPOSTO);
        return "VAT invoice | imposed 19% | total "
                + String.format(Locale.GERMANY, "%,.2f", total) + " EUR";
    }
}
