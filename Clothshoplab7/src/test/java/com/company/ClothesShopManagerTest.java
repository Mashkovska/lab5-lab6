package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.LinkedList;
import java.util.List;


public class ClothesShopManagerTest extends TestCase {

    private static ClothesShopManager  manager = new ClothesShopManager();
    private static Clothes clothes1 = new Outwear(ClothesType.CASUAL, ClothesBrend.ZARA,
            "Blouse", 32, 65, 12, "45", "12");
    private static Clothes clothes2 = new Undercoat(ClothesType.SOLEMN, ClothesBrend.BERSHKA,
            "Trousers", 31, 54, 892, "56", "98");
    private static Clothes clothes3 = new Whiteness(ClothesType.OFFICIAL, ClothesBrend.PULLBEAR,
            "Bra", 332, 65, 12, "12", "54");
    private List<Clothes> testClothes = new LinkedList<>();

    private static final ClothesShopManager clothesShopManager = new ClothesShopManager();

    private static final ClothesWriter writer = new ClothesWriter();

    private static final File file = new File("C:\\Users\\user\\eclipse-workspace\\Clothshoplab5\\Clothes.csv");


    @BeforeAll
    public static void AddToList(){
        manager.addClothes(clothes1);
        manager.addClothes(clothes2);
        manager.addClothes(clothes3);
    }
    @Test
    public void testAddClothes() {
        ClothesShopManager manager = new ClothesShopManager();
        manager.addClothes(clothes1);
        assertEquals(clothes1, manager.getClothesList().get(0));

    }

    @Test
    public void testFindByType() {
        testClothes= manager.findByType(clothes1.getType());
        assertEquals(1, testClothes.size());
        assertEquals(clothes1, manager.getClothes().get(0));

    }
    @Test

    public void testSortByBrend() {
        testClothes = manager.getClothes();
        manager.sortByBrend(testClothes);
        assertEquals(3,testClothes.size());
        assertEquals(clothes3, testClothes.get(0));
        assertEquals(clothes2, testClothes.get(1));
        assertEquals(clothes1, testClothes.get(2));
    }
    @Test

    public void writeToFileTest(){
        writer.writeToFile(manager.getClothesList());
        assertEquals(true, file.exists());
    }
}