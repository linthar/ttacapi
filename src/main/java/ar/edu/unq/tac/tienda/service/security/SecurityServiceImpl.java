package ar.edu.unq.tac.tienda.service.security;

import javax.annotation.Resource;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Resource(name="authenticationManager")
	private AuthenticationManager authenticationManager;

	@Override
	public void login(String username, String password) {
			authenticate(username, password);
	}

 
    private Authentication authenticate(String username, String password) {

        Authentication request = new UsernamePasswordAuthenticationToken(username, password);
        Authentication result = authenticationManager.authenticate(request);
        if (null != result) {
            SecurityContextHolder.getContext().setAuthentication(result);
            return result;
        }
        throw new BadCredentialsException("null authentication");
    }

	@Override
	public void logout() {
		setAuthentication(null);
	}

	private void setAuthentication(Authentication authentication) {
		SecurityContextHolder.getContext().setAuthentication(authentication);
	}

}