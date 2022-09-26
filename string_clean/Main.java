package string_clean;

public class Main {

    public static String clean(String text){
        return text.replace(" ", "");
    }
    public static void main(String[] args)
    {
        String text = "192.20.246.138:\n 6666";
        System.out.println(clean(text));
        
        
    }
}
