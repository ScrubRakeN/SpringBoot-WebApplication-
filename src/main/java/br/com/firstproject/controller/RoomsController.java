package br.com.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.firstproject.beans.Rooms;
import br.com.firstproject.dao.RoomsDAO;

@RestController
public class RoomsController {
	@Autowired
	private RoomsDAO dao;

	@GetMapping("/rooms")
	public ResponseEntity<List <Rooms>> getAll(){
		List<Rooms> list = (List<Rooms>) dao.findAll();
		if(list.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(list);
	}

}
