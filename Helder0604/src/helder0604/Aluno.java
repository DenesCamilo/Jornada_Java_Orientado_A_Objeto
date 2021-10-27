package helder0604;
public class Aluno extends Pessoa{
    private float media; 
    
    public Aluno(String nome, int cpf, int matricula, float media) {
        super(nome, cpf, matricula);
        this.media = media;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
}
