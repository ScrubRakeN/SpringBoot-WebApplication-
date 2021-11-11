package br.com.firstproject.beans;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_beverages")
public class Beverages {
	
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	
	@Column(name="name", nullable=false, unique=true)
	private String name;
	
	@Column(name="label", nullable=false)
	private String label;
	
	@Column(name="size", nullable=false)
	private double size;
	
	@Column(name="purchase_date")
	@CreationTimestamp()
	private Date purchaseDate;
	
	@Column(name="expiration_date")
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Calendar getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Calendar expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
}
