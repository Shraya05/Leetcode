class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
            return 1;
        if(n==1)
            return 0;
        int finalResult = 0;
        int count = 0;
        while(n>0) {
        	int bit = n%2;
        	finalResult += ((bit^1) * (Math.pow(2,count)));
        	n/=2;
        	count++;
        }
		return finalResult;
    }
}