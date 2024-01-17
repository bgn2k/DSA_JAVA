package Strings.Palindrome;

public class Tester {
    public static void main(String[] args) {
        String str = "ABA";
        System.out.println("\nNaive Approach: ");
        System.out.println(naiveApp(str));
        System.out.print("\nEff Approach: ");
        System.out.println(effApp(str));
    }

    private static boolean effApp(String str) {
        int l = 0; 
        int r = str.length()-1;
        System.out.println("\nIs Palindrome: ");
        while(l <= r){
            if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    private static boolean naiveApp(String str) {
                String revStr = "";
        System.out.println("Str: " + str);
        for(int i = str.length() - 1; i >= 0;i--){
            revStr = revStr + str.charAt(i);
        }
        System.out.println("Reversed Str: " + revStr);
        System.out.println("Is Palindrome: ");
        if(str.equalsIgnoreCase(revStr))
            // System.out.println("Str is a palidrome!");
            return true;
        else    
            // System.out.println("String is NOT palidrome");
            return false;
    }
}
