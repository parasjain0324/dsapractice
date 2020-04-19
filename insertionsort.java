public class insertionsort{
    void sort(int[] arr) {
        int key,j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i-1;
            while (j>=0 && arr[j] > arr [j+1]) {
                arr[j+1] = arr[j];
                j--;
                arr[j+1] = key;
            }
            display(arr);
        }
    }
    void display(int[] arr) {
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {14,13,5,16,23,1};
        insertionsort obj = new insertionsort();
        obj.sort(arr);
    }
}