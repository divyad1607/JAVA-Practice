public class CountWordinaStr {
    public static void main(String[] args){
        String s ="Java is very easy";
        String[] words = s.trim().split("\\s+");
        System.out.print(words.length);
    }
    
}
