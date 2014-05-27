package ar.edu.unq.tac.tienda.service.security;

public interface SecurityService {

	void login(String username, String password);

	void logout();
}