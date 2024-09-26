package com.example.agenceimmobiliere;

import java.io.Serializable;

public class Annonce implements Serializable {
    
    public static final double COEF_NON_HABITABLE = 0.25;
    
    private String reference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private BienImmobillier logement;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getPrixM2Habitable() {
        return prixM2Habitable;
    }

    public void setPrixM2Habitable(double prixM2Habitable) {
        this.prixM2Habitable = prixM2Habitable;
    }

    public BienImmobillier getLogement() {
        return logement;
    }

    public void setLogement(BienImmobillier logement) {
        this.logement = logement;
    }

    public Annonce(String reference, String date, String titre, double prixM2Habitable, BienImmobillier logement) {
        this.reference = reference;
        this.date = date;
        this.titre = titre;
        this.prixM2Habitable = prixM2Habitable;
        this.logement = logement;
    }

    public double prix() {
        return logement.surfaceHabitable() * prixM2Habitable + logement.surfaceNonHabitable() * prixM2Habitable * COEF_NON_HABITABLE;
    }

    @Override
    public String toString() {
        return titre + "\nAnnonce " + reference + " du " + date + 
        logement.toString() +
        "\n" +  "Valeur du bien : " + prix() + " euros";
    }

}
