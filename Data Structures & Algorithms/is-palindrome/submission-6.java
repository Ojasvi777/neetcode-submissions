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

      return  sb.toString().equals(sb.reverse().toString());
    }
}
