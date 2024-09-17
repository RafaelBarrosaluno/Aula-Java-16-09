package sistema_exemplo;

import java.util.Date;

public class Main{
    Cliente2 cliente = new Produto2(1, "Robertinho", "RG", 3456789, 999999, "Rua A", "Bairro", "Guarulhos", "SP", "SP", "SP", 65, "23453455345", 46, "34633", "(11)09090909",  "email@emauil.com", 1, new Date());
    
    cliente.efetuaPedido();
    cliente.efetuaPagamento();
    cliente.cadastraCliente();
    cliente.excluiCliente();
    cliente.alteraDados();
    cliente.consultaDados();
}