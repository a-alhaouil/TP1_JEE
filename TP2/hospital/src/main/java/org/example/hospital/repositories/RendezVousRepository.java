package org.example.hospital.repositories;

import org.example.hospital.entities.Patient;
import org.example.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous, String>{
}
