public abstract class Conta implements IConta {
    private static final int AGENCIAPADRAO = 001;
    private static int SEQUENTIAL = 1;
    protected String titularDaConta;
    protected int agencia;
    protected int numero;
    protected double saldo;


    protected Conta(String titularDaConta) {
        this.agencia = Conta.AGENCIAPADRAO;
        this.numero = SEQUENTIAL ++;
        this.titularDaConta = titularDaConta;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void tranferir(double valor, Conta conta) {
        if (valor > this.saldo){
            System.out.println("Erro de transferência: Saldo insuficiênte");
        } else {
            conta.depositar(valor);
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    protected void imprimirEmComum(){
        System.out.println("Agência..: " + this.agencia);
        System.out.println("Número..: " + this.numero);
        System.out.println("Saldo..: " + this.saldo);
    }


    @Override
    public String toString() {
        return "Conta{" +
                "titular Da Conta='" + titularDaConta + '\'' +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }


    public String getTitularDaConta() {
        return titularDaConta;
    }
}
