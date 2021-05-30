package com.escuela.releasemanager.db.models;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "release_info")
public class ReleaseInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="user_id", length = 25)
    Integer releaseId;

    @Column(name = "release_name")
    String releaseName;

    @Column(name = "release_version")
    String releaseVersion;

    @Column(name = "release_owner")
    String releaseOwner;

    @Column(name = "dev_lead")
    String devLead;

    @Column(name = "test_lead")
    String testLead;

    @Column(name = "project_manager")
    String projectManager;

    @Column(name = "release_description")
    String releaseDescription;

}
