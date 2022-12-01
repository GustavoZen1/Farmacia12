package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ClienteDAO {

    private Connection connection;

    int idCliente;
    String nomeClit;
    String cpf;
    String cep;
    String edereco;
    String telefone;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente) {
        String sql = "INSERT INTO cliente (NomeCliente, cpf, cep, edereco, telefone) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeClit());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getCep());
            stmt.setString(4, cliente.getEdereco());
            stmt.setString(5, cliente.getTelefone());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void update(Cliente cliente) {
        String sql = "UPDATE cliente SET NomeCliente = ?, cpf = ?, cep = ?, edereco = ?, telefone = ? WHERE idCliente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeClit());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getCep());
            stmt.setString(4, cliente.getEdereco());
            stmt.setString(5, cliente.getTelefone());
            stmt.setInt(6, cliente.getIdCliente());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void delete(Cliente cliente) {
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cliente.getIdCliente());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
        }
    }

    public List<Cliente> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 

        List<Cliente> clientes = new ArrayList<>(); 
        try {
            stmt = connection.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeClit(rs.getString("NomeCliente"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEdereco(rs.getString("edereco"));
                cliente.setTelefone(rs.getString("telefone"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //ConnectionFactory.closeConnection(connection, stmt,rs);
        }
        return clientes;
    }
}
