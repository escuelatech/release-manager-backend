package com.escuela.releasemanager.db.models;


import lombok.*;


@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class ReleaseInfo {

    String releaseId;
    String releaseName;
    String releaseVersion;
    String releaseOwner;
    String devLead;
    String testLead;
    String projectManager;
    String releaseDescription;

}
