/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoprogdesc;
 import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class OSControler {

     String nome;
     String telefone;
     String endereco;
     String marca;
     String modelo;
     String ano;
     String placa;

    public boolean salvarDadosCliente(String nome, String telefone, String endereco) {
        if (nome.isEmpty() || telefone.isEmpty() || endereco.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos do cliente.", "Aviso", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            return true;
        }
    }
    public boolean salvarDadosVeiculo(String marca, String modelo, String ano, String placa) {
        if (marca.isEmpty() || modelo.isEmpty() || ano.isEmpty() || placa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos do veículo.", "Aviso", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.placa = placa;
            return true;
        }
    }

    // Método para obter os dados do cliente
    public String[] obterDadosCliente() {
        return new String[]{nome, telefone, endereco};
    }

    // Método para obter os dados do veículo
    public String[] obterDadosVeiculo() {
        return new String[]{marca, modelo, ano, placa};
    }
    }

