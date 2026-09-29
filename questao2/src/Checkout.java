public class Checkout {

    private final FabricaCheckout fabrica;

    public Checkout(FabricaCheckout fabrica) {
        this.fabrica = fabrica;
    }

    public void finalizar(Pedido pedido) {
        DocumentoFiscal documentoFiscal = fabrica.criarDocumentoFiscal();
        ProcessadorPagamento pagamento = fabrica.criarProcessadorPagamento();
        GeradorEtiqueta etiqueta = fabrica.criarGeradorEtiqueta();
        System.out.println("Pedido " + pedido.id());
        System.out.println("  Documento fiscal: " + documentoFiscal.emitir(pedido));
        System.out.println("  Pagamento: " + pagamento.processar(pedido));
        System.out.println("  Etiqueta de envio: " + etiqueta.gerar(pedido));
        System.out.println();
    }
}
