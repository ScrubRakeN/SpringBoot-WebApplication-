package br.com.firstproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.firstproject.beans.Beverages;

public interface BeveragesDAO extends CrudRepository<Beverages, Integer>{
	
}