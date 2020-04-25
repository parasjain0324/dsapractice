import java.lang.Math;

class hello
{
    int palindrome(int num, int d){

        if(num == 0) {
            return 0;
        }
        else {
            return (int) (((num%10)*Math.pow(10,d-1)) + palindrome(num / 10, d-1));

        }

    }

    public static void main(String[] args)
    {
        hello palindrome = new hello();
//        int fact = 0;
        int num = 12121;
        int d = 5;
        int rev = palindrome.palindrome(num, d);
        if(num == rev){
            System.out.println("Yes the number is palindrome");
        }
        else {
            System.out.println("No the number is not palindrome");
        }
    }
}