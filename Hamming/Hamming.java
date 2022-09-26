package Hamming;

public class Hamming {
    public static int distance(String a, String b){
        char[] first  = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        int distance = 0;
        
        int minLength = Math.min(first.length, second.length);
        
        for(int i = 0; i < minLength; i++)
        {
                if (first[i] != second[i])
                {
                    distance++;    
                }
        }
        return distance;
    }
}
