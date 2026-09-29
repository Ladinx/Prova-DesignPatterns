public class EtiquetaDeutschePost implements GeradorEtiqueta {

    @Override
    public String gerar(Pedido pedido) {
        return "Etiqueta da Deutsche Post | pedido " + pedido.id() + " | " + pedido.enderecoEntrega();
    }
}
