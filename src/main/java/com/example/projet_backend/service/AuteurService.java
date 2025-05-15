package com.example.projet_backend.service;
import com.example.projet_backend.model.Auteur;
import com.example.projet_backend.repository.AuteurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AuteurService {
    private final AuteurRepository auteurRepository;

    public Auteur creerAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public List<Auteur> listerAuteurs() {
        return auteurRepository.findAll();
    }
}
