import java.util.Locale;

public abstract class CriadorApolice {

    public final void emitir(Solicitacao solicitacao) {
        Apolice apolice = criarApolice();
        double premioMensal = apolice.premioMensal(solicitacao.valor());
        System.out.println("Linha de produto: " + apolice.linha());
        System.out.println("Segurado: " + solicitacao.segurado());
        System.out.println("Premio mensal: R$ " + String.format(Locale.of("pt", "BR"), "%,.2f", premioMensal));
        System.out.println("Documentos exigidos: " + String.join(" e ", apolice.documentosExigidos()));
        System.out.println();
    }

    protected abstract Apolice criarApolice();
}
