package com.example.agenceimmobiliere;

import java.io.Serializable;

class PieceQuadrilatere extends Piece implements Serializable {
    private double longueur;
    private double largeur;

    public PieceQuadrilatere(TypePiece typePiece, String niveau, double longueur, double largeur) {
        super(typePiece, niveau);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double Surface() {
        return longueur * largeur;
    }
}

class PieceParallelogramme extends Piece implements Serializable{
    private double base;
    private double hauteur;

    public PieceParallelogramme(TypePiece typePiece, String niveau, double base, double hauteur) {
        super(typePiece, niveau);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    double Surface() {
        return base * hauteur;
    }
}

class PieceCirculaire extends Piece implements Serializable{
    private double rayon;

    public PieceCirculaire(TypePiece typePiece, String niveau, double rayon) {
        super(typePiece, niveau);
        this.rayon = rayon;
    }

    @Override
    double Surface() {
        return Math.PI * rayon * rayon;
    }
}

class PieceTriangulaire extends Piece implements Serializable{
    private double base;
    private double hauteur;

    public PieceTriangulaire(TypePiece typePiece, String niveau, double base, double hauteur) {
        super(typePiece, niveau);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    double Surface() {
        return (base * hauteur) / 2;
    }
}

class PieceTrapezoidale extends Piece implements Serializable{
    private double petiteBase;
    private double grandeBase;
    private double hauteur;

    public PieceTrapezoidale(TypePiece typePiece, String niveau, double petiteBase, double grandeBase, double hauteur) {
        super(typePiece, niveau);
        this.petiteBase = petiteBase;
        this.grandeBase = grandeBase;
        this.hauteur = hauteur;
    }

    @Override
    double Surface() {
        return ((petiteBase + grandeBase) / 2) * hauteur;
    }
}