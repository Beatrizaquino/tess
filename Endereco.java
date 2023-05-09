public class Endereco {
    
    public String bairro;
    public String rua;
    public String cidade;
    public String estado;
    public String cep;
    public int numero;


    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String bairro){
        bairro = this.bairro;
    }
    public String getRua(){
        return this.rua;
    }

    public void setRua(String rua){
        rua = this.rua;
    }
    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade){
        cidade = this.cidade;
    }
    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        estado = this.estado;
    }
    public String getCep(){
        return this.estado;
    }

    public void setCep(String cep){
        cep = this.cep;
    }
    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        numero = this.numero;
    }
}
