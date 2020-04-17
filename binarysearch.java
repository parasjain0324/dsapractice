public class binarysearch{
    int search(int[] arr, int start, int end, int no){
        int mid = (end - start)/2;
        if (mid == no) {
            return mid;
        }
        else if (arr[mid] > no) {
            return search(arr, mid+1, end, no);
        }
        else if (arr[mid] < no) {
            return search(arr, start, mid-1, no);
        }
        else
            return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,3,4,7,9,15,17,21,31};
        int no = 7;
        binarysearch obj = new binarysearch();
        int pos = obj.search(arr, 0, arr.length-1, no);
        if (pos == -1) {
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at position " + pos);
    }
}