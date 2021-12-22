public class Conta {
    // definição de atributos
    private double saldo = 0;

    public void setSaldo(double vSaldo) {
    }

    public double getSaldo() {
    }

    public void sacar(double vValor) {
        if (vValor > saldo)
            System.our.println("saldo insuficiente");
        else
            saldo = saldo - vValor;
    }
}
