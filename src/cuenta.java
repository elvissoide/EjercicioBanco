public class cuenta {
    String titular;
    double saldo;
    public cuenta(String nombre, double cantidad){
        this.titular = nombre;
        this.saldo = cantidad;
    }
    public void depositar(double montoPorDepositar){
        if (montoPorDepositar > 0.0){
            saldo += montoPorDepositar;
        }
    }

    public void retirar(double montoPorRetirar){
        if (montoPorRetirar < saldo){
            saldo -= montoPorRetirar;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
