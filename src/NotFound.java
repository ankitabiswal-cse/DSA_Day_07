public class NotFound {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 20, 25};

        int target = 10;
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] > target) {
                right= mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found At Index :" + result);
        }
    }
}
