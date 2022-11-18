/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author robso
 */
public class Venda {
    private int codVenda;
    private int numeroVenda;
    private double valorTotalVenda;
    private Date dataVenda;    
    private ArrayList<ItemVenda> listaProdutos = null;
    
    public Venda(){
        
    }
    
    public Venda(int codVenda, int numeroVenda, double valorTotalVenda){
        this.codVenda = codVenda;
        this.numeroVenda = numeroVenda;
        this.valorTotalVenda = valorTotalVenda;
    }
    
    public ArrayList<ItemVenda> getListaProdutos(){
        return listaProdutos;
    }
    
    public void setListaProdutos(ArrayList<ItemVenda> novoListaProdutos){
        this.listaProdutos = novoListaProdutos;
    }
    
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public int getCodVenda(){
        return codVenda;
    }
    
    public void setCodVenda(int novoCodVenda){
        this.codVenda = novoCodVenda;
    }
    
    public int getNumeroVenda(){
        return numeroVenda;
    }
    
    public void setNumeroVenda(int novoNumeroVenda){
        this.numeroVenda = novoNumeroVenda;
    }
    
    public double getValorTotalVenda(){
        return valorTotalVenda;
    }
    
    public void setValorTotalVenda(double novoValorTotalVenda){
        this.valorTotalVenda = novoValorTotalVenda;
    }
}
