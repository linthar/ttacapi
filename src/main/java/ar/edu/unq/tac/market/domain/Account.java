package ar.edu.unq.tac.market.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by frepond on 5/28/14.
 */
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "account_application",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "application_id"))
    private List<Application> installed;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<Application> getInstalled() {
        return installed;
    }

    public void setInstalled(List<Application> installed) {
        this.installed = installed;
    }

}
