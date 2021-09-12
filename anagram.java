
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main
{
    public static void main(String[] args) {
        while(true)
        {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.split(" == ")[0];
        String s2 = s.split(" == ")[1];
        String regex = "\"([a-zA-Z]+)\"";
        Pattern pattern = Pattern.compile(regex);
        for (String name : s.split(" == "))
        {
            Matcher matcher = pattern.matcher(name);
            if(matcher.matches())
            {
            }
            else{
                System.out.println("ERROR");
            }
        }
        if(checkAnagram(s1, s2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        
    }    
    }
    public static boolean checkAnagram(String s1, String s2)
    {
        // Remove all the white space
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        
        // Check if both length matches
        if(s1.length() != s2.length())
            return false;
        else
        {
            // Convert both Strings into lower case and into Character Array
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            
            // Sort both Character Array
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            // Check if both arrays are equal
            return (Arrays.equals(arr1, arr2));
        }
}
}
