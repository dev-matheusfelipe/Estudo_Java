Class MainActivity

Funcionario funcionario = new Funcionario();
        funcionario.nome = "Matheus";
        funcionario.salario = 920;

        double salarioRecuperado = funcionario.recuperarSalario( 150, 20);
        System.out.println( "O salário do Matheus é:" + salarioRecuperado );
        
        
Class Funcionario


class Funcionario {

    //propriedades
    String nome;
    double salario;

    //métodos - sem retorno / com retorno
    double recuperarSalario( double bonus, double descontoAdicional ){
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario + bonus - descontoAdicional;
        //System.out.println( this.salario );

    }
