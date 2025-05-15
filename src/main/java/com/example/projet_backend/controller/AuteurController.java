package com.example.projet_backend.controller;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.example.projet_backend.model.Auteur;
import com.example.projet_backend.service.AuteurService;


@RestController
@RequestMapping("/auteurs")
@RequiredArgsConstructor
public class AuteurController {
    private final AuteurService auteurService;

    @PostMapping
    public Auteur creerAuteur(@RequestBody Auteur auteur) {
        return auteurService.creerAuteur(auteur);
    }

    @GetMapping
    public List<Auteur> listerAuteurs() {
        return auteurService.listerAuteurs();
    }
}


