import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Set<String> s = new HashSet<String>();
        s.add("break");
        s.add("case");
        s.add("continue");
        s.add("default");
        s.add("defer");
        s.add("else");
        s.add("for");
        s.add("func");
        s.add("goto");
        s.add("if");
        s.add("map");
        s.add("range");
        s.add("return");
        s.add("struct");
        s.add( "type");
        s.add("var");
        if(s.contains(input)){
            System.out.println(input+" is a keyword");
        }
        else System.out.println(input+" is not a keyword");
    }
}
