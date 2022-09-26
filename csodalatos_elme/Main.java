package csodalatos_elme;

public class Main
{
    public static String clean(String text){
        text = text.replace("4", "A");
        text = text.replace("5", "S");
        text = text.replace("1", "I");
        text = text.replace("3", "E");
        text = text.replace("7", "T");
        text = text.replace("0", "O");
        return text;
        }
    

public static void main(String[] args)
{
    TEXT text = new TEXT();
    System.out.println(clean(text.line1));
    System.out.println(clean(text.line2));
    System.out.println(clean(text.line3));
    System.out.println(clean(text.line4));
    System.out.println(clean(text.line5));
    System.out.println(clean(text.line6));
    System.out.println(clean(text.line7));
    System.out.println(clean(text.line8));
    
}
}
