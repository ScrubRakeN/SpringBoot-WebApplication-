package br.com.firstproject.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.firstproject.beans.User;

public interface UserDAO extends CrudRepository<User, Integer> {
	
}