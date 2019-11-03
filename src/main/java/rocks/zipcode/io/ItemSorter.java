package rocks.zipcode.io;

import sun.tools.jconsole.inspector.IconManager;

import java.util.*;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter implements Comparator<Item> {
    List<Item> itemList; //

    public ItemSorter(Item[] items) {
        this.itemList = Arrays.asList(items);//
    }

    public Item[] sort(Comparator<Item> comparator) {
         Collections.sort(itemList,comparator);//
         return (Item[]) itemList.toArray();//
    }

    public int compare(Item o1, Item o2) {
        return 0;
    }

    public boolean equals(Object obj) {
        return false;
    }
}
