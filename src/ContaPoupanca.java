public class ContaPoupanca extends Conta {
    protected final String tipo = "CONTA POUPANÇA";

    protected ContaPoupanca(String titularDaConta) {
        super(titularDaConta);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("=====- EXTRATO CONTA "  + tipo + " -=====");
        imprimirEmComum();
    }
}
