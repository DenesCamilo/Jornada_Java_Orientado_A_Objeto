
package aula002;

public class Caneta {
    public String modelo;
    public String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga "+this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Esta tampada ? " + this.tampada );}
    
    void rabiscar(){   
        if(this.tampada == true){
            System.out.println("ERRO! Caneta tampada!!");   
        }
        else{
            System.out.println(" Rabiscando ---------***-* "); }
    }
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
                }
}
