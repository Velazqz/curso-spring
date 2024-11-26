package microservices.book.multiplicacion.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import microservices.book.multiplicacion.dao.EmployeeDAO;
import microservices.book.multiplicacion.dao.OracleEmployeeDAO;


@Component
public class OracleDAOFactory extends DAOFactory{
	private static Connection conn;
	
	@Autowired
	private DataSource datasource;
	
	public Connection createConnection() {
		if(conn == null) {
			try {
				conn = datasource.getConnection();
			} catch (SQLException e) {
				System.out.println("SQLException: " +e.getMessage());
			}
		}
		return conn;
	}

	@Override
	public EmployeeDAO getEmployeeDAO() {
		return new OracleEmployeeDAO();
	}
	
	

}
