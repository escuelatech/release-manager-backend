package com.escuela.releasemanager.jpa.repositories;

import com.escuela.releasemanager.db.models.ReleaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends JpaRepository<ReleaseInfo,Integer> {

}
