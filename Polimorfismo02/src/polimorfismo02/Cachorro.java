package polimorfismo02;
public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU AU AU!!!");
    }

 public void reagir(String frase){
     if(frase.equals("Toma comida" )|| frase.equals("Olá")){
         System.out.println("Abana o rabo");}
     else{
         System.out.println("Rosnar");
     }

}
 public void reagir( int hora, int minuto){
     if(hora < 12 && minuto < 30){
         System.out.println("Abanar");
     }
     else{
         System.out.println("Rosnar");
     }
}
 public void reagir(boolean dono){
     if(dono){
         System.out.println("Abanar");
     }
     else{
         System.out.println("Rosnar");
     }

}
 public void reagir(int idade, float peso){
     if(idade < 5){
         if(peso < 10){
             System.out.println("Abanar"); 
     }
         else{
             System.out.println("latir");
         }
    } else{
         if(peso<10){
             System.out.println("Rosnar");
         }else{
             System.out.println("Ignorar");
         }
     }
 }
 

}
