/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cirstal.projetoloja.dao;

import static com.cirstal.projetoloja.dao.ClienteDAO.login;
import static com.cirstal.projetoloja.dao.ClienteDAO.senha;
import static com.cirstal.projetoloja.dao.ClienteDAO.url;
import com.cristal.projetoloja.model.Cliente;
import com.cristal.projetoloja.model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe para implementar no banco de dados do objetos do tipo relatório
 * @author robson.vlima3
 */
public class RelatorioDAO {
    
    /**
     * Url para consulta no banco de dados
     */
    public static String url = "jdbc:mysql://localhost:3306/lojacristal";

    /**
     * Login para acesso ao banco de dados
     */
    public static String login = "root";

    /**
     * Senha para acesso ao banco de dados Senha usada nos computadores do senac - > P@$$w0rd
     */
    public static String senha = "";
    
    /**
     * Método para listar o relatório Sintético do banco de dados
     * @param obj
     * @return
     */
    public static ArrayList<Relatorio> listarSintetico(Relatorio obj){
        Connection conexao;
        ArrayList<Relatorio> listaRelatorio = new ArrayList<Relatorio>();
                
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT cod_Venda, dataVenda, Cliente.nome, valorTotal FROM Venda inner join Cliente on Venda.cod_Cliente = Cliente.cod_Cliente where dataVenda>=? AND dataVenda<=?");
            comandoSQL.setDate(1, new java.sql.Date(obj.getDataEntrada().getTime()));
            comandoSQL.setDate(2, new java.sql.Date(obj.getDataSaida().getTime()));
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Relatorio relatorio = new Relatorio();
                    relatorio.setCodVenda(rs.getInt("cod_Venda"));
                    relatorio.setDataVenda(rs.getDate("dataVenda"));
                    relatorio.setNomeCliente(rs.getString("Cliente.nome"));
                    relatorio.setValorTotal(rs.getDouble("valorTotal"));
                    
                    listaRelatorio.add(relatorio);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaRelatorio;
    }
    
    /**
     * Método para listar o relatório Analitico e atualizar a quantidade do produto no banco de dados
     * @param obj
     * @return
     */
    public static ArrayList<Relatorio> listarAnalitico(Relatorio obj){
        Connection conexao;
        ArrayList<Relatorio> listaRelatorio = new ArrayList<Relatorio>();
                
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT Produto.descricao, quantidadeProduto,valorUnitProduto from itemVenda inner join Produto on itemVenda.cod_Produto = Produto.cod_produto where cod_Venda=?");
            comandoSQL.setInt(1, obj.getCodVenda());
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Relatorio relatorio = new Relatorio();
                    relatorio.setDescricaoProduto(rs.getString("Produto.descricao"));
                    relatorio.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                    relatorio.setValorUnitario(rs.getDouble("valorUnitProduto"));
                    
                    listaRelatorio.add(relatorio);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaRelatorio;
    }
}
