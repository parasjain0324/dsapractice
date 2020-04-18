public class selectionsort {
    void sort(int[] arr) {
        int min, temp=0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = min;
        }
        display(arr);
    }
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionsort obj = new selectionsort();
        obj.sort(arr);
    }
}