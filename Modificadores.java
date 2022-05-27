Modificadores de acesso

1) public - Todas as classes terão acesso
2) private - Apenas pode ser acessado de dentro da classe
3) protected - Pode ser acessado estando dentro do mesmo pacote e/ou subclasses
4) default - Caso não tenha sido definido nenhum modificador, permitindo o acesso dentro do pacote

Class Conta:

public class Conta {

    protected int numeroConta;
    private double saldo = 100;

    public double recuparerarSaldo(){
        return this.saldo;
    }

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public  void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }

}


Class MainActivity:

Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);

        System.out.println( conta.recuparerarSaldo() );
        
        
