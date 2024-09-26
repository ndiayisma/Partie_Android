package com.example.agenceimmobiliere;

public class Maison extends BienImmobillier {
    private double surfaceTerrain;
    private boolean piscine;

    public double getSurfaceTerrain() {
        return surfaceTerrain;
    }

    public void setSurfaceTerrain(double surfaceTerrain) {
        this.surfaceTerrain = surfaceTerrain;
    }

    public boolean isPiscine() {
        return piscine;
    }

    public void setPiscine(boolean piscine) {
        this.piscine = piscine;
    }

    public Maison(String adresse, String ville, String codePostal, Vendeur vendeur, double surfaceTerrain) {
        super(adresse, ville, codePostal, vendeur);
        this.surfaceTerrain = surfaceTerrain;
    }

    public Maison(String adresse, String ville, String codePostal, Vendeur vendeur, double surfaceTerrain, boolean piscine) {
        super(adresse, ville, codePostal, vendeur);
        this.surfaceTerrain = surfaceTerrain;
        this.piscine = false;
    }

    @Override
    public String toString() {
        String resultat = "";
        resultat = "Maison individuelle ";
        if(piscine){
            resultat += " avec piscine ";
        } resultat += "sur un terrain de " + surfaceTerrain + " ";
        resultat += ". " + super.toString();
        return resultat;
    }


}
