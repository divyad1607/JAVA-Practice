public class CountCh {
    public static void main(String[] args){
        String s = "apple";
        for(char ch:s.toCharArray()){
            int count =0;
            for(char c:s.toCharArray()){
                if(ch==c)
                count++;
            }
            System.out.println(ch+ ":" +count);
        }
    }
    
}
