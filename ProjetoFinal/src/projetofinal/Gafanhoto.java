package projetofinal;
public class Gafanhoto extends Pessoa    {
    private int login;
    private int totAssistido;
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}
