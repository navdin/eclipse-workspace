package org.dine.javaprojects.messenger.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.dine.javaprojects.messenger.Message;

@Entity
public class Sim {

    public Sim(){
		
	}
	
	
	
	Sim(long simNumber, List<Message> msgList){
		this.simNumber=simNumber;
		this.msgList=msgList;
	}
	
	@Id
	long simNumber;
	
	
	@ManyToMany//(mappedBy="toSimList")
	@Transient
	List<Message> msgList;

	public long getSimNumber() {
		return simNumber;
	}

	public void setSimNumber(long simNumber) {
		this.simNumber = simNumber;
	}

	public List<Message> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<Message> msgList) {
		this.msgList = msgList;
	}
	
}
