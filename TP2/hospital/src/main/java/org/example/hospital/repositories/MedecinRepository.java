package org.example.hospital.repositories;

import org.example.hospital.entities.Medecin;
import org.example.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long>{
    Medecin findByNom(String nom);
}
