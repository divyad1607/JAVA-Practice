public class sortedArr {
    public static void main(String[] args){
        int arr[] = {1,2,5,6,3};
        boolean isSorted = true;

        for(int i =1;i<arr.length;i++){
            if(arr[i] < arr[i+1]){
                isSorted = false;
                break;
            }
        }
    
    System.out.println(isSorted ? "Sorted ": "NotSorted");
    }
}
