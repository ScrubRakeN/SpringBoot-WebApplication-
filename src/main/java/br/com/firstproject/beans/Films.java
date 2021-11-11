package br.com.firstproject.beans;


import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="tb_films")
public class Films {
	
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	
	@Column(name="name", nullable=false, unique=true, length=50)
	private String name;
	
	@Column(name="genre", nullable=false, length=50)
	private String genre;
	
	@Column(name="sinopsys", nullable=false, length=200)
	private String sinopsys;
	
	@Column(name="release_date", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar releaseDate;
	
	@Column(name="nationality", nullable=false, length=50)
	private String nationality;

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Calendar getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

}
