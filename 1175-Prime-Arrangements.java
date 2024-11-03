class Solution{
public int numPrimeArrangements(int n) {
    
    int mod = (int) (Math.pow(10,9) + 7);
    boolean[] arr=new boolean[n+1];
    int cntNonPrm = 1;
    
    for (int i = 2; i * i <= n; i++) {
        for (int j = i * 2; j <= n; j += i) {
            if(!arr[j]) {
                arr[j]=true;
                cntNonPrm++;
            }
        }
    }

    int cntPrm = n-cntNonPrm;
    long sum = 1;

    for (int i = 1; i <= Math.max(cntPrm, cntNonPrm) ; i++) {
        if (i <= Math.min(cntPrm, cntNonPrm)){
            sum *= ((long) i * i );
            sum %= mod;
        }
        else {
            sum *= i;
            sum %= mod;
        }
    }

    return (int) sum;
}
}