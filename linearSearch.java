public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 9, 5, 7, 6, 2, 4, 3 };
        int key = 3;        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("Key is present at index " + (i+1));
                break;
            }
        }
    }
}
