public class CriadorApoliceResidencial extends CriadorApolice {

    @Override
    protected Apolice criarApolice() {
        return new ApoliceResidencial();
    }
}
