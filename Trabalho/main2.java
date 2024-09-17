package trabalho_exemplo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Instancia um objeto da classe Cliente
        Cliente cliente = new Cliente();

        // Define os valores dos atributos
        cliente.setIdCliente(1);
        cliente.setNomeCli("João Silva");
        cliente.setTipoDocumento(TipoDocumento.CPF); // Usando enum para o tipo de documento
        cliente.setCodDocum(123456789);
        cliente.setRgCli(987654321);
        cliente.setEndereco("Rua Exemplo, 123");
        cliente.setBairro("Centro");
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");
        cliente.setCep("01000-000");
        cliente.setDddRes(11);
        cliente.setTelRes("1234-5678");
        cliente.setDddCom(11);
        cliente.setTelCom("8765-4321");
        cliente.setDddCel(11);
        cliente.setTelCel("91234-5678");
        cliente.setEmail("joao.silva@example.com");
        cliente.setStatusCli(1); // Status ativo, por exemplo
        cliente.setDataCadCli(new Date()); // Data atual

        // Exemplo de uso de métodos da classe Cliente
        cliente.cadastraCliente();
        cliente.efetuaPedido();
        cliente.efetuaPagamento();
        cliente.consultaDados();

        // Exibe as informações do cliente
        System.out.println("ID Cliente: " + cliente.getIdCliente());
        System.out.println("Nome: " + cliente.getNomeCli());
        System.out.println("Tipo de Documento: " + cliente.getTipoDocumento());
        System.out.println("Código Documento: " + cliente.getCodDocum());
        System.out.println("RG: " + cliente.getRgCli());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Bairro: " + cliente.getBairro());
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("Estado: " + cliente.getEstado());
        System.out.println("CEP: " + cliente.getCep());
        System.out.println("Telefone Residencial: (" + cliente.getDddRes() + ") " + cliente.getTelRes());
        System.out.println("Telefone Comercial: (" + cliente.getDddCom() + ") " + cliente.getTelCom());
        System.out.println("Celular: (" + cliente.getDddCel() + ") " + cliente.getTelCel());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Status: " + (cliente.getStatusCli() == 1 ? "Ativo" : "Inativo"));
        System.out.println("Data de Cadastro: " + cliente.getDataCadCli());
    }
}