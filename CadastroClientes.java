    

package com.mycompany.cadastroclientes;

import java.util.Scanner;


public class CadastroClientes {

    public static void main(String[] args) {
        
         DoublyLinkedList gerenciador = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        // Adicionando clientes
        gerenciador.adicionarCliente(new Cliente(1, "João", "joao@gmail.com", "123456789"));
        gerenciador.adicionarCliente(new Cliente(2, "Maria", "maria@gmail.com", "987654321"));

        // Verificando clientes
        gerenciador.verificarCliente(1); // Cliente existe
        gerenciador.verificarCliente(3); // Cliente não cadastrado

        // Atualizando cliente com input do usuário
        System.out.print("Informe o código do cliente a ser atualizado: ");
        int codigoAtualizar = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha
        gerenciador.atualizarCliente(codigoAtualizar);

        // Removendo cliente com input do usuário
        System.out.print("Informe o código do cliente a ser removido: ");
        int codigoRemover = scanner.nextInt();
        gerenciador.removerCliente(codigoRemover);

        // Verificando remoção
        System.out.print("Verifique novamente o código do cliente removido: ");
        int codigoVerificar = scanner.nextInt();
        gerenciador.verificarCliente(codigoVerificar);

        // Exibindo dados do cliente com input do usuário
        System.out.print("Informe o código do cliente para exibir os dados: ");
        int codigoExibir = scanner.nextInt();
        gerenciador.exibirDadosCliente(codigoExibir);

        scanner.close();



    }
}
