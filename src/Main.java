//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Diego");
        Conta cp = new ContaPoupanca("Patrik");
        Banco banco = new Banco();


        cc.depositar(300);
        cc.tranferir(300, cp);
        banco.adicioarContas(cp);
        banco.adicioarContas(cc);
        banco.ListarContas();
        banco.ListarClientes();


    }
}