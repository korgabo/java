package feladat3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy szöveget: ");
        String s = sc.nextLine();
        sc.close();
        
        String[] array = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< array.length; i++){
            if(array[i].equals("bad")){
                sb.append("good ");
            }
            else if(array[i].equals("bad,")){
                sb.append("good, ");
            }
            else if(array[i].equals("bad.")){
                sb.append("good.");
            }
            else if(array[i].equals("good,")){
                sb.append("bad, ");
            }
            else if(array[i].equals("good.")){
                sb.append("bad.Ap ");
            }
            else if(array[i].equals("good")){
                sb.append("bad ");
            }
            else{
            sb.append(array[i]+ " ");
            }
        }
         
        //s = s.replace("bad", "good");
        //s = s.replace("good", "bad");
        System.out.println("Kimenet: " + sb.toString());
    }
}