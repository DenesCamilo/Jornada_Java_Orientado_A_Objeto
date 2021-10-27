package universidade;

import java.util.ArrayList;

public  class Universidades {
    private ArrayList unarray ;
    
        public Universidades(){
            this.unarray = new ArrayList();
        }
        
        public void insere (UniversidadeSede universidadeSede){
            this.unarray.add(universidadeSede);
        }

    @Override
    public String toString() {
        return "Universidades{" + "unarray=" + unarray + '}';
    }
    
    
    
    
    
}
