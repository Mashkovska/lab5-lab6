package com.company;


public class Undercoat extends Clothes {

    private String trousersLength;
    private String skirtLength;

    public Undercoat(final ClothesType type, final ClothesBrend brend,
                   final  String nameOfCloth, final double price, final double size, int amount,
                   final  String sleeveLength,final String dressLength) {
        super(type, brend, nameOfCloth, price, size, amount);
        this.trousersLength = trousersLength;
        this.skirtLength = skirtLength;

    }

    public final String getTrousersLength() {
        return trousersLength;
    }

    public void setTrousersLength(final String TrousersLength) {
        this.trousersLength = trousersLength;
    }

    public final String getSkirtLength() {
        return skirtLength;
    }

    public void setSkistLength(final String skirtLength) {
        this.skirtLength = skirtLength;
    }
}
