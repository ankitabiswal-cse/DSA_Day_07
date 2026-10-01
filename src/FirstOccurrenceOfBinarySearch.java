public class FirstOccurrenceOfBinarySearch {
    public static void main(String[] args){

        int[] arr = {2,7,8,4,4,4,7,9};

        int target = 4;
        int left = 0;
        int right = arr.length - 1;

        int result = -1;

        while(left <= right){

            int mid = left+(right - left)/2;

            if(arr[mid] == target){
                result = mid;
                right = mid - 1;
            }
            else if(target < arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println("First Occurrence At Index "+result);
    }
}
