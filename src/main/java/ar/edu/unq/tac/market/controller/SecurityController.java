package ar.edu.unq.tac.market.controller;

import ar.edu.unq.tac.market.service.security.SecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController extends AbstractRestController {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(SecurityController.class);

    @Autowired
    private SecurityService securityService;

    @RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.GET)
    public String login(@PathVariable("username") String username,
                        @PathVariable("password") String password) {
        LOGGER.debug("Login user: " + username);

        securityService.login(username, password);
        return "Ok";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        LOGGER.debug("Logout");
        securityService.logout();
        return "Ok";
    }

}
