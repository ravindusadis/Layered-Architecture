package dao;

import db.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class SQLUtil {
    public void test() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();

    }
}
