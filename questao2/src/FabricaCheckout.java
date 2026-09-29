public interface FabricaCheckout {

    DocumentoFiscal criarDocumentoFiscal();

    ProcessadorPagamento criarProcessadorPagamento();

    GeradorEtiqueta criarGeradorEtiqueta();
}
