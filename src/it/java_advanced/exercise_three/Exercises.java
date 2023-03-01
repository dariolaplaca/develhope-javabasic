package it.java_advanced.exercise_three;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));
        Set<String> set = Set.copyOf(list);
        list = new ArrayList<>(set);
        // Your code here

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        System.out.println("\nExercise 2:");
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        Set<String>newSet = toSet(list);
        System.out.println(newSet);
        newSet = toSet(set);
        System.out.println(newSet);
    }

    public static Set<String> toSet(Collection<String> c){
        Set<String> set = Set.copyOf(c);
        return set;
    }
    // Write your method for exercise 2 here


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            if(!wordCount.containsKey(word)){
                wordCount.put(word, 1);
            } else {
                int value = wordCount.get(word) + 1;
                wordCount.put(word, value);
            }
        }
        System.out.println(wordCount);


        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: Linked List
     *    A LinkedList is an ordered collection of elements that provides efficient insertion and removal of elements at any position.
     *    When a new student arrives, we can add them to the end of the LinkedList using the addLast() method.
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: HashMap
     *    A HashMap is a key-value store that allows us to store values with unique keys. In this scenario
     *    we can use the student's name as the key, and their grades as the value associated with that key
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: TreeMap
     *    We can use the age as the key and the country as the value associated with that key.
     *    The TreeMap will maintain the countries in sorted order based on their age.
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: HashMap
     *    Similar to scenario 2, we can use a HashMap to store the products as keys and their prices as the corresponding values.
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: LinkedList
     *    In this scenario, like scenario 1, we can use a LinkedList to store the employees in the order they were added to the system.
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: HashMap
     *    A HashMap can be used to store the cities as keys and their populations as values.
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: HashMap
     *    A HashMap can be used to store the books as keys, and the values could be an object containing the author and publication date.
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: HashMap and an ArrayList or HashSet
     *    A HashMap can be used to store the courses as keys, and the values could be a list/set of professors teaching that course.
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: HashMap
     *    A HashMap can be used to store the movies as keys, and the values could be an object containing the movie's rating and release date.
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: HashMap
     *    A HashMap can be used to store the flights as keys, and the values could be an object containing the destination and departure time.
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: HashMap
     *    A HashMap can be used to store the articles as keys, and the values could be an object containing the article's title and publication date.
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: HashMap
     *    A HashMap can be used to store the songs as keys, and the values could be an object containing the song's artist and album name.
     */

}
