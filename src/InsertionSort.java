public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,10,12,3,15,7,3,1};
        int i = 0, j = 1;
        while(i < arr.length){
           for( j = i ; j >0; j--){
               if(arr[j] < arr[j - 1]){
                   int temp = arr[j - 1];
                   arr[j - 1] = arr[j];
                   arr[j] = temp;
               }
            }
           i++;
        }
        for(int k: arr){
            System.out.println(k);
        }
    }
}
