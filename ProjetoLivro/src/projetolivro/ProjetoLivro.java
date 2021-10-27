package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l= new Livro[3];
        
        p[0]= new Pessoa("Denes", 21, "M");
        p[1]= new Pessoa("Priscila", 21, "f");
        
        l[0]= new Livro("Jogos Vorazes", "Larissa", 5, p[0] );
        l[1]= new Livro("Harry Potter", "JK", 10, p[1]);
        l[2]= new Livro ("Poo para iniciantes", "Pedro Paulo", 6, p[0]);
                
        l[0].abrir();
        l[0].detalhes();
        l[0].avancaPag();
        l[0].folhear();
        l[0].detalhes();
    }
    
}
