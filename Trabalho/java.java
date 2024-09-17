package sistema_exemplo;

import java.util.Date;

public class Cliente2 {
    // Atributos privados
    private int idCliente;
    private String nomeCli;
    private String tipoDocumento;
    private int codDocum;
    private int rgCli;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private int dddRes;
    private String telRes;
    private int dddCom;
    private String telCom;
    private int dddCel;
    private String telCel;
    private String email;
    private int statusCli;
    private Date dataCadCli;

    // Método para efetuar pedido
    public void efetuaPedido() {
        System.out.println("Efetuando pagamento...");
        // Implementação aqui
    }

    // Método para efetuar pagamento
    public void efetuaPagamento() {
        System.out.println("Pagamento efetuado!");
    }

    // Método para cadastrar cliente
    public void cadastraCliente() {
       System.out.println("Cliente cadastrado :)");
    }

    // Método para excluir cliente
    public void excluiCliente() {
        System.out.println("Cliente excluido :(");
    }

    // Método para alterar dados do cliente
    public void alteraDados() {
        System.out.println("Dados alterados!");
    }

    // Método para consultar dados do cliente
    public void consultaDados() {
        System.out.println("Nome do cliente: " + nomeCli);
        System.out.println("ID do Cliente: " + idCliente);
        System.out.println("Tipo de documento: " + tipoDocumento);
        System.out.println("Telefone de contato: " + telCel);
        System.out.println("Cidade do cliente: " + cidade);
        System.out.println("Email cliente: " + email);
        System.out.println("Status: " + statusCli);
        System.out.println("Data: " + (dataCadCli != null ? dataCadCli.toString() : "N/A"));
    }

    // Getters e Setters (opcionais) para acessar e modificar os atributos
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getCodDocum() {
        return codDocum;
    }

    public void setCodDocum(int codDocum) {
        this.codDocum = codDocum;
    }

    public int getRgCli() {
        return rgCli;
    }

    public void setRgCli(int rgCli) {
        this.rgCli = rgCli;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getDddRes() {
        return dddRes;
    }

    public void setDddRes(int dddRes) {
        this.dddRes = dddRes;
    }

    public String getTelRes() {
        return telRes;
    }

    public void setTelRes(String telRes) {
        this.telRes = telRes;
    }

    public int getDddCom() {
        return dddCom;
    }

    public void setDddCom(int dddCom) {
        this.dddCom = dddCom;
    }

    public String getTelCom() {
        return telCom;
    }

    public void setTelCom(String telCom) {
        this.telCom = telCom;
    }

    public int getDddCel() {
        return dddCel;
    }

    public void setDddCel(int dddCel) {
        this.dddCel = dddCel;
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatusCli() {
        return statusCli;
    }

    public void setStatusCli(int statusCli) {
        this.statusCli = statusCli;
    }

    public Date getDataCadCli() {
        return dataCadCli;
    }

    public void setDataCadCli(Date dataCadCli) {
        this.dataCadCli = dataCadCli;
    }
}

public class Main{
    Cliente2 cliente = new Cliente2(1, "Robertinho", "RG", 3456789, 999999, "Rua A", "Bairro", "Guarulhos", "SP", "SP", "SP", 65, "23453455345", 46, "34633", "(11)09090909",  "email@emauil.com", 1, new Date());
    
    cliente.efetuaPedido();
    cliente.efetuaPagamento();
    cliente.cadastraCliente();
    cliente.excluiCliente();
    cliente.alteraDados();
    cliente.consultaDados();
}