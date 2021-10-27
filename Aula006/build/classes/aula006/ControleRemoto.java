package aula006;
public class ControleRemoto implements Controlador{ /*Implementa a iterface*/ 
    
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Metodo Controlador
    public ControleRemoto(){
        this.volume= 50;
        this.ligado = false;
        this.tocando = false;
    }
    //Status
    public void status(){
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
    }
    
    //Metodo Especiais
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume){
        this.volume= volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado=ligado;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    
    //Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true) ;
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(this.getLigado());
        System.out.println(this.getVolume());
        System.out.println(this.getTocando());
        for (int i = 0; i<=this.getVolume();i+=10){
            System.out.print("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fecando Menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) {
            this.setVolume(getVolume()+5);
        }  
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()==true){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()<=0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
}
