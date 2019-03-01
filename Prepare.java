import java.util.Scanner;
public class Prepare{
  
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter te size of the array: ");
    int size = input.nextInt();
    
    int [] numbers = new int[size];
    System.out.println("Enter Array: ");
    for(int i=0; i<size; i++){
      numbers[i] = input.nextInt();
    }
    
    for(int j=0; j<size; j++){
      System.out.println("index"+j+":"+numbers[j]);
    }
  }
}