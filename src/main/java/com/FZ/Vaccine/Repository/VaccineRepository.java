package com.FZ.Vaccine.Repository;

import com.FZ.Vaccine.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, UUID> {
}
