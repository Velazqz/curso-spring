package microservices.book.multiplicacion.factory;

import microservices.book.multiplicacion.dao.EmployeeDAO;

public abstract class DAOFactory {
	
	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	
	public abstract EmployeeDAO getEmployeeDAO();
	
	public static DAOFactory getDAOFactory(int whichFactory) {
		
		DAOFactory daoFactory = null;
		switch(whichFactory){
			case ORACLE:
				daoFactory = new OracleDAOFactory(); break;
			default:
				daoFactory = null;
		}
		return daoFactory;
	}
	
	
}
