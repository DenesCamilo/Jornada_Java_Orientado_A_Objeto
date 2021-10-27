package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Carga: "+this.carga);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma canetaa" + this.cor);   
        System.out.println("Tampada?" + this.tampada);
                 }
    
    void rabiscar(){
        if(tampada==true){
            System.out.println("ERRO, REMOVA A TAMPA PARA RABISCAR");
        }
        else{
            System.out.println("RABISCANDO");
        }
        
    }
    void tampar(){
        this.tampada = true;
        System.out.println("CANETA TAMPADA");
           
    }
    void destampa(){
        this.tampada = false;
            System.out.println("Caneta destampada");
    }
    
    
   
}
