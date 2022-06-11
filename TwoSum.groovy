/** Write a method that checks if there is at least one pair of
 *  numbers in an array whith sum equal to a chosen target. For
 *  example:
 *
 *  arr = [1, 3, 4]
 *  target = 5
 *
 *  result is true because the pair (1, 4) sums to 5.
 */

import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class TwoSum {
  String twoSum(arrayInt, targetInt) {
    def result = false
    for (int p : arrayInt) {
      for (int q : arrayInt) {
        if ((p != q) && (p+q == targetInt)) {
          result = true
        }
      }
    }
    if (result == true) {
      return "At least one pair has sum equal to $targetInt!"
    }
    else {
      return "No pair has sum equal to $targetInt!"
    }
  }
  
  static void main(String[] args) {
    print("Enter array of integers (space separated e.g. '1 2 3'): ")
    int[] arrayInt = System.in.newReader().readLine().split(" ").collect{it as int}
    print("Enter target: ")
    int targetInt = System.in.newReader().readLine().trim() as Integer
    def obj = new TwoSum()
    String result = obj.twoSum(arrayInt, targetInt)
    println(result)
  }
}
