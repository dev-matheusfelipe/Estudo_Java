public class Operadores{
  public static void main( String[] args) {
   
   
  // Operadores Racionais
  
  // == Igual
  // != Diferente
  //  > Maior
  //  < Menor
  // >= Maior ou Igual
  // <= Menor ou Igual
  
  // Operadores Lógicos
  
  // && e
  // || ou
 
  // Exemplos
  
  //Ex: 1  ( == ) Igual
  boolean resultado; // true ou false
  int n1 = 2;
  int n2 = 2;
  resultado = n1 == n2;
  
  //Ex: 2  ( != ) Diferente
  boolean resultado; // true ou false
  int n1 = 1;
  int n2 = 2;
  resultado = n1 != n2;
  
  //Ex: 3  ( > ) Maior
  boolean resultado; // true ou false
  int n1 = 4;
  int n2 = 2;
  resultado = n1 > n2;
  
  //Ex: 4  ( < ) Menor
  boolean resultado; // true ou false
  int n1 = 20;
  int n2 = 18;
  resultado = n1 > n2;
  
  //Ex: 5  ( >= ) Maior ou Igual
  boolean resultado; // true ou false
  int n1 = 20;
  int n2 = 50;
  resultado = n1 > n2;
  
  //Ex: 6  ( <= ) Menor ou Igual
  boolean resultado; // true ou false
  int n1 = 50;
  int n2 = 50;
  resultado = n1 > n2;
  
  
  //Ex: 7  ( && ) e
  boolean resultado; // true ou false
  int idade = 18;
  resultado = idade>=18 && idade<=40;
  resultado = 1==1 && 2==2;
  resultado = 1==1 && 3==4;
  resultado = true && true;
  
  //Ex: 8  ( || ) ou
  boolean resultado; // true ou false
  int idade = 18;
  int totalCompra = 150;
  resultado = idade >= 40 || totalCompra >=200;
  resultado = 1==1 || 1==1;
  resultado = 1==1 || 1==2;
  
  int n1 = 4;
  int n2 = 2;
  resultado = 20 <= 20;
  
  system.out.println( resultado );
  
  }
} 
