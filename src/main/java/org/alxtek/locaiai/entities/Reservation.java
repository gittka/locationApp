package org.alxtek.locaiai.entities;

import jakarta.persistence.*;
import lombok.*;
import org.alxtek.locaiai.enums.StatutReservation;

import java.time.LocalDate;
@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder @Getter @Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private int nombrePersonnes;
    @Enumerated(EnumType.STRING)
    private StatutReservation statut;
    private double prixTotal;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Utilisateur client;
    @ManyToOne
    @JoinColumn(name = "annonce_id")
    private Annonce annonce;

}
