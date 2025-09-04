package com.example.demo;

import java.time.LocalDate;
import java.util.List;

public class PaiementMobile  implements Paiment {
    private int id;
    private String typePaiement;
    private int montantPayer;
   public LocalDate dateDePaiementMobile;

    public PaiementMobile(int id, String typePaiement, int montantPayer, LocalDate dateDePaiementMobile) {
        this.id = id;
        this.typePaiement = typePaiement;
        this.montantPayer = montantPayer;
        this.dateDePaiementMobile = LocalDate.now();
    }

    public LocalDate getDateDePaiement() {
        return dateDePaiementMobile;
    }

    @Override
    public int payement(int paiement, int compte) {
    if (compte >= montantPayer) {
        montantPayer = paiement;
        System.out.println("votre transaction a été un succée");
    }else{
        System.out.println("votre solde est inssufisant pour cette transaction: "+compte);
    }
        return montantPayer;
    }
}
