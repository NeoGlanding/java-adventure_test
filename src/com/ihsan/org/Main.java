package com.ihsan.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Location> locations = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        locations.put(1, new Location(1, "My House"));
        locations.put(2, new Location(2, "Your House"));
        locations.put(3, new Location(3, "Father House"));
        locations.put(4, new Location(4, "Grandfather House"));

        locations.get(1).addExit("N", 2);
        locations.get(1).addExit("S", 3);

        int loc = 1;
        while (true) {
            if (loc == 0) {
                break;
            }
            System.out.println(locations.get(loc).getDescription());

            int oldLoc = loc;
            loc = scanner.nextInt();

            Map<String, Integer> exit = locations.get(loc).exit;

//            System.out.println("Available exit are");

//            if (!locations.containsKey(loc)) {
//                System.out.println("You cant go to that directions");
//                loc = 0;
//            }

        }


    }
}
