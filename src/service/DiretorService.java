package service;

import model.Diretor;
import util.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DiretorService {

    public static void save(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement insert = conn.prepareStatement("insert into diretor values(?,?,?,?,?)");
        insert.setInt(1, diretor.getId());
        insert.setString(2, diretor.getNome());
        insert.setString(3, diretor.getCpf());
        insert.setDouble(4, diretor.getSalario());
        insert.setDouble(5, diretor.getBonus());
        insert.executeUpdate();
        conn.close();
    }

    public static void update(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE diretor SET nome = ?, cpf = ?, salario = ?,bonus = ? WHERE id = ?");
        update.setString(1, diretor.getNome());
        update.setString(2, diretor.getCpf());
        update.setDouble(3, diretor.getSalario());
        update.setDouble(4, diretor.getBonus());
        update.setInt(5, diretor.getId());
        update.executeUpdate();
        conn.close();
    }

    public static void delete(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM diretor WHERE ID = ?");
        statement2.setInt(1, diretor.getId());
        statement2.executeUpdate();
        conn.close();
    }
}
