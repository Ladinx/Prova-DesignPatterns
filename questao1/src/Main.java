public class Main {

    public static void main(String[] args) {
        new CriadorApoliceAuto().emitir(new Solicitacao("Rebecca", 60_000.00));
        new CriadorApoliceResidencial().emitir(new Solicitacao("Arthur", 320_000.00));
        new CriadorApoliceVida().emitir(new Solicitacao("Escobar", 200_000.00));
    }
}
