package modelo;


public class Cliente {
    
    int idCliente;
    String nomeClit;
    String cpf;
    String cep;
    String edereco;
    String telefone;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeClit() {
        return nomeClit;
    }

    public void setNomeClit(String nomeClit) {
        this.nomeClit = nomeClit;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEdereco() {
        return edereco;
    }

    public void setEdereco(String edereco) {
        this.edereco = edereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
