public class Main {

    public static void main(String[] args) {
        Pedido pedidoBrasil = new Pedido("BR-2026-0001", "CUritibA, 1000", 1_299.90);
        Pedido pedidoAlemanha = new Pedido("DE-2026-0001", "Berlim, 12", 349.90);

        new Checkout(new FabricaBrasil()).finalizar(pedidoBrasil);
        new Checkout(new FabricaAlemanha()).finalizar(pedidoAlemanha);
    }
}
