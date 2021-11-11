package br.com.firstproject.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.firstproject.beans.Films;

public interface FilmsDAO extends CrudRepository<Films, Integer>{

}
