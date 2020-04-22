public class quicksort {
    void sort(int[] arr, int l, int h){
        int p = arr[l];
        int i = l, j = h;
        int temp;
        while (i < j) {
            if (arr[i] < p)
                i++;
            if (arr[j] > p)
                j--;
            if(arr[i] > p && arr[j] < p){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = p;
        p = arr[j];
        arr[j] = p;

        sort(arr, l, j-1);
        sort(arr, j+1, h);
    }
    void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int[] arr = {10,5,8,9,3,6,15,12,16,20};
        quicksort obj = new quicksort();
        obj.print(arr);
        obj.sort(arr, 0, arr.length-1);
        obj.print(arr);
    }
}