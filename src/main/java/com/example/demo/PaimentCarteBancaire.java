package com.example.demo;

import java.time.LocalDate;
import java.util.List;

public class PaimentCarteBancaire  implements Paiment {
    private int id;
    private int montantPayer;
    private LocalDate dateDePaiementCarte;

    public PaimentCarteBancaire(int id, LocalDate dateDePaiementCarte, int montantPayer) {
        this.id = id;
        this.dateDePaiementCarte = LocalDate.now();
        this.montantPayer = 0;
    }

    @Override
    public LocalDate getDateDePaiement() {
        return dateDePaiementCarte;
    }

    @Override
    public int payement(int paiement,int compte) {
        if (compte >= montantPayer) {
            montantPayer =paiement;
            System.out.println("le virment de "+paiement+"par"+id+"est un succé");
        }else {
            System.out.println("votre solde est inssufisant pour cette transaction: "+compte);
        }
        return montantPayer;
    }
}
