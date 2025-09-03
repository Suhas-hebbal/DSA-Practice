class Solution {
    public boolean isArmstrong(int n) {
       int org=n;
       int countDig=0;

       int temp=n;
       while(temp>0){
        temp=temp/10;
        countDig++;
       }

       int sum=0;
       while(n!=0){
        int rem=n%10;
        sum=sum+(int)Math.pow(rem,countDig);
        n=n/10;
       }

       return org==sum;
    }
}
