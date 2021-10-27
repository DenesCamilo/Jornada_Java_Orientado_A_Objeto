package aula04;
public class ContaCorrente {
    private String tipoconta; 
    private String titular;
    private float saldo;
    public int numconta;
    private boolean status;
    
    public ContaCorrente(){
        this.status = false;
        this.saldo = 0;
    }
    
    public void saque(float valor_saque){
        System.out.println("Digite o valor do saque: "+valor_saque);
        this.saldo = this.saldo - valor_saque;
        
    }
    public void deposito(float valor_deposito){
        this.saldo= this.saldo+valor_deposito;
        
    }
    
    public void abrir_conta(String t){
        setTipoconta(t);
        this.status = true;
        System.out.println("Conta aberta...");
    }
    public void fechar_conta(){
        this.status = false;
        System.out.println("Conta fechada...");
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
