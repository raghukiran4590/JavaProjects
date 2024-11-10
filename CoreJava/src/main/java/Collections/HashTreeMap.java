package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTreeMap {

    public static void main(String[] args) {

//        System.out.println("Collection.sort,min,max,search");
//        System.out.println("Iterator.next, hasNext");

        Map<Integer, String> hashmap1 = new HashMap<>();
        hashmap1.put(1, "Raghu");
        hashmap1.put(2, "Ravi");
        hashmap1.put(3, "Ashok");
        hashmap1.put(4, "Rohit");
        hashmap1.put(5, "Shyam");

        System.out.println(hashmap1);

        System.out.println(hashmap1.get(1));

        System.out.println(hashmap1.keySet());

        System.out.println(hashmap1.values());

        System.out.println(hashmap1.containsKey(2));

        System.out.println(hashmap1.containsValue("Ashok"));

        HashMap<String, Integer> hashmap2 = new HashMap<>();
        hashmap2.put("Raghu", 542);
        hashmap2.put("Rohit", 555);
        hashmap2.put("Ravi", 509);
        hashmap2.put("Shyam", 553);
        hashmap2.put("Ravi", 556);

        System.out.println(hashmap2);

        System.out.println(hashmap2.get("Rohit"));

        System.out.println(hashmap2.keySet());

        System.out.println(hashmap2.values());

        System.out.println(hashmap2.containsKey("Ram"));

        System.out.println(hashmap2.containsValue(555));

        System.out.println(hashmap2.size());

        System.out.println(hashmap2.putIfAbsent("Ram", 556));

        System.out.println(hashmap2);

        System.out.println(hashmap2.getClass());

        hashmap2.clear();

        hashmap1.remove(555);

        System.out.println(hashmap1);

        System.out.println(hashmap2);

        System.out.println("****************************");

        TreeMap<Integer, String> treemap1 = new TreeMap<>();
        treemap1.put(1, "Raghu");
        treemap1.put(2, "Ravi");
        treemap1.put(3, "Ashok");
        treemap1.put(4, "Rohit");
        treemap1.put(5, "Shyam");

        System.out.println(treemap1);

        System.out.println(treemap1.keySet());

        System.out.println(treemap1.ceilingKey(1)+"||"+treemap1.ceilingEntry(1));

        System.out.println(treemap1.values());

        System.out.println(treemap1.entrySet());

        System.out.println(treemap1.floorEntry(2)+"||"+treemap1.floorKey(2));

        System.out.println(treemap1.headMap(6));

        System.out.println(treemap1.headMap(5, true));

        System.out.println(treemap1.descendingMap());

        System.out.println(treemap1.descendingKeySet());
    }
}
