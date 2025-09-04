package com.example.demo;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Getter
public class Etudiants {
    private int id ;
    private String nom ;
    private String prenom ;
    private LocalDate dateEntrer ;
    private List<Frais> frais ;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Etudiants etudiants = (Etudiants) o;
        return id == etudiants.id && Objects.equals(nom, etudiants.nom) && Objects.equals(prenom, etudiants.prenom) && Objects.equals(dateEntrer, etudiants.dateEntrer) && Objects.equals(frais, etudiants.frais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, dateEntrer, frais);
    }

    @Override
    public String toString() {
        return "Etudiants{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date=" + dateEntrer +
                ", frais=" + frais +
                '}';
    }
}
