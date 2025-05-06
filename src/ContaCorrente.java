public class ContaCorrente extends Conta{
    protected final String tipo = "CONTA CORRENTE";

    protected ContaCorrente(String titularDaConta) {
        super(titularDaConta);
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("=====- EXTRATO CONTA "  + tipo + " -=====");
        imprimirEmComum();
    }
}
