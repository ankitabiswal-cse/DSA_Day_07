public class Searching {
    public static void main(String[] args){

        int[] arr = {2,5,8,12,16,20,25};

        int target = 20;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
        int mid = left +(right - left)/2;

            if(target == arr[mid]){
                System.out.println("Element Found At Index "+ mid);
                break;
            }else if(target < arr[mid]){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
    }
}
