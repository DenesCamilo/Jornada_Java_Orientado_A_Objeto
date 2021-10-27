package aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, String c, float p){//metodo construtor
        this.cor = c;
        this.modelo=m;
        this.ponta=p;
        this.tampar();
        
                    
    }
    
    public void status(){
        
    }
    
    public String getModelo(){
    return this.modelo;
}
    
    public void setModelo(String m) {
            this.modelo = m;
        }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("COr: "+this.cor);
        System.out.println("Tampada: " + this.tampada);
        
    }
    
    public void tampar(){
        this.tampada= true;
    }
    
    public void destampar(){
        this.tampada = false;
    } 
    
}


   