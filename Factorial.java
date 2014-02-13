package com.anuj.algorithms;

/**
 * 
 * @author Anuj
 * @source http://goldenpackagebyanuj.blogspot.in/2013/08/calculate-factorial-of-number-using-java-recursion.html
 */
public class Factorial {

 /**
  * @param args
  */
 public static void main(String[] args) {
  Factorial factorial = new Factorial();
  
  int result = factorial.fact(5);
  System.out.println(result);
 }
 
    public int fact(int num){
     if(num == 1){ 
      return 1;
     }
     num =  num * fact(num-1);
     return num;
    } 

}
