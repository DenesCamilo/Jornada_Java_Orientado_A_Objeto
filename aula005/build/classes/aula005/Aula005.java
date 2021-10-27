package aula005;
public class Aula005 {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Denes");
        p1.abrirConta("CC");
        
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Priscila");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.statusAtual();
        p2.statusAtual();
        
        p2.setNumConta(3321);
        p2.statusAtual();
    }
    
}
