public class FabricaBrasil implements FabricaCheckout {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalEletronica();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoPix();
    }

    @Override
    public GeradorEtiqueta criarGeradorEtiqueta() {
        return new EtiquetaCorreios();
    }
}
