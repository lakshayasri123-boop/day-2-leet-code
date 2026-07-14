class Solution {
    public int reverse (int x){
        if(x==0)
        return 0;
        int rev=0;
        int z=Math.abs(x);
        while(z>0){
            int rem=z%10;
            rev=rev*10+rem;
            z=z/10;
        }
        StringBuffer s=new StringBuffer(""+rev);
        s.reverse();
        if((""+Math.abs(x)).contains(s))
return(x/Math.abs(x))*rev;
else
return 0;
    }
}
