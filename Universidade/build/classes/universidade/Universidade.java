package universidade;

/**
 * ------------Authors------------
 *          Denes Camilo 
 *        Tauane  de jesus   
 *        Leonardo Carvalho
 *         Elias da Silva
 * -------------------------------
 */
public class Universidade {

    public static void main(String[] args) {
        Universidades universidades = new Universidades();
        
        UniversidadePolo[] up = new UniversidadePolo[3];
        UniversidadeInterior[] ui= new UniversidadeInterior[3];
        
        up[0]= new UniversidadePolo("Estacio Gilberto Gil", " R. Xingu, 179", 2500);
        up[1]= new UniversidadePolo("Estácio, Campus Fratelli Vita", " R. Barão de Cotegipe, 142", 2000);
        up[2]= new UniversidadePolo("Estácio Polo EAD Shopping Bela Vista", " Alameda Euvaldo Luz, 92 - Shopping Bela Vista", 3000);
           
        universidades.insere(up[0]);
        universidades.insere(up[1]);
        universidades.insere(up[2]);
        
        
        
        ui[0]= new UniversidadeInterior("Estácio - FMJ - Juazeiro do Norte", " Avenida, Av. Ten. Raimundo Rocha, 515", 30000.00f);
        ui[1]= new UniversidadeInterior("Faculdade Estácio de Alagoinhas", " Avenida Linha Verde, S/N – Alagoinhas Velha", 25988.45f);
        ui[2]= new UniversidadeInterior("Estácio Campus Feira de Santana", " Av. Getúlio Vargas, 3347 - Santa Monica, Feira de Santana", 85570.01f);
        
        universidades.insere(ui[0]);
        universidades.insere(ui[1]);
        universidades.insere(ui[2]);
        
        
        System.out.println(universidades.toString());
        
    }
    
}
