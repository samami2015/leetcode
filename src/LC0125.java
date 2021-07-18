public class LC0125 {
    public static void main(String[] args) {
        LC0125 solution = new LC0125();
        String s = "A man, a plan, a canal: Panama";
        //String s = "race a car";
        boolean ans = solution.isPalindrome(s);
        System.out.println(ans);
    }

/*    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        StringBuffer sb_rev = new StringBuffer(sb).reverse();
        return sb.toString().equals(sb_rev.toString());
    }*/

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }

}