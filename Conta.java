public class Conta {
    private String nome;
    private String tipoConta;
    private double saldo;

    public Conta(){
        this.saldo = 0;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transfere(double valor) {
        if (saldo < valor){
            System.out.println("SALDO INSUFICIENTE");
        } else {
            saldo -= valor;
            System.out.println("Saldo atualizado: " + getSaldo());
        }
    }

    public void deposita(double valor) {
        saldo += valor;
        System.out.println("Saldo atualizado: " + getSaldo());
    }
}
