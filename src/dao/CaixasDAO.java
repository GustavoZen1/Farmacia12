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

    int idCaixas;
    int idCliente;
    int idProduto;
    String dataVenda;
    double valorTotal;
    String nomeCliente;
    String formaPagamento;

    public CaixasDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Caixas caixas) {
        String sql = "INSERT INTO caixas (idCliente, idProduto, dataVenda, valorTotal, nomeCliente, formaPagamento ) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, caixas.getIdCliente());
            stmt.setInt(2, caixas.getIdProduto());
            stmt.setString(3, caixas.getDataVenda());
            stmt.setDouble(4, caixas.getValorTotal());
            stmt.setString(5, caixas.getNomeCliente());
            stmt.setString(6, caixas.getFormaPagamento());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void update(Caixas caixas) {
        String sql = "UPDATE caixas SET  dataVenda = ?, valorTotal = ?, formaPagamento WHERE idCaixas = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, caixas.getDataVenda());
            stmt.setDouble(2, caixas.getValorTotal());
            stmt.setString(3, caixas.getFormaPagamento());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public void delete(Caixas caixas) {
        String sql = "DELETE FROM caixas WHERE idCaixas = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, caixas.getIdCaixas());
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
                caixa.setIdCaixas(rs.getInt("idCaixas"));
                caixa.setIdCliente(rs.getInt("idCliente"));
                caixa.setIdProduto(rs.getInt("idProduto"));
                caixa.setDataVenda(rs.getString("dataVenda"));
                caixa.setValorTotal(rs.getDouble("valorTotal"));
                caixa.setFormaPagamento(rs.getString("formaPagamento"));
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
