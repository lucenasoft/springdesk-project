package br.com.lucenasoft.helpdesk.models;

import br.com.lucenasoft.helpdesk.Enums.ProfileEnum;
import jakarta.persistence.*;



@MappedSuperclass
public abstract class PersonAbstract { // Classe abstract não pode ser instanciada, somente extendida, usada como modelo

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String imgURL;
    private ProfileEnum profile;

    public PersonAbstract(){}

    public PersonAbstract(Long id, String name, String email, String password, String imgURL, ProfileEnum profile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.imgURL = imgURL;
        this.profile = profile;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public ProfileEnum getProfile() {
        return profile;
    }

    public void setProfile(ProfileEnum profile) {
        this.profile = profile;
    }
}
