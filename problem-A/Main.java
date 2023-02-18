public class kfc{
    public static void main(String[] args){

        Calculator c1 = new Calculator(1,2);
        System.out.println("Addition" + c1.add());
        Calculator c2 = new Calculator(99, 100);
        System.out.println("Addition" + c2.subtract());
        Calculator c3 = new Calculator(3, 4);
        System.out.println("Addition" + c3.multiplication());
        Calculator c4 = new Calculator(10,20);
        System.out.println("Addition" + c4.division());

        Calculator c5 = new Calculator(-1,-2);
        System.out.println("Addition" + c5.add());
        Calculator c6 = new Calculator(99.9, 100);
        System.out.println("Addition" + c6.subtract());
        Calculator c7 = new Calculator(0, 3);
        System.out.println("Addition" + c7.multiplication());
        Calculator c8 = new Calculator( 30, 0);
        System.out.println("Addition" + c8.division());




    }

}
