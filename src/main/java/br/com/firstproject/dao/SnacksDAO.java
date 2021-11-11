package br.com.firstproject.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.firstproject.beans.Snacks;

public interface SnacksDAO extends CrudRepository<Snacks, Integer>{

}
