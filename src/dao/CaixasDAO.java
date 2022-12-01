package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Caixas;
import java.util.logging.Logger;
import java.util.logging.Level;

public class CaixasDAO {

    private Connection connection;

    int idCaixa;
    int idCliente;
    int idProduto;
    String nomeProduto;
    int quantidade;
    String dataVenda;
    double valorUnitario;
    double valorTotal;

    public CaixasDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Caixas caixa) {
        String sql = "INSERT INTO caixas (idCliente, idProduto, nomeProduto, quantidade, dataVenda, valorSub, valorTotal) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, caixa.getIdCliente());
            stmt.setInt(2, caixa.getIdProduto());
            stmt.setString(3, caixa.getNomeProduto());
            stmt.setInt(4, caixa.getQuantidade());
            stmt.setString(5, caixa.getDataVenda());
            stmt.setDouble(6, caixa.getValorUnitario());
            stmt.setDouble(7, caixa.getValorTotal());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void update(Caixas caixa) {
        String sql = "UPDATE caixas SET nomeProduto = ?, quantidade = ?, dataVenda = ?, valorSub = ?, valorTotal = ? WHERE idCaixas = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, caixa.getNomeProduto());
            stmt.setInt(2, caixa.getQuantidade());
            stmt.setString(3, caixa.getDataVenda());
            stmt.setDouble(4, caixa.getValorUnitario());
            stmt.setDouble(5, caixa.getValorTotal());
            stmt.setInt(6, caixa.getIdCaixa());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public void delete(Caixas caixa) {
        String sql = "DELETE FROM caixas WHERE idCaixas = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, caixa.getIdCliente());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
        }
    }
    public List<Caixas> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 

        List<Caixas> caixas = new ArrayList<>(); 
        try {
            stmt = connection.prepareStatement("SELECT * FROM caixas");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Caixas caixa = new Caixas();
                caixa.setIdCaixa(rs.getInt("idCaixas"));
                caixa.setIdCliente(rs.getInt("idCliente"));
                caixa.setIdProduto(rs.getInt("idProduto"));
                caixa.setNomeProduto(rs.getString("nomeProduto"));
                caixa.setQuantidade(rs.getInt("quantidade"));
                caixa.setDataVenda(rs.getString("dataVenda"));
                caixa.setValorUnitario(rs.getDouble("valorSub"));
                caixa.setValorTotal(rs.getDouble("valorTotal"));
                caixas.add(caixa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //ConnectionFactory.closeConnection(connection, stmt,rs);
        }
        return caixas;
    }
}
