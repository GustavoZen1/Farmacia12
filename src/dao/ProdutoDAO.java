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
    String marcaProduto;
    double valorProduto;
    int quantidadeProduto;

    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public ResultSet listarComboBox() {
        connection = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM produto ORDER BY nomeProduto;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            return stmt.executeQuery();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
            return null;
        }

    }

    public void adiciona(Produto produto) {
        String sql = "INSERT INTO produto (nomeProduto, marcaProduto, valorProduto, quantidadeProduto) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getMarcaProduto());
            stmt.setDouble(3, produto.getValorProduto());
            stmt.setInt(4, produto.getQuantidadeProduto());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void update(Produto produto) {
        String sql = "UPDATE produto SET nomeProduto = ?, marcaProduto = ?, valorProduto = ?, quantidadeProduto = ? WHERE idProduto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getMarcaProduto());
            stmt.setDouble(3, produto.getValorProduto());
            stmt.setInt(4, produto.getQuantidadeProduto());
            stmt.setInt(5, produto.getIdProduto());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void updateQuantidade(Produto produto) {
        String sql = "UPDATE produto SET quantidadeProduto = ? WHERE idProduto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produto.getQuantidadeProduto());
            stmt.setInt(2, produto.getIdProduto());
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
                produto.setMarcaProduto(rs.getString("marcaProduto"));
                produto.setValorProduto(rs.getInt("valorProduto"));
                produto.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
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
