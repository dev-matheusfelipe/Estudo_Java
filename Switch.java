package domain;

public class switch {

    public static void main(String[] args) {
        
        /*
        
        switch( 1 ){
            case 1 :
                valor 2;
                break;
            case 2 :
                valor 2;
                break;
            default:
                valor padrao;
        }   
            */
            
        switch( 1 ){
            case 1:
                System.out.println("Cartão de crédito selecionado");
                break;
            case 2:
                System.out.println("Saldos da sua conta");
                break;
            default:
                System.out.println("Falar com o atendente");
         }      
                
        // Desafio da aula Switch
        
        int nota =  6;    
        switch( nota ){
          case 10:
            case 9 :
                System.out.println("Otimo!");
                System.out.println("Exelente aluno");
                break;
            case 8 :
                System.out.println("Muito bom!");
                break;
            case 7 :
                System.out.println("bom!");
                break;
            case 6:
                System.out.println("Regular!");
                break;
            default:
                System.out.println("Fale com o professor");
        }         
        
    }

}
