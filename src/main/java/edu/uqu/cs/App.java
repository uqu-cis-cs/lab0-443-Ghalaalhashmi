package edu.uqu.cs;
import java.util.Scanner;
/**
* Lab 0 
* CS 1312
*/
/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line.*/
public static void twisters(){
    for( int num=1 , from =20 ;num<=from;num++){
        if(num%2!=0&&num%4!=0&&num%6!=0){
            System.out.print(" "+num+" ");}
        /* Also, it does the following:*/
        if (num%2==0){
            System.out.print("Tweetle");}
 /* - If the number is a multiple of 2, print "Tweetle"*/
        if(num%4==0){
            System.out.print("Beetle");}
/* - If the number is a multiple of 4, print "Beetle"*/
        if (num%6==0){
            System.out.print("Poodle");}
/* - If the number is a multiple of 6, print "Poodle"*/
        if (num%11==0){
                System.out.print("\n");}
// - Otherwise just print the number//
    }
/* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
}
/*
* Write a method named "phoneKeypad" that takes a string parameter (str)*/
public static void phoneKeypad(String str){
    String NCT = "";
/* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: */
    for(    char STatment  :  str.toUpperCase().toCharArray()    ){
        switch (STatment){
            case'A':case'B':case'C':
              NCT+=2;
              //* ABC = 2;
              break;
            case'D':case'E':case'F':
              NCT+=3;
              //* DEF = 3;
              break;
            case'G':case'H':case'I': 
              NCT+=4;
              //* GHI = 4;
              break;
            case'J':case'K':case'L':
              NCT+=5;
              //* JKL = 5;
              break;
            case'M':case'N':case'O':
              NCT+=6;
              //* MNO = 6;
              break;
            case'P':case'Q':case'R':case'S':
              NCT+=7;
              //* PQRS = 7;
              break;          
            case'T':case'U':case'V':
              NCT+=8;
              //* TUV = 8;
              break;
            case'W':case'X':case'Y':case'Z':
              NCT+=9;
              //* WXYZ = 9;
              break;                
        }
    } 
    System.out.println(NCT);
    /* *
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
}
  public static void main(String [] args) {
        /* Write your code here */
       //call method twisters()
        twisters();
       //prompt user to enter a string
      System . out .println("\n"+" Enter a stetment :");
       Scanner sii = new Scanner(System.in);
       String vii= sii.nextLine();
       phoneKeypad(vii);
       //call method phoneKeypad(string)


   }
}