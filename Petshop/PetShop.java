package Petshop;
public class PetShop {

   public static void main(String[] args) {

      Cachorro cachorro = new Cachorro("pitu", "viralata", 9);
      cachorro.cinomose = false;

      Endereco endereco = new Endereco();
      endereco.bairro = "jardim oliveira";
      endereco.rua = "joao demetrio";
      endereco.cidade = "Vilhena";
      endereco.estado = "RO";
      endereco.cep = "78319-000";
      endereco.numero = 1737;

      Cliente cliente  = new Cliente();
      cliente.nome = "Beatriz";
      cliente.idade = 19;
      cliente.endereco = endereco;
      cliente.animal = cachorro; 
      
      Servico servico = new Servico(); 
      servico.cliente = cliente;
      servico.descricao = "Banho e tosa";
      servico.valor = 59.99;
      servico.animal = cachorro;
      

          

   }

}