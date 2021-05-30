package com.escuela.releasemanager.db.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "project_registration")
public class ProjectRegistration {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="project_id", length = 25)
    private Integer id;

    @Column(name = "project_name")
    private String projectName;
}
