package tyreso.gymnasium.Miniraknare;


public class Test {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println("Testing");
        System.out.println();
        System.out.println("testing 15 + 15 = 30");
        int resultat = calculator.plus(15, 15);
        System.out.println(resultat);
        System.out.println();

        System.out.println("testing 10 - 20 = -10");
        int resultat2 = calculator.minus(10, 20);
        System.out.println(resultat2);
        System.out.println();

        System.out.println("testing 10 x 10 = 100");
        int resultat3 = calculator.multiplication(10, 10);
        System.out.println(resultat3);
        System.out.println();

        System.out.println("testing 4 / 2 = 2");
        int resultat4 = calculator.divided(4, 2);
        System.out.println(resultat4);
        System.out.println();

        System.out.println("testing 3 ^ 2 = 9");
        double resultat5 = calculator.raised(3, 2);

        System.out.println(resultat5);
        System.out.println();
    }



}
