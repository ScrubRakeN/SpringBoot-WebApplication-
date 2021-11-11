package br.com.firstproject.beans;

import javax.persistence.*;

@Entity
@Table(name="tb_rooms")
public class Rooms {

	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	
	@Column(name="sector", nullable=false)
	private char sector;
	
	@Column(name="number", nullable=false)
	private int number;
	
	@Column(name="capacity", nullable=false)
	private int capacity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getSector() {
		return sector;
	}

	public void setSector(char sector) {
		this.sector = sector;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
