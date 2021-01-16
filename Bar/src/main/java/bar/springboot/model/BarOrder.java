package bar.springboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class BarOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String productName;
	
	private Double price;
	
	private String barClient;
	
	private Date placedAt;

	@PrePersist
    void placedAt() {
        this.placedAt = new Date();
    }
	
	public BarOrder() {
		
	}
	
	public BarOrder(String productName, Double price, String client) {
		super();
		this.productName = productName;
		this.price = price;
		this.barClient = barClient;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBarClient() {
		return barClient;
	}

	public void setBarClient(String barClient) {
		this.barClient = barClient;
	}

	public Date getPlacedAt() {
		return placedAt;
	}

	public void setPlacedAt(Date placedAt) {
		this.placedAt = placedAt;
	}
	
	
}
