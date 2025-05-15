// package com.example.projet_backend.repository;

// public interface AuteurRepository extends JpaRepository<Auteur, Long> {
// }

package com.example.projet_backend.repository;

import com.example.projet_backend.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {
}
