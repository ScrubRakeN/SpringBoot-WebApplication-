package br.com.firstproject.beans;

import java.util.Calendar;
import javax.persistence.*;


@Entity
@Table(name="tb_snacks")
public class Snacks {
	
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	
	@Column(name="name", unique=true, nullable=false, length=50)
	private String name;
	
	@Column(name="price", nullable=false)
	private double price;
	
	@Column(name="quantity", nullable=false)
	private int quntity;
	
	@Column(name="expiration_date", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar expirationDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuntity() {
		return quntity;
	}

	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}

}
