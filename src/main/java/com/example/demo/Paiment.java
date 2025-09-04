package com.example.demo;

import java.time.LocalDate;
import java.util.List;

interface Paiment {
    LocalDate getDateDePaiement();
      int payement(int paiement, int compte);
}
