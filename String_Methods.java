package String_by_AnujBhiya;

import java.util.Locale;
import java.util.*;

public class String_Methods {
    public static void main(String[] args) {
//        String name = "  Devendra2001 ";

        //toUpperCase()
       // System.out.println(name.toUpperCase());

        //toLowerCase()
       // System.out.println(name.toLowerCase());

        //trim() - Remove Spaces
       // System.out.println(name.trim());

        //charAt() - Index Position Check and Print
     //   System.out.println(name.charAt(3));

        //Replace()- Replace Element
//        System.out.println(name.replace("Devendra", "Shimpi"));

        //String letters = "I love Java, Java is, good Language";

        //Split() - Spaces Basic Split Element
       // String words[] = letters.split("a");//regex = Regular Expression
      //  for(String word: words){
       //     System.out.println(word);
       // }


        //Substring() - Only Required Element Print On Indexes
        //String substring = letters.substring(2,5);//Inclusive Exclusive
        //System.out.println(substring);

        //String newSentence = letters.replace("Java", "Cpp");

       // System.out.println(letters);

       // System.out.println(newSentence);

        //Contains ->return BooleanForm True or False -Present Or Not
      //  System.out.println(letters.contains("Cpp"));



        //valueOf - datatype convert into string
       // int age = 123;
      //String stringAge = String.valueOf(age);
        //System.out.println(age+2); //125 Print
        //System.out.println(stringAge+2); //1232 Print Because This Is String


        //toCharArray - String Convert to CharArray
       // String color = "Browm is my fav color!";
        //char letters[] = color.toCharArray();
      //  for(char letter:letters){
        //    System.out.println(letter);
       // }



        String animal = " ";
        if(animal.isEmpty()){
            System.out.println("empty");
        }else if(animal.isBlank()){
            System.out.println("Blank");
        }







    }
}
