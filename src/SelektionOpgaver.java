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