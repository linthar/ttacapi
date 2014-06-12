package ar.edu.unq.tac.market.domain;

import javax.persistence.*;
import java.util.List;


@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    private String description;

    private Integer ranking;

    @OneToOne
    private Version currentVersion;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Version> previousVersions;

    // URL del archivo a descargar de la App
    private String appUrl;

    // URL del icon de la App
    private String icon;

    // URLs de las imagenes
    private String[] gallery;

    // core apps are provided with the firmware, provide basic services a can't be removed
    // but could be automatically updated
    private boolean core;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Version getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(Version currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String[] getGallery() {
        return gallery;
    }

    public void setGallery(String[] gallery) {
        this.gallery = gallery;
    }

    public boolean isCore() {
        return core;
    }

    public void setCore(boolean core) {
        this.core = core;
    }

    public List<Version> getPreviousVersions() {
        return previousVersions;
    }

    public void setPreviousVersions(List<Version> previousVersions) {
        this.previousVersions = previousVersions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" id= ");
        sb.append(id);
        sb.append(" name= ");
        sb.append(name);
        return sb.toString();
    }
}
