package com.company;


public abstract class Clothes {

    private ClothesType type;
    private ClothesBrend brend;

    private String nameOfCloth;
    private double price;
    private double size;
    private int amount;
    private String length;

    public Clothes(final ClothesType type, final ClothesBrend brend, final String nameOfCloth, final double price, final double size, final int amount) {

        setType(type);
        setNameOfCloth(nameOfCloth);
        setPrice(price);
        setSize(size);
        setAmount(amount);
        setBrend(brend);

    }

    @Override
    public String toString() {
        return "Name = " + nameOfCloth + " Type = " + type +
                " Brend = " + brend + " Amount = "
                + amount + " Price = " + price;
    }

    public final ClothesType getType() {
        return type;
    }

    public final ClothesBrend getBrend() {
        return brend;
    }

    public void setBrend(final ClothesBrend brend) {
        this.brend = brend;
    }

    public final String getNameOfCloth() {
        return nameOfCloth;
    }

    public void setNameOfCloth(final String nameOfCloth) {
        this.nameOfCloth = nameOfCloth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public final double getSize() {
        return size;
    }

    public void setSize(final double size) {
        this.size = size;
    }

    public final int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }

    public final String getLength() {
        return length;
    }

    public void setLength(final String length) {
        this.length = length;
    }

    public void setType(final ClothesType type) {
        this.type = type;
    }

}

