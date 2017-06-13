package BankApplication;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Stateless
public class CustomerManager {

	
	private EntityManagerFactory emf;
	
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
}
