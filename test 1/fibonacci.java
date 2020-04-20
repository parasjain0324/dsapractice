public class fibonacci {
    int fibonacciseries(int n1, int n2, int no) {
        if(n2 > no){
            return 0;
        }
        else{
            System.out.print(n2 + " ");
            return fibonacciseries(n2, n1+n2, no);
        }
    }
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int no = 610;
        fibonacci obj = new fibonacci();
        System.out.print(n1 + " ");
        int series = obj.fibonacciseries(n1,n2,no);
    }
}