// package com.example.projet_backend.repository;

// public interface LivreRepository extends JpaRepository<Livre, Long> {
//     List<Livre> findByAuteurId(Long auteurId);
// }

package com.example.projet_backend.repository;

import com.example.projet_backend.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByAuteurId(Long auteurId);
}
