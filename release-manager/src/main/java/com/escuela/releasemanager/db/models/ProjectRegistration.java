package com.escuela.releasemanager.db.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "project_registration")
public class ProjectRegistration {


    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
