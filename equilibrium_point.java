public class equilibrium_point {
    void check_equilibrium(int arr[]) {
        int leftsum, rightsum;
        for (int i = 1; i < (arr.length); i = i + 2) {
            leftsum = left_count(arr, i);
            rightsum = right_count(arr, i);
            if (leftsum == rightsum) {
                System.out.println(leftsum + ", " + rightsum);
                System.out.println("Equilibrium Position is : " + (i + 1));
                break;
            } else {
                continue;
            }
        }
    }
    int left_count(int arr[], int m){
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    int right_count(int arr[], int m){
        int sum = 0;
        for (int i = arr.length-1; i > m; i--) {
            sum = sum + arr[i];
        }
        return sum;
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    public static void main(String[] args)
    {
        equilibrium_point rearrange = new equilibrium_point();
        int arr[] = {-2, -7, 1, 5, 2, -4, 3, 0, -2};

        System.out.println("Given array is ");
        rearrange.printArray(arr);

        rearrange.check_equilibrium(arr);

    }
}
