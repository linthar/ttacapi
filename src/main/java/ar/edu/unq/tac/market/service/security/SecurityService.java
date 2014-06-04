package ar.edu.unq.tac.market.service.security;

public interface SecurityService {

    void login(String username, String password);

    void logout();
}