package Math;

public class Main {
    public static void main(String[] args)
    {
      int a = 10;
      int b = 20;
      int c = -10;
      System.out.println("Az első szám: " + a + "\nA második szám: " + b + "\nHarmadik szám:" + c +"\nNézzük meg hogy milyen függvények vannak a Math osztályban!\n\n");
    System.out.println("Első \nMath.abs függvény: Vissza adja egy szám abszolút értékét");
    System.out.println("A c szám abszolút értéke:" + Math.abs(c));
    System.out.println("-------------------------------------------------------------------");
    System.out.println("Az első és a második szám közül kiválasztjuk a legnagyobbat, ami:" + Math.max(a,b) + "\n-------------------------------------------------------------------\nÉs a legkisebbet, ami: " + Math.min(a, b));
    System.out.println("-------------------------------------------------------------------");
    System.out.println("Tudunk random számot generálni 1 és nulla között: " + Math.random());
    System.out.println("-------------------------------------------------------------------");
    System.out.println("Állapítsuk meg az Első szám logaritmus értékét: " + Math.log(a));
}

}
