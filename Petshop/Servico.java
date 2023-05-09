package Petshop;
public class Servico {

    public Cliente cliente;
    public String descricao;
    public double valor;
    public Animal animal;
    
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente( Cliente cliente){
        cliente = this.cliente;
    }

    public String getdescricao(){
        return this.descricao;
    }
    public void setDescricao( String descricao){
        descricao = this.descricao;
    }

    public double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        valor = this.valor;
    }

    public Animal getAnimal(){
        return this.animal;
    }
    public void setAnimal( Animal animal){
        animal = this.animal;
    }
}
