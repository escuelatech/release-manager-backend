package com.escuela.releasemanager.jpa.repositories;

import com.escuela.releasemanager.db.models.ProjectRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRegistrationRepository extends JpaRepository<ProjectRegistration,Integer> {
}
