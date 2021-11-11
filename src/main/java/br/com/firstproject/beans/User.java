package br.com.firstproject.beans;

import java.util.Calendar;

import javax.persistence.*;


@Entity
@Table(name="tb_user")
public class User {

	public Calendar getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int Id;
	
	@Column(name="name", unique=true, nullable=false, length=50)
	private String name;
	
	@Column(name="email", unique=true, nullable=false, length=50)
	private String email;
	
	@Column(name="password", unique=true, nullable=false, length=50)
	private String password;

	@Column(name="birthdate", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar birthdate;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
