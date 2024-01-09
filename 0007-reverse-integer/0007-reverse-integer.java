class Solution {
    public int reverse(int x) {
        int sum=0,rem;
        int temp=0;
        while(x!=0){
            rem=x%10;
            temp=temp*10+rem;
            if((temp-rem)/10 != sum)
            {return 0;}
            sum=temp;
            x=x/10;
        }
        return sum;
        
    }
}
