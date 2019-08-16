package spring.pack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {

	Stock(int stockId, String verse){
		this.stockId=stockId;
		this.verse=verse;
	}
	@Id
	int stockId;
	String verse;
	
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getVerse() {
		return verse;
	}
	public void setVerse(String verse) {
		this.verse = verse;
	}
	
}
