package org.itstep;

import java.util.*;

public class MapSetTester {
    public static void main(String[] args) {
        Map<String, TreeSet> networkMap = new HashMap<>();
        Scanner scn = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.print("Input tv network: ");
            String tmpK = scn.nextLine();
            System.out.print("Input tv show on " + tmpK + ": ");
            String tmpV = scn.nextLine();
            if (!networkMap.containsKey(tmpK)) {
                TreeSet<String> set = new TreeSet<>();
                set.add(tmpV);
                networkMap.put(tmpK, set);
            } else {
                TreeSet<String> set = new TreeSet<>(networkMap.get(tmpK));
                set.add(tmpV);
                networkMap.put(tmpK, set);
            }
            System.out.println(networkMap);
        }

        System.out.println("-------------------");


        String[] networkMapKey = networkMap.keySet().toArray(new String[0]);

        Arrays.sort(networkMapKey);
        for (String s : networkMapKey) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        for (String s : networkMapKey) {
            System.out.println(s + " = " + networkMap.get(s));
        }

    }
}
