package aula02;
public class Aula02 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampa();
        c1.rabiscar();
        
        
        Smartphone s1 = new Smartphone();
        s1.marca = "ASUS";
        s1.cor = "CINZA";
        s1.funciona = true;
        s1.ligada = false;
        s1.camera = 2;
        
        
        
    }
        
        
    
}
