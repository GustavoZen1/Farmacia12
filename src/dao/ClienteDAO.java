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
    String nomeCliente;
    String cpfCliente;
    String cepCliente;
    String ederecoCliente;
    String telefoneCliente;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente) {
        String sql = "INSERT INTO cliente (NomeCliente, cpfCliente, cepCliente, ederecoCliente, telefoneCliente) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getCpfCliente());
            stmt.setString(3, cliente.getCepCliente());
            stmt.setString(4, cliente.getEderecoCliente());
            stmt.setString(5, cliente.getTelefoneCliente());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ResultSet listarComboBox() {
        connection = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM cliente ORDER BY nomeCliente;";
        String idC = "SELECT * FROM cliente ORDER BY idCliente;";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            return stmt.executeQuery();
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro!");
            return null;
        }
        
    }

    public void update(Cliente cliente) {
        String sql = "UPDATE cliente SET NomeCliente = ?, cpfCliente = ?, cepCliente = ?, ederecocliente = ?, telefoneCliente = ? WHERE idCliente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getCpfCliente());
            stmt.setString(3, cliente.getCepCliente());
            stmt.setString(4, cliente.getEderecoCliente());
            stmt.setString(5, cliente.getTelefoneCliente());
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
                cliente.setNomeCliente(rs.getString("NomeCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setCepCliente(rs.getString("cepCliente"));
                cliente.setEderecoCliente(rs.getString("ederecoCliente"));
                cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
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
