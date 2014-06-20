package ar.edu.unq.tac.market.service;

import java.util.List;

public interface ResourceService<T> {
	List<T> all();
    public List<T> find(String q);
    public T findOne(Long id);
}
