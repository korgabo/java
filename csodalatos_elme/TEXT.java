package csodalatos_elme;

public class TEXT {
    String line1 = "3Z 4Z UZ3N37 4Z7 4 C3L7 5Z0LG4LJ4, H0GY B3B1Z0NY1754";
    String line2 = "M1LY3N C50D4L4705 D0LG0KR4 K3P35 4Z 3LM3.";
    String line3 = "3LK3P35Z70 D0LG0KR4! N3H3Z V0L7 3L05Z0R 3L0LV45N0D";
    String line4 = "3Z7, D3 M1R3 1D33R5Z 3HH3Z 4 50RH0Z, 4Z 3LM3D";
    String line5 = "4U70M471KU54N 3L 7UDJ4 0LV45N1.";
    String line6 = "4N3LKUL H0GY G0ND0LK0DN0D K3LL3N3 R4J74.";
    String line7 = "L3GY BU5ZK3! C54K K3V35 3MB3R K3P35 3L0LV45N1 3Z7.";
    String line8 = "H4 7375Z377, 05ZD M3G M450KK4L 15!";

    public TEXT(String line1, String line2, String line3, String line4, String line5, String line6, String line7,
            String line8) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.line5 = line5;
        this.line6 = line6;
        this.line7 = line7;
        this.line8 = line8;
    }

    public TEXT() {
    }

    public void start() {
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
        System.out.println(line8);
    }

}

