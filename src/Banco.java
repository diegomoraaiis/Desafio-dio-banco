import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicioarContas(Conta conta){
        this.contas.add(conta);
    }

    public void ListarContas(){
        if(verificaListaVazia()){
            for (Conta conta : contas ){
                System.out.println(conta);
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public void ListarClientes(){
        if(verificaListaVazia()){
            for (Conta conta : contas){
                System.out.println(conta.getTitularDaConta());
            }
        } else{
            System.out.println("Lista vazia!s");
        }
    }

    public boolean verificaListaVazia(){
        if(!contas.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
}
