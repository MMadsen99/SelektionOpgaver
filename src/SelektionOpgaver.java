class SelektionOpgave_1{
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;

        // Evaluer følgende boolske udtryk:

        System.out.print("A: ");
        System.out.println(x <= 5 && z != y);
        System.out.print("B: ");
        System.out.println(x == 5 || x == y && z == 3);
        System.out.print("C: ");
        System.out.println(x / y > z / x);
        System.out.print("D: ");
        System.out.println(!( x != y - z ) == false);
        System.out.print("E: ");
        System.out.println(2 * x != x || x == 0);
        System.out.print("F: ");
        System.out.println(! true || ! false);
    }
}
class SelektionOpgave_2 {
    public static void main(String[] args) {
        int x = 20;
        int y = 50;
        int sum1 = x + y;

        if(sum1 > 100 )
            System.out.println("summen er større end 100");
        else if(sum1 < 100)
            System.out.println("100 er større end summen");
        else
            System.out.println(" summen er 100");

    }

}
class SelektionOpgave_3 {
    public static void main(String[] args) {

        int first;
        int second;
        first = 30;
        second = 50;

        if(first > second) {
            System.out.println("variablen first er størst");
        }else{
            System.out.println("variablen second er størst");
        }

    }

}
class  SelektionOpgave_4 {
    public static void main(String[] args) {
        int first;
        int second;
        int third;

        first = 20;
        second = 50;
        third = 60;

        if (first > second && first > third) {
            System.out.println("first er størst");

        } else if (second > third) {
            System.out.println("second er størst");

        } else System.out.println(" third er størst");

    }
}
class SelektionOpgave_5{
    public static void main(String[] args) {
        int x = 39;

        if (  0 <= x && x <=  9 )
            System.out.println( x + " tilhører intervallet [0:9]" );
        else if ( 10 <= x && x <= 19 )
            System.out.println( x + " tilhører intervallet [10:19]" );
        else if ( 20 <= x && x <= 29 )
            System.out.println( x + " tilhører intervallet [20:29]" );
        else if ( 30 <= x && x <= 39 )
            System.out.println( x + " tilhører intervallet [30:39]" );
        else if ( 40 <= x && x <= 49 )
            System.out.println( x + " tilhører intervallet [40:49]" );
        else if ( 50 <= x && x <= 59 )
            System.out.println( x + " tilhører intervallet [50:59]" );
        else if ( 60 <= x && x <= 69 )
            System.out.println( x + " tilhører intervallet [60:69]" );
        else if ( 70 <= x && x <= 79 )
            System.out.println( x + " tilhører intervallet [70:79]" );
        else if ( 80 <= x && x <= 89 )
            System.out.println( x + " tilhører intervallet [80:89]" );
        else
            System.out.println( x + " tilhører intervallet [90:99]" );
    }
}
class SelektionOpgave_6 {
    public static void main(String[] args) {

        int x = 10;
        int y = 250;
        int z = 20;

        if (x > z && x < y) {
            System.out.println("x er den miderste variable");
        } else if(x < z && x > y)
            System.out.println("x er den miderste variable");
        else if (z > x && y > z)
            System.out.println("z er den miderste variable");
        else if (z < x && y < z)
            System.out.println("z er den miderste variable");
        else if (y > x && y < z)
            System.out.println("y er den miderste variable");
        else if (y < x && y > z)
            System.out.println("y er den miderste variable");
        else
            System.out.println("error");
        /* man kan forminske antallet af else if sætning ved og lave
           de boolske sætninger længere som f.eks ( x>=y && y>=z || z>=y && y>=x )
           se eventuelt vejledende løsninger på docjava.dk
         */

    }
}
class SelektionOpgave_7{
    public static void main(String[] args) {
        int x = 9;
        int y = 21;

        int dif = x - y;

        if (dif > 10)

            System.out.println("forskellen er større end 10");
        else
            System.out.println("forskellen er ikke større end 10");

    }

}
class SelektionOpgave_8{
    public static void main(String[] args) {
        int øjne = 9;

        switch ( øjne ) {

            case 1:
            System.out.println("terningen viser 1");
            break;
            case 2:
                System.out.println("terningen viser 2");
            break;
            case 3:
            System.out.println("terningen viser 3");
            break;
            case 4:
            System.out.println("terningen viser 4");
            break;
            case 5:
            System.out.println("terningen viser 5");
            break;
            case 6:
            System.out.println("terningen viser 6");
            break;

            default:
                System.out.println("valgt tal er udenfor intervallet");

        }
    }
}