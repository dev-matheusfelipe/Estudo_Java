public class estrutura {
  public static void main(String[] args) {
    
    /*
    if ( condicao ){
        executa caso condicao seja satisfeita
    }
    */
    
    if( true ){
      System.out.println("Verdadeiro");
    }
    
    if( false ){
      System.out.println("Verdadeiro");
    }
    
    if( 15 > 18 ){
      System.out.println("Verdadeiro");
    }
    
    int idade = 20;
    if( idade > 18 ){
      System.out.println("Maior de idade!");
    }else{
      System.out.println("Menor de idade!");
    }
    
    int idade = 20;
    if( 1==1 && 1==1 ){
      System.out.println("Verdadeiro");
    }else{
      System.out.println("Falso");
    }
    
       int idade = 20;
    if( 1==4 && 1==1 ){
      System.out.println("Verdadeiro");
    }else{
      System.out.println("Falso");
    }
    
    int idade = 20;
    if( 1==4 || 1==2 ){
      System.out.println("Verdadeiro");
    }else{
      System.out.println("Falso");
    }
    
    int opcao = 1;
    if( opcao == 1 ){
      System.out.println("Cartão de credito selecionado");
    }else if( opcao == 2 ){
      System.out.println("Saldos da sua conta");
    }else if( opcao == 3 ){
    System.out.println("Descontos invdevidos");
    }else{
      System.out.println("Falar com atendente");
    }
    
    
    // Desafio Aula  - if / Else / Else if
    
    int idade = 12;
        if ( idade < 12 ){
           System.out.println("Criança"); 
        }else if ( idade >= 12 && idade < 18 ){
            System.out.println("Adolescente");
        }else if ( idade > 18 ){
            System.out.println("Adulto");
        }
    
    
  }
}
