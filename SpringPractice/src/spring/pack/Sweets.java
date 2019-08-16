package spring.pack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sweets {

	Sweets(int custId, String name, int percent, int stock, int taken){
		this.custId=custId;
		this.name=name;
		this.percent=percent;
		this.stock=stock;
		this.taken=taken;
	}
	
	private int custId;
	@Id
	private String name;
	private int percent;
	private int stock;
	private int taken;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getTaken() {
		return taken;
	}
	public void setTaken(int taken) {
		this.taken = taken;
	}
	
	
}
