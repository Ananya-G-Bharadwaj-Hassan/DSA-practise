package DSA_practise;

import java.util.HashMap;

class Hashmaps{
    public static void main(String[] args) {
        //create a hash map
        HashMap<String, Integer> population= new HashMap<>();
        population.put("India",138);
        population.put("USA",33);
        population.put("Australia",4);
        System.out.println(population);

        //get - O(1)
        System.out.println(population.get("India"));

        //check if a key or value exists - O(1)
        System.out.println(population.containsKey("India"));
        System.out.println(population.containsValue(33));

        //traverse on hash map - O(n)
        for(String s:population.keySet()){
            System.out.println(s);
        }

        //size - O(1)
        System.out.println(population.size());

        //empty - O(1)
        System.out.println(population.isEmpty());

        //remove - O(1)
        population.remove("USA");
        System.out.println(population);
    }
}