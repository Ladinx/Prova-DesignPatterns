public class CriadorApoliceVida extends CriadorApolice {

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida();
    }
}
