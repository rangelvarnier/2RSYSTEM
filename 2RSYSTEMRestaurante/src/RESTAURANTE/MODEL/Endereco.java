
package RESTAURANTE.MODEL;

public class Endereco {
    private Integer codigo;
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String telefone;
    private String celular;
    private String email;
    private Cidade cidade_codigo;

    public Endereco() {
    }
    
    public Endereco(Integer codigo, String rua, String numero, String cep, String bairro, String telefone, String celular, String email, Cidade cidade_codigo) {
        this.codigo = codigo;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.cidade_codigo = cidade_codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cidade getCidade_codigo() {
        return cidade_codigo;
    }

    public void setCidade_codigo(Cidade cidade_codigo) {
        this.cidade_codigo = cidade_codigo;
    }
    
    
    
}
