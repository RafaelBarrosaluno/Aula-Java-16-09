package sistema_exemplo;

public class Estoque{
    private Produto2 produto;
    private Int qtde_Produto;

    public Estoque(Produto produto, Int qtde_Produto){
        this.produto = produto;
        this.qtde_Produto = qtde_Produto;
    }
    public Produto getproduto(){
        return produto;
    }
    public int getqtde_Produto(){
        return qtde_Produto;
    }
    public void setqtde_Produto(int qtde_Produto) {
        this.qtde_Produto = qtde_Produto;
    }


    public void Atualizar_estoque(){
        System.out.println("Estoque atualizado com o Produto! " + produto.getdescProd() + "!!!");
    }
}