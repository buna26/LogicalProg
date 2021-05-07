import java.util.HashMap;
import java.util.Scanner;

public class NQT_2 {
    public static int anagram(char[] arr1,char[] arr2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : arr1){
            if (map1.containsKey(c)){
                map1.put(c, map1.get(c) + 1);
            }
            else{
                map1.put(c, 1);
            }
        }
        for(char d : arr2){
            if (map2.containsKey(d)){
                map2.put(d, map2.get(d) + 1);
            }
            else{
                map2.put(d, 1);
            }
        }

        if(map1.equals(map2)){
            return 1;
        }
        else return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        System.out.println(anagram(arr1,arr2));

    }
}
