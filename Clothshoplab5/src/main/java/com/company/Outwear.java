package com.company;



public class Outwear extends Clothes {

    private String sleeveLength;
    private String dressLength;

    public Outwear(final ClothesType type, final ClothesBrend brend, final String nameOfCloth,
                  final double price,final double size,final int amount,
                  final String sleeveLength, final String dressLength) {
        super(type, brend, nameOfCloth, price, size, amount);
        this.dressLength = dressLength;
        this.sleeveLength = sleeveLength;

    }

    public final String getSleeveLength() {
        return sleeveLength;
    }

    public  void setSleeveLength(final String sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public final String getDressLength() {
        return dressLength;
    }

    public  void setDressLength(final String dressLength) {
        this.dressLength = dressLength;
    }


}
