import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args) {
        HashMaps hash = new HashMaps();
        hash.firstUniqueWord();
    }

    public void firstUniqueWord(){
    // You are given a list of words. Your task is to find the 
    // first word that appears exactly once in the list. If there is no unique word, return "none".

        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "grape"};
        HashMap<String, Integer> appears = new HashMap<>();

        for (int i = 0; i< fruits.length; i++){
            if (appears.containsKey(fruits[i])){
                System.out.println(fruits[i]);
            }
            appears.put(fruits[i], i);
        System.out.println("not in array");
        }
        System.out.println("Finished Code");
    }
}
