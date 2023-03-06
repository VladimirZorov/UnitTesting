package shopAndGoods;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Map<String, Goods> shelves;

    @Before
    public void setUp() {
        Shop shop = new Shop();
        shelves = new LinkedHashMap<>();
        Goods goods = new Goods("Box", "ABC");
    }


    @Test
    public void when_ShelfIsNull_then_Exc() {

        Goods goods = new Goods("Box", "ABC");
        shelves.put("Box", goods);
assertEquals("ABC", shelves.get("Box"));
    }

}