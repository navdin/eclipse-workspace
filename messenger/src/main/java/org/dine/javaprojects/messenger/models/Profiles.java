package org.dine.javaprojects.messenger.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Profiles {
		
		@Id
		private int simNumber;
		private String name;
		public int getSimNumber() {
			return simNumber;
		}
		public void setSimNumber(int simNumber) {
			this.simNumber = simNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}


