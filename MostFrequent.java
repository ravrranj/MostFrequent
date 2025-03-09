import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class MostFrequent {
  public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);

   //input
   System.out.println("Enter the array (Space-seperated numbers ) : ");
   String input = sc.nextLine();

   // convert the input string into an integer array
   String [] inputArr = input.split(" ");
   int arr[] = new int[inputArr.length];

   for(int i = 0; i < inputArr.length; i++){
   arr[i] = Integer.parseInt(inputArr[i]);   // convert the int
   }

   //HashMap to store numbers
   Map<Integer,Integer> freqMap = new HashMap<>();
   
   for (int num : arr) {
    freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

   }

  // print the repeated number that has appeared most or most frequent number 

  int MostFrequentNum = -1;
  int maxFrequency = 0;

  for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
    if(entry.getValue() > maxFrequency) {
        maxFrequency = entry.getValue();
        MostFrequentNum = entry.getKey();
    }
  }

  //print the most frequent number
  System.out.println("Most frequent number: " +  MostFrequentNum + " (appeared " + maxFrequency + " times)");
  sc.close();

  }


}