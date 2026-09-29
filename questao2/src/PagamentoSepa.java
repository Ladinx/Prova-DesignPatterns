public class PagamentoSepa implements ProcessadorPagamento {

    @Override
    public String processar(Pedido pedido) {
        return "SEPA Direct Debit | pedido " + pedido.id();
    }
}
