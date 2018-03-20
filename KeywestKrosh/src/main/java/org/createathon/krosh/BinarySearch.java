package Misc;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class BinarySearch {

  static Scanner sc = new Scanner(System.in);
  
  public static void main(String args[]) {
    System.out.println("Welcome to number guess game! Please type 'ready' to play");
        String response = sc.nextLine();
        if(response.equalsIgnoreCase("ready")) {
        HashMap <String,Integer> map = getTheEndRange();
        performBinarySearch(map.get("start"),map.get("end"));
        }else {
          System.exit(0);
        }
  }
  
  
  private static HashMap<String,Integer> getTheEndRange() {
      Random randomno = new Random();
      Map<String,Integer> mp = new HashMap<String,Integer>();
      int exclusiveVal=100;
      int higher=0;
      int lower=0;
        while(true){
         higher = randomno.nextInt(exclusiveVal);
         System.out.println("Is the number:"+higher +" ? : Reply only higher,lower or yes");
         String response = sc.nextLine();
         if(response.equalsIgnoreCase("lower"))
           break;
         else if(response.equalsIgnoreCase("higher")) {
           lower=higher;
           exclusiveVal=exclusiveVal*10;   
         }else if(response.equalsIgnoreCase("yes")) {
           System.out.println("Bingo");
           System.exit(0);
         }
       }
        mp.put("start",lower);
        mp.put("end", higher);
        return (HashMap<String, Integer>) mp;
  }


  public static void performBinarySearch(int left, int right) {
    
        int start=left;
        int end=right;
        while(true) {
      int mid = start + (end-start)/2;
          String response = getHigherLower(mid);
          if(response.equalsIgnoreCase("higher")) {  
            start=mid+1;
          }else if(response.equalsIgnoreCase("lower")) {
              end=mid-1;   
          }else if(response.equalsIgnoreCase("yes")){
             System.out.println("Bingo");
             System.exit(0);
           }
    }
    
  }
  
  public static String getHigherLower(int num){
    
        String response;
        while(true){
        System.out.println("Is the number:"+num +" ? : Reply only higher,lower or yes");
        response = sc.nextLine();
        if(response.equalsIgnoreCase("higher")|| response.equalsIgnoreCase("lower")||response.equalsIgnoreCase("yes"))
        break;
        }   
        return response;
  }
  
}
