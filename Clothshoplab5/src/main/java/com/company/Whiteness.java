package com.company;


public class Whiteness extends Clothes {

    private String thinLength;
    private String breastLength;

    public  Whiteness(final ClothesType type, final ClothesBrend brend,
                    final  String nameOfCloth, final double price,
                    final  double size, final int amount,
                    final String sleeveLength, final String dressLength) {
        super(type, brend, nameOfCloth, price, size, amount);
        this.thinLength = thinLength;
        this.breastLength = breastLength;

    }

    public final String getThinLength() {
        return thinLength;
    }

    public void setThinLength(final String thinLength) {
        this.thinLength = thinLength;
    }

    public final String getBreastLength() {
        return breastLength;
    }

    public void setBreastLength(final String breastLength) {
        this.breastLength = breastLength;
    }

}

