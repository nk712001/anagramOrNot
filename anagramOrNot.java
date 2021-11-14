package assignmentEdyoda2;
import java.util.Scanner;
import java.util.Arrays;

public class anagramOrNot {
        public static boolean isAnagram(String str1,String str2){
             if (str1.length()!=str2.length()) {
                     return false;
             }else {
                     char[] str1arr=str1.toCharArray();
                     char[] str2arr=str2.toCharArray();
                        Arrays.sort(str1arr);
                        Arrays.sort(str2arr);

             return Arrays.equals(str1arr,str2arr);
        }}

        public static void main(String []args) {
                System.out.println("enter strings to check anagram are not: ");
                Scanner input = new Scanner(System.in);
                String str1=input.next();

                Scanner input1 = new Scanner(System.in);
                String str2=input1.next();

                if (isAnagram(str1,str2)){
                        str1=str1.replaceAll("\\s","").toLowerCase();
                        str2=str2.replaceAll("\\s","").toLowerCase();

                        System.out.println(str1+" and "+str2+" are anagrams");
                }else {
                        System.out.println(str1+" and "+str2+" are not anagrams");
                }

        }}

