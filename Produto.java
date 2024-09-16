package sistema_exemplo;

import java.util.Date;

public class Produto2{
    private int idProduto;
    private String descProd;
    private String unProd;
    private String valProd;
    private Date vencProd;
    private Int statusProd;
    private Date dataCadProd;

        //constructor (mesmo que o setter mas de uma só vez):
    public Produto2 (int idProduto, String descProd, String unProd, String valProd, String valProd, Date vencProd, int, statusProd, Date dataCadProd){
        this.idProduto = idProduto;
        this.descProd = descProd;
        this.unProd = unProd;
        this.valProd = valProd;
        this.vencProd = vencProd;
        this.statusProd = statusProd;
        this.dataCadProd = dataCadProd;
    }
        //getters and setters:
    public int getidProduto(){
        return idProduto;
    }
    public void setidProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getdescProd(){
        return descProd;
    }
    public void setdescProd(String descProd) {
        this.descProd = descProd;
    }

    public String getunProd(){
        return unProd;
    }
    public void setunProd(String unProd) {
        this.unProd = unProd;
    }

    public String getvalProd(){
        return valProd;
    }
    public void setvalProd(String valProd) {
        this.valProd = valProd;
    }
    
    public Date getvencProd(){
        return vencProd;
    }
    public void setvencProd(Date vencProd) {
        this.vencProd = vencProd;
    }

    public Int getstatusProd(){
        return statusProd;
    }
    public void setstatusProd(Int statusProd) {
        this.statusProd = statusProd;
    }

    public Date getdataCadProd(){
        return dataCadProd;
    }
    public void setdataCadProd(Date dataCadProd) {
        this.dataCadProd = dataCadProd;
    }
        //Metodos:
    public void incluir_Produto(){
        System.out.println("Produto incluso!");
    }
    public void desativar_Produto(){
        System.out.println("Produto desativado!");
    }
    public void alterar_Porduto(){
        System.out.println("Produto alterado!");
    }
    public void consultar_Produto(){
        System.out.println("Detlahes do produto");
    }
 }