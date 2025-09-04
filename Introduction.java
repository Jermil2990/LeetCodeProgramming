import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Introduction {
    public static void main(String[] args) {
        // Strings
        // length() - returns length of string
        // toCharArray() = turns string to char array
        System.out.println("Hello World!");
        String message = "Hello";
        System.out.println(message.toLowerCase());
        message = message.replace('o', 'h');
        System.out.println(message);

        // Arrays
        // To print an array it requires a for loop or Arrays method
        // LENGTH -
        // EQUALS -
        // Arrays.toString() -
        // Arrays.fill() - fill an array with a single value
        int[] numbers = { 1, 4, 5, 2, 4 };
        int[] numbersExtra = new int[6];

        // System.out.println(numbers[1]);
        int tim = numbersExtra[0]++;
        System.out.println("Value: " + numbers[0]);

        Arrays.fill(numbers, -1);
        System.out.println(numbers.length); // prints length
        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbersExtra)); // Printing array

        // ArrayList *import ArrayList*
        // size() → how many elements
        // get() → read element
        // add() → insert element
        // remove() → delete element
        // set() → update element

        // This is a creation for a list interface within an ArrayList object <
        // List<Integer> list = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list);

        // HashMap *import HashMap*
        // HashMaps functions are GET () and PUT (). They are used to create key value
        // pairs, an example is a company using IDs
        // GET - returns the value mapped to the given key
        // PUT - adds a new key-value pair to the map
        // REMOVE - rmeoves key-value pair
        // SIZE - returns length of map
        // EQUALS - compares two hashmaps
        // getOrDefault(value, default value) - takes a value to look for and then if
        // not found it ask for defualt value
        // containsKey - checks if key is in map
        // containsValue - checks if value exsists in map
        // replace - replaces value with key-value pair given (if key does not exsist
        // does nothing)
        // putIfAbsent() - only updates key-value pair if not present in array

        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 2);
        map.put("banana", 5);
        map.size();
        System.out.println(map); // prints map
        System.out.println(map.size()); // prints map

        map.containsKey("grape"); // returns false
        System.out.println(map.containsKey("grape"));

        map.containsValue(5); // returns true
        System.out.println(map.containsValue(5));

        // HashSet *import HashSet*
        // No particular order, No duplicates, Cannot remove by index
        // ADD - adds item to array
        // REMOVE - removes item from array
        // SIZE - get size of array
        // CONTAINS - reutrns boolean if item is in array
        // isEMPTY - checks if array is empty
        // CLEAR - removes every elements from array
        HashSet<String> names = new HashSet<>();

        names.add("John");
        System.out.println(names);

        names.add("Samuel");
        names.remove("John");

        for (String name : names) {
            System.out.println(name);
        }

        // Queues *import LinkedList for queue*
        // Queue data structure is FIFO (First in first out). When data is deleted it is
        // deleted from the front
        // then data is added in the back
        // ADD - adds items to list (if queue full throws exception)
        // OFFER - adds items to list (if queue full returns false)
        // REMOVE - returns and removes the head of the queue (throws exception if
        // empty)
        // POLL - eturns and removes the head of the queue (returns null if empty)
        // ELEMENT - returns the head of the queue (throws exception if empty)
        // PEEK - returns the head of queue (throws null if empty)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(8);
        System.out.println(queue.poll());
        System.out.println(queue.element());

        // Stacks *import Stack*
        // push() - adds an element to the top of the stack
        // pop() - removes and returns the element at the top of the stack
        // peek() - returns the element at the top of the stack without removing it
        // size() - returns the number of elements in the stack
        // contains() - checks if a specific element is in the stack
        // empty() - checks if the stack is empty (true/false)
        // get(index) - returns the element at the given position in the stack
        // set(index, element) - replaces the element at the given position in the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(65);
        stack.push(7);
        stack.push(54);
        System.out.println("Stack: " + stack);
        System.out.println(stack.pop());

        // LinkedList - data structure for storing objects in linear order

    }
}
