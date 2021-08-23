package repository;

import util.ConnectionManager;

import javax.sql.RowSetReader;
import java.sql.*;

public class DiretorRepository {

    public static void findAll() throws SQLException, ClassNotFoundException{
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from diretor ");
        ResultSet resultSet =  null;
        resultSet =  statement.executeQuery();

        System.out.println("-----Busca por ID ini----");

        while (resultSet.next()) {
            String index = resultSet.getString(2);
            System.out.println(index);

        }

        System.out.println("-----Busca pot ID fim------");
        conn.close();


    }
    public static void findById(Integer id) throws SQLException, ClassNotFoundException{
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("select * from diretor where id = ?");
        statement3.setInt(1, id);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        System.out.println("-----Listagem Ini.------");
        while (resultSet3.next()) {
           String index = resultSet3.getString(2);
            System.out.println(index);

        }
        System.out.println("-----Listagem Fim...-----");
        conn.close();
    }

}
