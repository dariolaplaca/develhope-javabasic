package it.tutor_exercises.exercise_five_shop_catalogue;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    private final String name;
    private Map<Item, Integer> catalog;

    Shop(String name){
        this.name = name;
        catalog = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public Map<Item, Integer> getCatalog() {
        return this.catalog;
    }

    public void addItem(Item i){
        if(catalog.containsKey(i)){
            catalog.put(i, catalog.get(i) + 1);
        } else {
            catalog.put(i, 1);
        }
    }

    public void printCatalogue(){
        for(Map.Entry<Item, Integer> entry : catalog.entrySet()){
            System.out.println(entry.getKey().getName() + " - " + entry.getValue());
        }
    }

    public void removeItem(Item i){
        if(catalog.get(i) > 1){
            catalog.put(i, catalog.get(i) - 1);
        } else {
            catalog.remove(i);
        }
    }

    public Item getItem(String name){
        for(Map.Entry<Item, Integer> entry : catalog.entrySet()){
            if(name.equals(entry.getKey().getName())){
                return entry.getKey();
            }
        }
        return null;
    }

    public void applyDiscountByType(ProductType pt, double discount){
        for(Map.Entry<Item, Integer> entry : catalog.entrySet()){
            if(entry.getKey().getType().equals(pt)){
                entry.getKey().applyDiscount(discount);
            }
        }
    }

    public void saveCatalog() throws IOException {
        File file = new File("src/main/java/it/tutor_exercises/exercise_five_shop_catalogue/catalog.csv");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for(Map.Entry<Item, Integer> entry : catalog.entrySet()){
            bw.append(entry.getKey().toString()).append(",").append(String.valueOf(entry.getValue())).append("\n");
        }
        bw.close();
    }

    public void loadCatalog() throws IOException {
        File file = new File("src/main/java/it/tutor_exercises/exercise_five_shop_catalogue/catalog.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        while(line != null){
            String[] fields = line.split(",");
            Item i = new Item(fields[0], Double.parseDouble(fields[1]), ProductType.valueOf(fields[2]));
            i.applyDiscount(Double.parseDouble(fields[3]));
            catalog.put(i, Integer.valueOf(fields[4]));
            line = br.readLine();
        }
        br.close();
    }
}
