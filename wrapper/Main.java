package wrapper;

import java.net.SocketTimeoutException;

import javax.naming.ldap.SortControl;

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("LogicalAnd eldönti a logikai és értékét 2 értéknek");
        System.out.println(Boolean.logicalAnd(a, b));
        System.out.println("hashCode() megadja egy bool érték hashcodeját");
        System.out.println(Boolean.hashCode(a));
        System.out.println(Integer.hashCode(12));
        System.out.println("Bináris reprezentáció fordított értékét adja meg");
        System.out.println(Integer.reverse(231412412));
        System.out.println("eldönti hogy végtelen tizedes jegy e");
        System.out.println(Double.isInfinite(3.123124124124));
        System.out.println("Megadja melyik a nagyobb a kettő közül");
        System.out.println(Double.max(3.213123123,6.123123123));
        System.out.println("eldönti hogy karakter e");
        System.out.println(Character.isDigit('s'));
        System.out.println("eldönti, hogy space karakter-e");
        System.out.println(Character.isSpaceChar(' '));
    }
    
}
