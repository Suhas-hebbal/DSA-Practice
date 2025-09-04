class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        printRecNum(1,n);
    }

    public void printRecNum(int i,int n){
      if(i>n){
        return;
      }

      System.out.println(i);
      printRecNum(i+1,n);
    }
}
