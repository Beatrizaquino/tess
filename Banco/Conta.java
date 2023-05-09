package Banco;
public class Conta {
    
    public int numero;
    public Cliente cliente;
    public double saldo;


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque( double valor){
        saldo -= valor;
    }
    public void deposito(double valor) {
        saldo += valor;
    }
    public void transferencia( double valor){
        saldo -= valor;
    }

}
