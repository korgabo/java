package Texaseanger;

import java.util.ArrayList;


public class PyUtils {
    public static ArrayList<Integer> range(int also, int felso){
        ArrayList<Integer> intervallum = new ArrayList<>();
        for(int i = also; i < felso; i++){
            intervallum.add(i);
        }
        return intervallum;
    }
    public static ArrayList<Integer>range(int felso){
        ArrayList<Integer> intervallum = new ArrayList<>();
        for(int i= 0; i < felso; i++){
            intervallum.add(i);
        }
        return intervallum;
    }

    public static ArrayList<Integer> range(int also, int felso, int lepeskoz){
        ArrayList<Integer> intervallum = new ArrayList<>();
        for(int i = also; i < felso; i+= lepeskoz){
            intervallum.add(i);
        }
        return intervallum;
    }

}
