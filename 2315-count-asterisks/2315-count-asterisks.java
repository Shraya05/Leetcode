class Solution {
    public int countAsterisks(String s) {
        boolean bar=false;
        int count=0;

        for(char c : s.toCharArray()){
            if(bar == false && c == '|') bar = true;
            else if(bar == true && c == '|') bar = false;
            
            if(!bar) {
                if(c == '*') count++;
            }
        }

        return count;
    }
}