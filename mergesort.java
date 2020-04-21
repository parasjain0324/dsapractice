public class mergesort {
    void merge(int arr[], int l, int mid, int h) {
        int n1 = mid - l + 1;
        int n2 = h - mid;
        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[ l + i ];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[ mid + 1 + j ];
        }

        int i=0, j=0, k=l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
//        return arr[];
    }
    void mergesortt(int[] arr, int l, int h){
        if(l<h){
            int mid = (l+h)/2;
            mergesortt(arr, l, mid);
            mergesortt(arr, mid+1, h);

            merge(arr, l, mid, h);
        }
//        printarr(arr);
    }
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        mergesort obj = new mergesort();
        obj.mergesortt(arr, 0, arr.length - 1);
        printarr(arr);
    }
}