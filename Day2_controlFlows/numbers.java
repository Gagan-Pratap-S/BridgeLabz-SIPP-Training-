package Day2_controlFlows;

import java.util.*;
public class numbers{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

      if(n>0){
        System.out.println("positive");
      }
      else if(n<0){
        System.out.println("negative");
      } else{
        System.out.println("zero");
      }
    
        
    }
}