public class armstrong {

    int checkPalindrome ( int number ) {

        if ( number != 0 ) {
            int temp = number % 10 ;
            return (temp * temp * temp) + checkPalindrome( number / 10 );
        }
        return 0;
    }
    public static void main(String[] args) {
        int no = 153;
        armstrong obj = new armstrong();
        int arm = obj.checkPalindrome(no);
        if ( arm == no ) {

            System.out.println("Yes");
        }
        else {

            System.out.println("No");
        }
    }
}