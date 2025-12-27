class Solution {
    public int reverse(int x) {
        int number = Math.abs(x);

        int rev =0;
         while(number!=0){
            int ld= number %10;

            if(rev>(Integer.MAX_VALUE -ld)/10){
                return 0;
            }

            rev = rev*10 +ld;
            number= number /10;
         }
         return(x<0)? (-rev) : rev;
    }
}