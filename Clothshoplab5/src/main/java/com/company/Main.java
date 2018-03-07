package com.company;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final void printList(List<Clothes> List) {
        List.forEach((Clothes x) -> {
            System.out.println(x.toString());
        });
    }

    public static final void main(String[] args) {

        ClothesShopManager shop = new ClothesShopManager();

        List<Clothes> arrayList = new LinkedList<>();
        arrayList.add(new Outwear(ClothesType.CASUAL, ClothesBrend.ZARA,
                "Blouse", 32, 65, 12, "45", "12"));
        arrayList.add(new Undercoat(ClothesType.SOLEMN, ClothesBrend.BERSHKA,
                "Trousers", 31, 54, 892, "56", "98"));
        arrayList.add(new Outwear(ClothesType.OFFICIAL, ClothesBrend.PULLBEAR,
                "Bra", 332, 65, 12, "12", "54"));


        shop.setClothes(arrayList);

        boolean menu = true;
        while (menu) {

            System.out.println("Menu");
            System.out.println(" 1 - Print list of clothes;");
            System.out.println(" 2 - Search by type of clothes;");
            System.out.println(" 3 - Print list of clothes sorted by brend;");
            System.out.println(" 4 - Exit;");

            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            // in.close();
            switch (num) {
                case 1: {
                    printList(arrayList);
                    break;
                }

                case 2: {
                    List<String> someType = new LinkedList<>();
                    someType.add("Trousers");

                    List<Clothes> arrayList1 = shop.findByType(ClothesType.SOLEMN);
                    System.out.println("Find solemn clothes " + ClothesType.SOLEMN);
                    System.out.println(arrayList1);
                    break;
                }

                case 3: {
                    shop.sortByBrend(shop.getClothes());
                    shop.getClothesList().forEach((Clothes clothes)->System.out.println(clothes.toString()));
                    break;
                }

                case 4:
                default: {
                    System.out.println("Exited programm");
                    menu = false;
                    break;
                }

            }
        }

    }

}
