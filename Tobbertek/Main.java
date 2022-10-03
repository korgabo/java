package Tobbertek;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static int[] MinMax1(List<Integer> lista){
        int min = lista.get(0);
        int max= lista.get(0);
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i) < min){
                min = lista.get(i);
            }
            if(lista.get(i) > max){
                max = lista.get(i);
            }
        }
        return new int[] {min, max};
    }

    public static List<Integer> MinMax2(List<Integer> lista){

        int min = lista.get(0);
        int max= lista.get(0);
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i) < min){
                min = lista.get(i);
            }
            if(lista.get(i) > max){
                max = lista.get(i);
            }
        }
        List<Integer> minmax = new ArrayList<Integer>(List.of(min, max));
        return minmax;
    }

    public static MinMax getminmax(List<Integer> lista){

        int min = lista.get(0);
        int max= lista.get(0);
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i) < min){
                min = lista.get(i);
            }
            if(lista.get(i) > max){
                max = lista.get(i);
            }
        }
        return new MinMax(min, max);
    }

    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
        szamok.add(1);
        System.out.println(szamok); 
        System.out.println("Tömbbel:");
        System.out.println("A lista legkisebb eleme: " + (MinMax1(szamok)[0]) + "\nA lista legnagyobb eleme: " + (MinMax1(szamok)[1]));  
        System.out.println();
        System.out.println("Listával:");
        System.out.println("A lista legkisebb eleme: " + (MinMax2(szamok).get(0)) + "\nA lista legnagyobb eleme: " + (MinMax2(szamok).get(1)));  
        System.out.println();
        System.out.println("Objektummal");
        MinMax minmax = getminmax(szamok);
        System.out.println("A lista legkisebb eleme: " + minmax.min + "\nA lista legnagyobb eleme: " + minmax.max);  
        }
    
}

