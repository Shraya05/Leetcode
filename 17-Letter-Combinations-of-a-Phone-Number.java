class Solution {
     private static final String[] key = {
        \\,    // 0 (no letters)
        \\,    // 1 (no letters)
         \abc\,// 2
        \def\, // 3
        \ghi\, // 4
        \jkl\, // 5
        \mno\, // 6
        \pqrs\,// 7
        \tuv\, // 8
        \wxyz\ // 9
    };
    public void rec(StringBuilder s, List<String> res, int i, int len, String d){
        if(i == len){
            res.add(s.toString());
            return;
        }
        for(char c : key[d.charAt(i) - '0'].toCharArray()){
            s.append(c);
            rec(s, res, i + 1, len, d);
            s.deleteCharAt(s.length() - 1);
        }
    }
    public List<String> letterCombinations(String d) {
        if(d.isEmpty()) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        rec(new StringBuilder(), res, 0, d.length(), d);
        return res;
    }
}