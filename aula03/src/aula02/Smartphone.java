package aula02;
public class Smartphone {
    String marca;
    String modelo;
    String cor;
    int camera;
    boolean funciona;
    private boolean ligada;
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this. modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Camera: " + this.cor);
        System.out.println("Funciona: "+this.cor);
        System.out.println("Ligado: "+this.ligada);
    }
    void ligar(){
            if(this.funciona == true){
                    if(this.ligada== true){
                        System.out.println("Aparelho ligado");
                    }
                    else{
                        System.out.println("Ligando Aparelho");
                    }
            }
            else{
                System.out.println("ERRO, APARELHO QUEBRADO.");
            }
    }
    void desligar(){
            if(this.funciona == true){
                if(this.ligada == true){
                    System.out.println("DESLIGANDO APARELHO...\n APARELHO DESLIGADO");
                }
                else{
                    System.out.println("APARELHO DESLIGADO");
                }
            }
            else{
                System.out.println("APARELHO INATIVO");
            }
}
}
    

