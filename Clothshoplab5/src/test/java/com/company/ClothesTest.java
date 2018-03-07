package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ClothesTest extends TestCase {

    @Test

    public void testToString() {
        ClothesShopManager manager = new ClothesShopManager();
        manager.addClothes(new Outwear(ClothesType.CASUAL, ClothesBrend.ZARA,
                "Blouse", 32, 65, 12, "45", "12"));
        assertEquals("Name = Blouse Type = CASUAL Brend = ZARA Amount = 12 Price = 32.0", manager.getClothes().get(0).toString());
    }
}