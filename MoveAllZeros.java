public class MoveAllZeros {
    public static void main(String[] args){
        int arr[] = {1,2,0,1,0,0,5};
        int index = 0;

        for(int n : arr){
            if(n!=0)
            arr[index++] = n;
        }
        while(index < arr.length)
        arr[index++] = 0;

        for(int n : arr)
        System.out.print(n+ " ");
    }
    
}
