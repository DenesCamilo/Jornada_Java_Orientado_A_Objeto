package heranca;
public class Bolsista extends Aluno{
   private int bolsa;
   
   public void renovarBolsa(){
       
   }
   @Override
   public void pagarMensalidade(){
       System.out.println("MENSALIDADE DE BOLSISTA PAGA");
   }
   

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
   
    
}
