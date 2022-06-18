/** A staircase of size (say n = 5) is combination of white spaces and #:
 *
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 *
 *  where number of #'s at bottom is equal to n. Whrite a method to print
 *  a staircase for a given integer n as input.
 */
 
class StairCase {
  def stairCase = ""
  
  String stairCase(stairCaseSize) {
    for (int i = 1; i < stairCaseSize + 1; i++) {
      for (int j = 0; j < stairCaseSize - i; j++) {
        this.stairCase += " "
      }
      for (int k = 0; k < i; k++) {
        stairCase += "#"
      }
      stairCase += "\n"
    }
    return this.stairCase
  }
  
  static void main(String[] args) {
    print("Size of staicase: ")
    int stairCaseSize = System.in.newReader().readLine().trim() as Integer
    def obj = new StairCase()
    String result = obj.stairCase(stairCaseSize)
    println("The staircase of size $stairCaseSize!")
    println(result)
  }
}
