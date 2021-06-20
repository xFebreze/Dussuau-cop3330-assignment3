package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */

import java.util.*;

public class Histogram {

    public static List<Integer> sort(Map<String, Integer> map){
        List<Integer> list = new ArrayList<>();

        list.add(map.get("badger"));
        list.add(map.get("mushroom"));
        list.add(map.get("snake"));

        Collections.sort(list);
        Collections.reverse(list);

        return list;
    }

    public static void histogram(Map<String, Integer> map, List<Integer> list){

        for(int j = 0; j<list.size(); j++){
            if(map.get("badger") == list.get(j)){
                System.out.print("badger:   ");
                for(int k = 0; k<map.get("badger"); k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int j = 0; j<list.size(); j++){
            if(map.get("mushroom") == list.get(j)){
                System.out.print("mushroom: ");
                for(int k = 0; k<map.get("mushroom"); k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int j = 0; j<list.size(); j++){
            if(map.get("snake") == list.get(j)){
                System.out.print("snake:    ");
                for(int k = 0; k<map.get("snake"); k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }


}
