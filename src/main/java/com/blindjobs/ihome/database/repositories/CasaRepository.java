package com.blindjobs.ihome.database.repositories;

import com.blindjobs.ihome.database.models.Casa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CasaRepository extends JpaRepository<Casa, UUID> {

}
