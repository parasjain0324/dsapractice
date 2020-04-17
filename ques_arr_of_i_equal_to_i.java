// WAP a program such that a[i] = i
// input {3,7,-1,2,-1,5,-1,-1,-1,1,0}
// output {0,1,2,3,-1,5,-1,7,-1,-1}

public class ques_arr_of_i_equal_to_i {
    int check(int[] arr, int start, int end) {
        int temp;
        if(start == end){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            return 0;
        }
        if(arr[end] == -1){
            return check(arr, start, end-1);
        }
        if(arr[start] == start){
            return check(arr, start+1, end);
        }
        if(arr[start] == -1) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return check(arr, start, end);
        }
        else {
            temp = arr[start];
            arr[start] = arr[arr[start]];
            arr[arr[start]] = arr[start];
            return check(arr, start, end);
        }
    }
    public static void main(String[] args){
        int[] arr = {3,7,-1,2,-1,5,-1,-1,-1,1,0};
        ques_arr_of_i_equal_to_i obj = new ques_arr_of_i_equal_to_i();
        int arrnew = obj.check(arr, 0, (arr.length)-1);
    }
}