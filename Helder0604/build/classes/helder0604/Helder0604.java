package helder0604;
public class Helder0604 {

    public static void main(String[] args) {
        // TODO code application logic here
        Professor p1 = new Professor("Helder",2041, 10, 10000);
        Professor p2 = new Professor("Anildo",3072, 11);
        
        
        Aluno a1 = new Aluno("Denes", 10000, 1001, 10f);
        
        Aluno a2 = new Aluno("Camilo", 10002, 1002, 9.8f);
        
        p1.dados();
        p2.dados();
        a1.dados();
        a2.dados();
        
    }
    
}
