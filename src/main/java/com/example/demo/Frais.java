package com.example.demo;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Getter
public class Frais {
    private final int id;
    private final String nom;
    private int montant;
    private final LocalDate dateLimiteDePaiement;
    private boolean status;
    private Etudiants etudiant;
    private Paiment paiment;
    private boolean methodePaiment;

    public Frais(int id,String nom, int montant, LocalDate dateLimiteDePaiement, boolean status, Etudiants etudiant, Paiment paiment, boolean methodePaiment) {
        this.id = id;
        this.montant = montant;
        this.dateLimiteDePaiement = dateLimiteDePaiement;
        this.status = status;
        this.nom = nom;
        this.etudiant = etudiant;
        this.paiment = paiment;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Frais frais = (Frais) o;
        return id == frais.id && montant == frais.montant && status == frais.status && Objects.equals(nom, frais.nom) && Objects.equals(dateLimiteDePaiement, frais.dateLimiteDePaiement) && Objects.equals(etudiant, frais.etudiant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, montant, dateLimiteDePaiement, status, etudiant);
    }

    public boolean in_progress() {
        if()
    }

  public boolean payer(List<Paiment> paiments) {
       if
  }
}
