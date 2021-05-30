package com.escuela.releasemanager.db.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "registered_user")
public class RegisterUser {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="user_id", length = 25)
    private Integer id;

    @Column(name = "username")
    private String username;


}
