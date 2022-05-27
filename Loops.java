public class loops {

    public static void main(String[] args) {
        
        /*
        while( condicao ){
            Executa enquanto a condição seja satisfeita
        }
        */
        
        int numero = 0;       
        while( numero < 5 ){
            System.out.println("Executou " + numero );
            numero = numero + 1;
        }
        
        // Exemplo Postagem 
        
        int numero = 1;  
        while( numero < 5 ){
            
            System.out.println("##### ");
            System.out.println("Postagem " + numero );
            System.out.println("##### ");
            numero = numero + 1;
        }
        
        // Exemplo de verificação da quantidade de postagens
        
        // Verificação de quantas postagens existem
        String[] postagens = {"Bom dia amigos", "postagem 2", "postagem 3" };
        System.out.println( postagens.length );
        int numero = 0;
        while( numero < postagens.length ){
            
            System.out.println( postagens [ numero ] );
            System.out.println("##### ");
            numero = numero + 1;
        }
        
        // Exemplo do ( for ) e ( do )
        
        int numero = 1;
        while( numero < 1 ){
            System.out.println( numero );
            // é possivel somar um numero + 1;
            numero = numero + 1;
            // ou somar apenas colocando numero++;
            numero++;
        }
        
        for( int n=1; n<=5; n++ ){
            System.out.println( n );
        }
        
        
        do{
            System.out.println( numero );
            numero = numero + 1;
        }while( numero < 1 );
    }
}
