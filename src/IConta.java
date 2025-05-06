public interface IConta {
    void sacar(double valor);
    void tranferir(double valor, Conta conta);
    void depositar(double valor);
    void imprimirExtrato ();
}
