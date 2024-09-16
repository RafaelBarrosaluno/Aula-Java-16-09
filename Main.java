package sistema_exemplo;

import java.util.Date;

public class Main{
    Produto2 produto = new Produto2(1, "Pera", "Kg", "R$ 4,50", new Date(), 1, Date());
    Estoque estoque = new Estoque(produto,1);

    produto.incluir_Produto();
    estoque.Atualizar_estoque();
    produto.alterar_Porduto();
    produto.desativar_Produto();
    produto.consultar_Produto();
}