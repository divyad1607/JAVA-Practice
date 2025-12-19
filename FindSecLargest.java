public class FindSecLargest {
    public static void main(String[] args){
        int arr[] = {10,5,20,8};

        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
         for(int n : arr){
            if(n > largest){
                SecondLargest = largest;
                largest =n;
            }else if (n>SecondLargest && n!= largest) {
                SecondLargest = n;
            }
         }
         System.out.println("Second largest: " +SecondLargest);

    }
    
}
