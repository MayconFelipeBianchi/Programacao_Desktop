/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoprogdesc;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Controller {
    private static Controller instancia;

    private ArrayList<ClassCliente>listaCliente;
    private ArrayList<ClassPecas>listaPecas;
    private ArrayList<ClassServico>listarServico;
    
    public static Controller getInstance(){
        if(instancia == null) {
            return instancia = new Controller();
        }else {
            return instancia;
        }
    }
    
    
    private Controller(){
        listaCliente = new ArrayList<>();
        listaPecas = new ArrayList<>();
        listarServico = new ArrayList<>();
    }

    public void salvarCliente(ClassCliente cliente){
        listaCliente.add(cliente);
    }
    public ArrayList<ClassCliente> retornarCliente() {
        return listaCliente;
    }
    
     public void salvarPecas(ClassPecas pecas){
        listaPecas.add(pecas);
    }
     public ArrayList<ClassPecas> retornarPecas() {
        return listaPecas;
    }
     public void salvarServico(ClassServico servico){
        listarServico.add(servico);
    }
     public ArrayList<ClassServico> retornarServico() {
        return listarServico;
    }
    
}
