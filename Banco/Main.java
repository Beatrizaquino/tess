package Banco;
public class Main {
    
    public static void main(String[] args) {
        
    Endereco endereco1 = new Endereco();
      endereco1.bairro = "jardim oliveira";
      endereco1.rua = "joao demetrio";
      endereco1.cidade = "Vilhena";
      endereco1.estado = "RO";
      endereco1.cep = "78319-000";
      endereco1.numero = 1737;

      Endereco endereco2 = new Endereco();
      endereco2.bairro = "jardim Palmeiras";
      endereco2.rua = "joao Vitor";
      endereco2.cidade = "Vilhena";
      endereco2.estado = "RO";
      endereco2.cep = "78319-000";
      endereco2.numero = 1424;

      Cliente cliente1 = new Cliente();
      cliente1.nome = "Beatriz";
      cliente1.endereco = endereco1;
    
      Cliente cliente2 = new Cliente();
      cliente2.nome = "Guilherme";
      cliente2.endereco = endereco2;
    
      Conta conta1 = new Conta();
      conta1.numero = 12345;
      conta1.cliente = cliente1;
      conta1.saldo = 1326.88;

      Conta conta2 = new Conta();
      conta2.numero = 67890;
      conta2.cliente = cliente2;
      conta2.saldo = 3456.88;

        System.out.println("Beatriz - saldo " + conta1.getSaldo());
        conta1.saque(340.00);
        System.out.println("Saldo da conta 1 após saque de 200.00: " + conta1.getSaldo());
        conta1.deposito(450.00);
        System.out.println("Saldo da conta 1 após depósito de 500.00: " + conta1.getSaldo());

        System.out.println("Guilherme - saldo " + conta2.getSaldo());
        conta2.transferencia(118.00);
        conta2.saque(34.00);
        System.out.println("Saldo da conta 1 após saque de 200.00: " + conta2.getSaldo());
        conta2.deposito(50.00);
        System.out.println("Saldo da conta 1 após depósito de 500.00: " + conta2.getSaldo());
    }

}
