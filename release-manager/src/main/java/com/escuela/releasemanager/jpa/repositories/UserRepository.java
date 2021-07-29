package com.escuela.releasemanager.jpa.repositories;

import com.escuela.releasemanager.db.models.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<RegisterUser,Integer> {
}
