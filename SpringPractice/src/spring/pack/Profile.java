package spring.pack;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Profile implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	Profile(){
		
	}
	Profile(long simNumber, Date generatedOn, String name){
		this.simNumber=simNumber;
		this.generatedOn=generatedOn;
		this.name=name;
	}
		@Id
		 long simNumber;
		@Id
		 Date generatedOn;
		 String name;
		
		
		public Date getGeneratedOn() {
			return generatedOn;
		}
		public void setGeneratedOn(Date generatedOn) {
			this.generatedOn = generatedOn;
		}
		public long getSimNumber() {
			return simNumber;
		}
		public void setSimNumber(long simNumber) {
			this.simNumber = simNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}

