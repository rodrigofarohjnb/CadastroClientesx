/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroclientes;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class DoublyLinkedList {
    
    
      private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Método para adicionar um cliente ao final da lista
    public void adicionarCliente(Cliente cliente) {
        Node newNode = new Node(cliente);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Método para remover um cliente pelo código e exibir mensagem de confirmação ou erro
    public void removerCliente(int codigo) {
        Node current = head;
        while (current != null) {
            if (current.cliente.getCodigo() == codigo) {
                // Exibir os dados do cliente removido
                System.out.println("Cliente removido: " + current.cliente);

                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Cliente não encontrado.");
    }

    // Método para atualizar um cliente pelo código com dados inseridos pelo usuário
    public void atualizarCliente(int codigo) {
        Scanner scanner = new Scanner(System.in);
        Node current = head;
        while (current != null) {
            if (current.cliente.getCodigo() == codigo) {
                System.out.print("Informe o novo nome: ");
                String nome = scanner.nextLine();
                System.out.print("Informe o novo email: ");
                String email = scanner.nextLine();
                System.out.print("Informe o novo telefone: ");
                String telefone = scanner.nextLine();

                current.cliente.setNome(nome);
                current.cliente.setEmail(email);
                current.cliente.setTelefone(telefone);

                System.out.println("Dados do cliente atualizados com sucesso.");
                return;
            }
            current = current.next;
        }
        System.out.println("Cliente não encontrado.");
    }

    // Método para buscar um cliente pelo código
    public Cliente buscarCliente(int codigo) {
        Node current = head;
        while (current != null) {
            if (current.cliente.getCodigo() == codigo) {
                return current.cliente;
            }
            current = current.next;
        }
        return null;
    }

    // Método para verificar a existência de um cliente
    public void verificarCliente(int codigo) {
        Cliente cliente = buscarCliente(codigo);
        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não cadastrado.");
        }
    }

    // Método para exibir os dados de um cliente pelo código
    public void exibirDadosCliente(int codigo) {
        Cliente cliente = buscarCliente(codigo);
        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
    
}
