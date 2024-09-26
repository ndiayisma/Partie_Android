package com.example.agenceimmobiliere;

import com.example.agenceimmobiliere.Piece;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

abstract class BienImmobillier implements Serializable {
    private String adresse;
    private String ville;
    private String codePostal;
    private Vendeur vendeur;
    public ArrayList<Piece> pieces = new ArrayList<Piece>();
    
    
    
    
    public BienImmobillier(String adresse, String ville, String codePostal, Vendeur vendeur, ArrayList<Piece> pieces) {
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
        this.pieces = pieces;
    }

    public BienImmobillier(String adresse, String ville, String codePostal, Vendeur vendeur) {
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
    }

    public double surfaceHabitable() {
        double surfaceHabitable = 0;
        for (Piece piece : pieces) {
            if (piece.getTypePiece().surfaceHabitable) {
                surfaceHabitable += piece.Surface();
            }
        }
        return surfaceHabitable;
    }

    public double surfaceNonHabitable() {
        double surfaceNonHabitable = 0;
        for (Piece piece : pieces) {
            if (!piece.getTypePiece().surfaceHabitable) {
                surfaceNonHabitable += piece.Surface();
            }
        }
        return surfaceNonHabitable;
    }

    public void ajouterPiece(Piece piece) {
        pieces.add(piece);
    }


    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    public Vendeur getVendeur() {
        return vendeur;
    }
    public void setVendeur(Vendeur vendeur) {
        this.vendeur = vendeur;
    }
    public ArrayList<Piece> getPieces() {
        return pieces;
    }
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
    

    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return "\nLocalisation : " + adresse + ", " + codePostal + " " + ville +  "\n" +
                "\n Description du bien : \n" + pieces.toString() +
                "\nPour une surface habitable de : " + 
                numberFormat.format(surfaceHabitable()) + 
                " m² et une surface non habitable de : " +
                numberFormat.format(surfaceNonHabitable()) + " m²";
    }
}
