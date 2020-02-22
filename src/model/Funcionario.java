
package model;


public class Funcionario {
    /*
    *ATRIBUTOS DO FUNCIONARIO
    */
    private int id;
    private String nome;
    private String nomeUsual;
    private String dataContradado;
    private String endereco;
    private String bairro;
    private String uf;
    private String cidade;
    private String email;
    private double comissao;
    private int celularUm;
    private int celularDois;
    private int cep;
    private double salario;
    private int cpf;
    private int rg;
    private int permissao;
    
    private String usuario;
    private String senha;


    
    /*
    * CONSTRUTORES
    */

    public Funcionario(int id, String nome, int cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

      /*
    CONSTRUTOR DE TESTE
    */
    public Funcionario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    
    
    /*
    *   GETTERS E SETTERS
    */
    
    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsual() {
        return nomeUsual;
    }

    public void setNomeUsual(String nomeUsual) {
        this.nomeUsual = nomeUsual;
    }

    public String getDataContradado() {
        return dataContradado;
    }

    public void setDataContradado(String dataContradado) {
        this.dataContradado = dataContradado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getCelularUm() {
        return celularUm;
    }

    public void setCelularUm(int celularUm) {
        this.celularUm = celularUm;
    }

    public int getCelularDois() {
        return celularDois;
    }

    public void setCelularDois(int celularDois) {
        this.celularDois = celularDois;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    

}
