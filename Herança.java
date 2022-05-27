Class Animal:

class Animal {

    int tamanho;
    String cor;
    double peso;

    //Getter e Setter


    int getTamanho() {
        return tamanho;
    }

    void setTamanho(int tamanhoho) {
        this.tamanho = tamanho;
    }

    double getPeso() {
        return peso;
    }

    void setPeso(double peso) {
        this.peso = peso;
    }

    void setCor(String cor ){
        //Formatacao ou validacao
        this.cor = cor;
    }

    String getCor(){
        return this.cor;
    }


    void dormir(){
        System.out.println("Dormi como um animal");
    }
    void correr(){
        System.out.println("Correr como um animal");
    }


}

Class Cao:

class Cao extends Animal {

    void latir(){
        System.out.println("Latir como um cao");
    }

}

Class Passaro:

class Passaro extends Animal {

    void voar(){
        System.out.println("Voar como passaro");
    }

}

Class MainActivity:

Cao cao = new Cao();
        cao.setCor("Azul");

        System.out.println( cao.getCor() );

        cao.dormir();
        cao.latir();

        Animal animal = new Animal();
        animal.correr();

