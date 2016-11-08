package com.practice.hackerrank;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
class Day7of30dayCodeChallenge{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Map<String,String> myMap = new HashMap<String,String>(); 
      for(int i = 0; i < n; i++){
          String name = in.next();
          String phone = in.next();
          // Write code here
          myMap.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
          // Write code here
          if(myMap.get(s)!=null)
          	System.out.println(s+"="+myMap.get(s));
          else
          	System.out.println("Not found");
      }
      in.close();
      
  }
}
