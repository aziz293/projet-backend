// package com.example.projet_backend.service;

// @Service
// @RequiredArgsConstructor
// public class LivreService {
//     private final LivreRepository livreRepository;

//     public Livre creerLivre(Livre livre) {
//         return livreRepository.save(livre);
//     }

//     public List<Livre> listerLivres() {
//         return livreRepository.findAll();
//     }

//     public List<Livre> listerLivresParAuteur(Long auteurId) {
//         return livreRepository.findByAuteurId(auteurId);
//     }

//     public Livre modifierLivre(Long id, Livre livre) {
//         Livre livreExistant = livreRepository.findById(id)
//                 .orElseThrow(() -> new RuntimeException("Livre non trouvé"));
//         livreExistant.setTitre(livre.getTitre());
//         livreExistant.setIsbn(livre.getIsbn());
//         return livreRepository.save(livreExistant);
//     }

//     public void supprimerLivre(Long id) {
//         livreRepository.deleteById(id);
//     }
// }

package com.example.projet_backend.service;

import com.example.projet_backend.model.Livre;
import com.example.projet_backend.repository.LivreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivreService {

    private final LivreRepository livreRepository;

    public Livre creerLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    public List<Livre> listerLivres() {
        return livreRepository.findAll();
    }

    public List<Livre> listerLivresParAuteur(Long auteurId) {
        return livreRepository.findByAuteurId(auteurId);
    }

    public Livre modifierLivre(Long id, Livre livre) {
        Livre livreExistant = livreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livre introuvable avec l'id: " + id));

        livreExistant.setTitre(livre.getTitre());
        livreExistant.setIsbn(livre.getIsbn());
        livreExistant.setAuteur(livre.getAuteur()); // Optionnel, selon vos besoins

        return livreRepository.save(livreExistant);
    }

    public void supprimerLivre(Long id) {
        if (!livreRepository.existsById(id)) {
            throw new RuntimeException("Livre introuvable avec l'id: " + id);
        }
        livreRepository.deleteById(id);
    }
}
