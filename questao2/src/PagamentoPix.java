public class PagamentoPix implements ProcessadorPagamento {

    @Override
    public String processar(Pedido pedido) {
        return "Pagamento via Pix | pedido " + pedido.id();
    }
}
