package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status(){
        System.out.println("Carga: "+this.carga);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);   
        System.out.println("Tampada:"  + this.tampada);
                 }
    
    public void rabiscar(){
        if(tampada==true){
            System.out.println("ERRO, REMOVA A TAMPA PARA RABISCAR");
        }
        else{
            System.out.println("RABISCANDO");
        }
        
    }
    protected void tampar(){
        this.tampada = true;
        System.out.println("CANETA TAMPADA");
           
    }
    protected void destampa(){
        this.tampada = false;
            System.out.println("Caneta destampada");
    }
    
    
   
}
