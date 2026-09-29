public class EtiquetaCorreios implements GeradorEtiqueta {

    @Override
    public String gerar(Pedido pedido) {
        return "Etiqueta dos Correios | pedido " + pedido.id() + " | " + pedido.enderecoEntrega();
    }
}
