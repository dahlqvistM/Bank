package BankApplication;

import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.PersistenceContext;
import javax.persistence.*;

import BankApplication.Customer;


@Stateless
public class CustomerManager {

    @PersistenceContext(unitName = "bank")
	private EntityManagerFactory emf;
	//private EntityManager em;

	
	private EntityManager getEntityManager(){
		if (emf == null){
			emf = Persistence.createEntityManagerFactory("bank");
		}
		return emf.createEntityManager();
	}

	public Customer getCustomer(int customerId){
		EntityManager em = getEntityManager();
		return em.find(Customer.class, customerId);
	}
	
	public String getCustomerName(int customerId){
		EntityManager em = getEntityManager();
		Customer cust = em.find(Customer.class, customerId);
		return cust.getName();
	}
	
	public Customer setCustomer(int ssn, String username, String password, String name, String address){
		EntityManager em = getEntityManager();
		Customer customer = new Customer(ssn,username,password,name,address);
		/*customer.setSsn(ssn);
		customer.setUsername(username);
		customer.setPassword(password);
		customer.setName(name);
		customer.setAddress(address);*/
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		return customer;
	}
}
