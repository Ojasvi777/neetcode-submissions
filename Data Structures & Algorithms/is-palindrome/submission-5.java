class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0 || s.length() ==1){
            return true;
        }
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        if (sb.length() == 0){
            return true;
        }

        int l = 0;
        int r = sb.length()-1;
        while(l<r){
            if(sb.charAt(l) != sb.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
