package br.com.firstproject.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.firstproject.beans.Rooms;

public interface RoomsDAO extends CrudRepository<Rooms, Integer>{

}
