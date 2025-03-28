class Solution {
    public List<String> restoreIpAddresses(String s) {
         List<String> res = new ArrayList<>();
        List<String> arr = new ArrayList<>();
        dfs(s, arr, 0, res);
        return res;
    }

    private void dfs(String s, List<String> arr, int start, List<String> res) {
        if (start == s.length() && arr.size() == 4) {
            res.add(String.join(\.\, arr));
            return;
        }
        if (start == s.length() || arr.size() == 4) {
            return;
        }
        String num = \\;
        for (int i = start; i < s.length() && Integer.parseInt(num + s.charAt(i)) <= 255; i++) {
            if (s.charAt(start) == '0' && i != start) break;
            num += s.charAt(i);
            arr.add(num);
            dfs(s, arr, i + 1, res);
            arr.remove(arr.size() - 1);
        }
    }
}