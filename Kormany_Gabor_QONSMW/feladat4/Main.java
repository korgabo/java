

import java.util.List;

public class Main{
    public static void main(String[] args) {
        if(args.length != 1){
            System.err.println("Hiba! Paraméterben egy fájlt adjon meg feldolgozásra!");
            System.exit(1);
        }

        String fname = args[0];
        String gyarto = "A5:B8:F9";
        int gyartocount = 0;
        List<String> sorok = FileUtils.readLines(fname);
        for(String sor: sorok){
        String[] hn = sor.split(":"); 
        String gyartocheck = hn[0] +":"+ hn[1] +":"+ hn[2];  
        if(gyartocheck.equals(gyarto)){
            gyartocount+=1; 
        }
    }
        System.out.println(gyartocount);
    }
}