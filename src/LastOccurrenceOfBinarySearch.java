public class LastOccurrenceOfBinarySearch {
    public static void main(String[] args){

        int[] arr = {2,3,4,4,4,5,6,7,8,9};

        int target = 4;
        int left = 0;
        int right = arr.length - 1;

        int result = -1;

        while(left <= right){
            int mid =left+(right - left)/2;

            if(arr[mid] == target ){
                result = mid;
                left = mid + 1;
            }else if(target > arr[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }
        if(result != -1) {
            System.out.println("Last Occurrence at index " + result);

        }else{
            System.out.println("Element not Found");
        }
    }
}
