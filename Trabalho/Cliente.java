package work;

public class Cliente {
   
    private int idCliente;
    private String nomeCli;
    private TipoDocumento tipoDocumento;
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
    private String dataCadCli;

   
    public void efetuaPedido() {
    	System.out.println("O " + nomeCli + " Cliente efetua um pedido ");
    }

    
    public void efetuaPagamento() {
    	System.out.println("O " + nomeCli + " efetuou o pagamento ");
    }

   
    public void cadastraCliente() {
    	System.out.println("O " + nomeCli + " foi cadastrado ");
    }

   
    public void excluiCliente() {
    	System.out.println("O " + nomeCli + " foi excluido ");
    }

   
    public void alteraDados() {
    	System.out.println("O " + nomeCli + " alterou os seus dados ");
    }

    
    public void consultaDados() {
    	System.out.println("O " + nomeCli + " consultou o seus dados  ");
    }

   
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

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
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

    public String getDataCadCli() {
        return dataCadCli;
    }

    public void setDataCadCli(String dataCadCli) {
        this.dataCadCli = dataCadCli;
    }
}


enum TipoDocumento {
    CPF,
    CNPJ,
    RG
}