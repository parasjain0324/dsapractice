public class binarysearch{
    int search(int[] arr, int start, int end, int no){
        int mid = (end + start)/2;
        if (arr[mid] == no) {
            return mid;
        }
        else if(start == end) {
            return -1;
        }
        else if (no > arr[mid]) {
            return search(arr, mid+1, end, no);
        }
        else if (no < arr[mid]) {
            return search(arr, start, mid-1, no);
        }
        else
            return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,3,4,9,15,17,21,31,33,35,36,37,41,42,44,48,50};
        int no = 50;
        binarysearch obj = new binarysearch();
        int pos = obj.search(arr, 0, arr.length-1, no);
        if (pos == -1) {
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at position " + (pos+1));
    }
}