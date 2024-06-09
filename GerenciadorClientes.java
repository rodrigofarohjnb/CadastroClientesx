/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroclientes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class GerenciadorClientes {
    
       private List<Cliente> clientes;

    public GerenciadorClientes() {
        this.clientes = new ArrayList<>();
    }

    // Método para adicionar um cliente
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para remover um cliente
    public void removerCliente(int codigo) {
        Cliente cliente = buscarCliente(codigo);
        if (cliente != null) {
            clientes.remove(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    // Método para atualizar um cliente
    public void atualizarCliente(int codigo, String nome, String email, String telefone) {
        Cliente cliente = buscarCliente(codigo);
        if (cliente != null) {
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    // Método para buscar um cliente pelo código
    public Cliente buscarCliente(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
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
    
    
}

    

