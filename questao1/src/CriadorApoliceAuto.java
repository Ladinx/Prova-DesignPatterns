public class CriadorApoliceAuto extends CriadorApolice {

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto();
    }
}
