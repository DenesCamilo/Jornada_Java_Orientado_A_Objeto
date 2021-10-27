package projetofinal;
public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean assistindo;

    public Video(String titulo ) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.assistindo = false;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isAssistindo() {
        return assistindo;
    }

    public void setAssistindo(boolean assistindo) {
        this.assistindo = assistindo;
    }

    @Override
    public void play() {
        if( this.isAssistindo() == false) {
        this.setAssistindo(true);
        this.setViews(this.getViews() + 1);
        }
        else{
            System.out.println("Video rodando");
        }
    }

    @Override
    public void pause() {
        if(this.isAssistindo()){
        this.setAssistindo(false);
            System.out.println("PAUSADO");
        }else{
            System.out.println("O VIDEO JA ESTA PAUSADO");
        }
    }
    

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
        
    }
    
    
    
    
}
