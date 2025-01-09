package entidades;


public class Conta {
    
    private int numeroConta;
    private String name;
    private double saldo;

    public Conta(){
        
    }
    
    public Conta(int numeroConta, String name) {
        this.numeroConta = numeroConta;
        this.name = name;
    }
     
    public Conta(int numeroConta, String name, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.name = name;
        deposito(saldoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDeposito){
         saldo += valorDeposito;
    }
    
    public void saque(double valorSaque){
         saldo -= valorSaque + 5.00;
    }
    
    public String toString(){
        return "Account: "
               + numeroConta 
               + ", Holder: "
               + name
               + ", Balance: $ "
               + String.format("%.2f", saldo);
    }
}
