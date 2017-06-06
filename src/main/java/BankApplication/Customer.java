package BankApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	private Integer customerId;
	private Integer ssn;
	private String username;
	private String password;
	private String name;
	private String address;
	
	
	public Customer(){}
	
	public Customer(Integer customerId, Integer ssn, String username, String password, String name, String address){
		this.customerId=customerId;
		this.ssn=ssn;
		this.username=username;
		this.password=password;
		this.name=name;
		this.address=address;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getCustomerId(){
		return this.customerId;
	}
	
	public Integer getSsn(){
		return this.ssn;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public String getPassword(){
		return this.password;
	}
	public String getName(){
		return this.name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setSsn(Integer ssn){
		this.ssn=ssn;
	}
	
	public void setUsername(String userName){
		this.username=userName;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public void setAddress(String address){
		this.address=address;
	}

	
}
