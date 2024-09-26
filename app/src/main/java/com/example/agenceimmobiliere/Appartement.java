package com.example.agenceimmobiliere;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Appartement extends BienImmobillier implements Serializable {
    private String etage;
    private boolean ascenseur;

    public Appartement(String adresse, String ville, String codePostal, Vendeur vendeur, String etage) {
        super(adresse, ville, codePostal, vendeur);
        this.etage = etage;
    }

    public Appartement(String adresse, String ville, String codePostal, Vendeur vendeur, String etage, boolean ascenseur) {
        super(adresse, ville, codePostal, vendeur);
        this.etage = etage;
        this.ascenseur = false;
    }

    public String typeBien() {
        int compteurPieces = 0;
        
        // Parcourir chaque pièce de l'appartement
        for (Piece piece : this.pieces) { // Supposons que `pieces` est une collection de pièces
            // Vérifier si la pièce est à comptabiliser
            // Ceci est un exemple, adaptez-le selon la logique de détermination des pièces à comptabiliser
            if (piece.getTypePiece().equals(TypePiece.CHAMBRE)) {
                compteurPieces++;
            }
        }
        
        // Construire la chaîne de caractères à retourner
        if (compteurPieces > 7) {
            return "T7+";
        } else {
            return "T" + compteurPieces;
        }
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        String resultat = "";
        resultat = "\nAppartement de type " + typeBien();
        if(ascenseur){
            resultat += " avec ascenseur ";
        } resultat += " situé au " + etage + " ";
        resultat += super.toString();
        return resultat;
    }
    
}
