public class bubblesort{
    void sort(int[] arr){
        int temp;
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        display(arr);
    }
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,54,23,67,32,56,87,22,34,21};
        bubblesort obj = new bubblesort();
        obj.sort(arr);
    }
}