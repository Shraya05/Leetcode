class Solution {
    public int lengthOfLastWord(String s) {
        String str1=s.trim();
        String[] str=str1.split(\\\\\s+\);
        return str[str.length-1].length();

    }
}
