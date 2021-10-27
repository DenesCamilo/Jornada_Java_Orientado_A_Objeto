package projetolivro;
public class Livro implements Publicacao{
//ATRIBUTOS
      private String titulo;
      private String autor;
      private int totPaginas;
      private int pagAtual;
      private boolean aberto;
      private Pessoa leitor ;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
      
//METODOS ESPECIAIS
    public void detalhes(){
          System.out.println("TITULO #### "+this.getTitulo());
          System.out.println("AUTOR #### "+this.getAutor());
          System.out.println("TOTAL DE PÁGINAS #### "+this.getTotPaginas());
          System.out.println("PAGINA ATUAL #### "+this.getPagAtual());
          System.out.println("QUEM ESTA LENDO?? #### "+this.leitor.getNome());
          
      }
      
//METODOS ACESSORES

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // INTERFACE    

    @Override
    public void abrir() {
        if(this.isAberto() == false){
        this.setAberto(true);
        System.out.println("ABRINDO LIVRO "+this.getTitulo());
        
        }
        else{
            System.out.println("¢¢¢¢ O Livro já está aberto ¢¢¢¢ ");
        }
    }

    @Override
    public void fecar() {
        if(this.isAberto()== true){
            this.setAberto(false);
            System.out.println("FECHANDO lIVRO " + this.getTitulo());
        }
        else{
            System.out.println("¢¢¢¢ O Livro já está fechado ¢¢¢¢ ");
        }
        
    }

    @Override
    public void folhear() {
        for(int i=1; i<this.getTotPaginas();i++){
            this.setPagAtual(i);
            System.out.println(this.getPagAtual());
        }
        System.out.println("VOCÊ PASSOU POR TODAS AS PAGINAS RAPIDAMENTE PARABÉNSSS");
    }

    @Override
    public void avancaPag() {
        if(this.isAberto() && this.getPagAtual() < this.getTotPaginas()){
          this.setPagAtual(this.getPagAtual()+1);
            System.out.println("a pagina atual é "+this.getPagAtual());
        }
        else{
            this.fecar();
            System.out.println("LIVRO FINALIZADO");
        }
    }

    @Override
    public void voltarPag() {
        if( this.isAberto() == true && this.getPagAtual()>1){
            this.setPagAtual(this.getPagAtual() - 1);
        }
        else{
            System.out.println("VOCE ESTÁ NA PRIMARA PAGINA IMPOSSIVEL VOLTAR");
        }
    }
      
      
}
