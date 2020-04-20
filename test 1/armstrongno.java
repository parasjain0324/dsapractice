import java.lang.Math;
public class armstrongno {
    void check(int no) {
        int temp = no, sum = 0;
        while (temp != 0) {
            sum = (int) (sum + Math.pow((temp%10), 3));
            temp = temp/10;
        }
        if(sum == no) {
            System.out.println("Yes, the Number is an Armstrong Number");
        }
        else {
            System.out.println("No, the Number is not an Armstrong Number");
        }
    }
    public static void main(String[] args) {
        int no = 372;
        armstrongno obj = new armstrongno();
        obj.check(no);
    }
}