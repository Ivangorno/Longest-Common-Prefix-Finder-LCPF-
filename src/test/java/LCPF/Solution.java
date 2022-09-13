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
        String word = input.nextLine();
        listOfWords.add(word);

        while (!word.equalsIgnoreCase("end")){
            System.out.println("Enter another word to compere OR enter \"End\" to stop: ");
            word  = input.nextLine();
            listOfWords.add(word);}

        listOfWords.remove(listOfWords.size()-1);

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
          char oneChar = listOfWords.get(0).charAt(i);
          for (String currentWord : listOfWords) {
              if (currentWord.charAt(i) != oneChar){
                  return commonPrefix.toString();
              }
          }
          commonPrefix.append(oneChar);
      }

    return  commonPrefix.toString();

    }

    public static void main(String[] args) {
        input();
        System.out.println("Your LONGEST COMMON PREFIX is: \"" + findPrefix() + "\"");
    }
}


