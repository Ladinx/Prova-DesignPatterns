public class FabricaAlemanha implements FabricaCheckout {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new VatInvoice();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoSepa();
    }

    @Override
    public GeradorEtiqueta criarGeradorEtiqueta() {
        return new EtiquetaDeutschePost();
    }
}
