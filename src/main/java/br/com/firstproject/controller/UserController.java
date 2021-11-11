package br.com.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.firstproject.beans.User;
import br.com.firstproject.dao.UserDAO;

@RestController
public class UserController {
	
	@Autowired
	private UserDAO dao;

	@GetMapping("/user")
	public ResponseEntity<List <User>> getAll(){
		List<User> list = (List<User>) dao.findAll();
		if(list.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(list);
	}
	
}
