import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Write a Java program that accept three numbers from the user and print the largest number .*/
        System.out.println("Please enter three numbers to find the largest");
        System.out.println("Number one: ");
        int number1=input.nextInt();
        System.out.println("Number two: ");
        int number2=input.nextInt();
        System.out.println("Number three: ");
        int number3=input.nextInt();

        System.out.println("The largest of these numbers is: "+largestOfThree(number1,number2,number3));

        /*Write a Java program that accept a String and a number from the user,then print the character in the given index .*/

        System.out.println("\n-----------------------------------------------\n");
        input.nextLine();
        System.out.println("Write a sentence then give me a number and I will till you what letter is at that index");
        System.out.println("the sentence: ");
        String sentence = input.nextLine();
        int indexOf=0;
        System.out.println("the number: ");
        while (true){
            indexOf = input.nextInt();
            if (indexOf<sentence.length() && indexOf>=0){
             break;
            }
            System.out.println("Please enter a number between 0 and "+(sentence.length()-1));
        }

        System.out.println("The character at index "+indexOf+" is: "+indexOfSentence(sentence,indexOf));

         /*Write a program to enter the numbers till the user wants and at the end it should display the sum entered .*/

        System.out.println("\n-----------------------------------------------\n");
        System.out.println("Type any number of integers and i will give you the sum of them");
        int numbersToSum =0;
        int sum=0;
        do {
            System.out.println("Enter a number or 0 to quit");
            numbersToSum = input.nextInt();
            sum+=numbersToSum;
        }while(numbersToSum!=0);

        System.out.println("The total of all these numbers is: "+sum);

        /*Write a Java program to find positive and negative numbers of a given array:

          -  Original Array:
              [10, -21 , 30, 31, -25]
             -  Expected Output:
             10  is a positive number
             -21 is a negative number
              30 is a positive number
              31 is a positive number
             -25 is a negative number*/

        System.out.println("\n-----------------------------------------------\n");
        System.out.println("The positive and negative numbers of [10, -21 , 30, 31, -25] are: ");
        int[] positiveNegativeArray = {10,-21,30,31,-25};
        positiveNegative(positiveNegativeArray);



        /*Write a Java program to find a shortest word of a given array:
        - Original Array:
            [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
            - Expected Output:
             JAVA
        */

        System.out.println("\n-----------------------------------------------\n");
        System.out.println("The shortest word in the array is: ");
        String[] shortestWordArray={"Tuwaiq","Bootcamp","student","JAVA"};
        System.out.println(shortestWord(shortestWordArray));

    }

    public static int largestOfThree(int number1, int number2, int number3){
        if (number1>number2){
            if (number1>number3){
                return number1;
            }
        }else if(number2>number3)
            return number2;

        return number3;
    }

    public static char indexOfSentence(String sentence, int index){
        return sentence.charAt(index);
    }

    public static void positiveNegative(int[] arr){
        for (int i : arr){
            if(i>0)
                System.out.println(i+" is a positive number");
            if (i<0)
                System.out.println(i+" is a negative number");
        }
    }

    public static String shortestWord(String[] arr){
        String shortest = arr[0];
        for (String a : arr){
            if (shortest.length()> a.length())
                shortest=a;
        }

        return shortest;
    }
}