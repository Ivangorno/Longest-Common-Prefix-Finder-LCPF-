package LCPF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  static ArrayList<String> listOfWords = new ArrayList<>();
  static String word;

    private static void input() {

        System.out.println("Enter the first word: ");
        Scanner input = new Scanner(System.in);
        listOfWords.add(input.nextLine());

        System.out.println("Enter another word to compere OR enter \"any number\" to stop: ");
        while (!input.hasNextInt()){
            System.out.println("Enter another word to compere OR enter \"any number\" to stop: ");
            word  = input.nextLine();
            listOfWords.add(word);}

    }
    public static String findPrefix() {

       StringBuilder commonPrefix = new StringBuilder();

        String shortestWord = "";

        for( String word : listOfWords ){
            if (shortestWord.length() ==0  && word.length() !=0  )
            {
                shortestWord = word;
            } else if(shortestWord.length() > word.length() && word.length() != 0  ){

            }
            shortestWord = word;
            }



      for (int i = 0; i< shortestWord.length();i++){
          char prefix = listOfWords.get(0).charAt(i);
          for (String word : listOfWords) {
              if (word.charAt(i) != prefix){
                  return commonPrefix.toString();
              }
          }
          commonPrefix.append(prefix);
      }

    return  commonPrefix.toString();

    }

    public static void main(String[] args) {
        input();
        System.out.println("Your LONGEST COMMON PREFIX is: \"" + findPrefix() + "\"");
    }
}


