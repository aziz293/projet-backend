package com.example.projet_backend.controller;
import com.example.projet_backend.model.Livre;
import com.example.projet_backend.service.LivreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/livres")
@RequiredArgsConstructor
public class LivreController {
    private final LivreService livreService;

    @PostMapping
    public Livre creerLivre(@RequestBody Livre livre) {
        return livreService.creerLivre(livre);
    }

    @GetMapping
    public List<Livre> listerLivres() {
        return livreService.listerLivres();
    }

    @GetMapping("/auteur/{auteurId}")
    public List<Livre> listerLivresParAuteur(@PathVariable Long auteurId) {
        return livreService.listerLivresParAuteur(auteurId);
    }

    @PutMapping("/{id}")
    public Livre modifierLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return livreService.modifierLivre(id, livre);
    }

    @DeleteMapping("/{id}")
    public void supprimerLivre(@PathVariable Long id) {
        livreService.supprimerLivre(id);
    }
}
