package microservices.book.multiplicacion.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import microservices.book.multiplicacion.model.Employee;


@Component
public class OracleEmployeeDAO implements EmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Employee getEmployeeById(int id) {
		Session session = sessionFactory.openSession();
		Employee e = session.get(Employee.class, id);
		return e;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session = sessionFactory.openSession();
		List<Employee> employees = session.createQuery("FROM Employee",Employee.class)
				                   .list();
		return employees;
	}

	@Override
	public int deleteEmployee(int id) {
		Session session = sessionFactory.openSession();
		Employee e = session.get(Employee.class, id);
		int idEmployee = -1;
		if(e != null) {
			session.beginTransaction();
			session.delete(e);
			session.getTransaction().commit();
			idEmployee = e.getEmployeeId();
		}
		return idEmployee;
	}

	@Override
	public int insertEmployee(Employee employee) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Object result = session.save(employee);
		session.getTransaction().commit();
		
		return (Integer)result;
	}

}
