public class StrPalindrome {
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(right>left){
        if(!Character.isLetterOrDigit(s.charAt(left))){
            left++ ;
        };
        if(!Character.isLetterOrDigit(s.charAt(right))){
            right-- ;
        }
        else if (Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
            return false;
        }
        else{
            left++;
            right--;
        }
        }
        return true;
    }

    public static void main(String[] args) {
        StrPalindrome res = new StrPalindrome();
        Boolean check = res.isPalindrome("Race a Car");
        System.out.println(check);
    }
}
