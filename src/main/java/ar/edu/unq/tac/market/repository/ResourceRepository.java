package ar.edu.unq.tac.market.repository;

import java.util.List;

public interface ResourceRepository<T>{
	
	List<T> find(String q);

	List<T> findAll();

	T findOne(Long id);
}
