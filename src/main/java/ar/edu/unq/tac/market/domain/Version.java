package ar.edu.unq.tac.market.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Holds version information for apps
 * <p/>
 * Created by frepond on 6/7/14.
 */
@Entity
public class Version {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // version string
    private String version;

    // version general description
    private String description;

    // html or markup? representing the changes of current version
    private String changes;

    // the approval status of the app's version
    private ApplicationState state = ApplicationState.NEW;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }

    public ApplicationState getState() {
        return state;
    }

    public void setState(ApplicationState state) {
        this.state = state;
    }
}
