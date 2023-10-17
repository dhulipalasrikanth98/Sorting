public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        for(int i = 0; i < arr.length;i++){
            int didSwap = 0;
            for(int j = 0;j < arr.length- i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0)
                break;
            System.out.println("swap happend");
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
