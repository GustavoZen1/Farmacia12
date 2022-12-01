package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Produto;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ProdutoDAO {

    private Connection connection;

    int idProduto;
    String nomeProduto;
    String bula;
    double valor;
    int quantidade;


    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Produto produto) {
        String sql = "INSERT INTO produto (nomeProduto, bula, valor, quantidade) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getBula());
            stmt.setDouble(3, produto.getValor());
            stmt.setInt(4, produto.getQuantidade());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void update(Produto produto) {
        String sql = "UPDATE produto SET nomeProduto = ?, bula = ?, valor = ?, quantidade = ? WHERE idProduto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getBula());
            stmt.setDouble(3, produto.getValor());
            stmt.setInt(4, produto.getQuantidade());
            stmt.setInt(5, produto.getIdProduto());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void delete(Produto produto) {
        String sql = "DELETE FROM produto WHERE idProduto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
        }
    }
    public List<Produto> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 

        List<Produto> produtos = new ArrayList<>(); 
        try {
            stmt = connection.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setBula(rs.getString("bula"));
                produto.setValor(rs.getInt("valor"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //ConnectionFactory.closeConnection(connection, stmt,rs);
        }
        return produtos;
    }
}
