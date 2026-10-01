public class CountOccurrenceBS {
    static int
    firstOccurrence(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        int index = -1;

        while(left <= right){
            int mid = left+(right - left)/2;

            if(arr[mid] == target){
                index = mid;
                right = mid-1;
            }
            else if(target > arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return index;
    }
    static int
    lastOccurrence(int[] arr,int target){

        int left = 0;
        int right = arr.length - 1;

        int index = -1;

        while(left <= right){
            int mid = left+(right - left)/2;

            if(arr[mid] == target){
                index = mid;
                left = mid+1;
            }
            else if(arr[mid] > target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,4,4,7,9};
        int target = 4;

        int first = firstOccurrence(arr,target);
        int last = lastOccurrence(arr,target);

        if(first != -1){
            int count = last - first + 1;

        System.out.println("Count = " +count);
        }else{
            System.out.println("Element not Found");
        }
    }
}
