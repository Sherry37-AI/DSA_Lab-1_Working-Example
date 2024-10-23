public class ArrayReverse {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] array = {55, 56, 57, 58, 59};
        reverseArray(array);
        
        // Print the reversed array
        for (int num : array) {
            System.out.print(num + " "); 
        }
    }
}
