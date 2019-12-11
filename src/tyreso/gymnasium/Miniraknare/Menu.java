package tyreso.gymnasium.Miniraknare;

import java.util.*;

public class Menu {
    static Calculator calculator = new Calculator();
    //konstruktor
    Menu(){}

    /**
     * Visa meny.
     */
    private static void visaMeny(){

        while (true) {
            Scanner sc = new Scanner(System.in);
            boolean continueLoop = true;
            System.out.println("\n1.Plus\n2.Minus\n3.Multiplication\n4.Divided\n5.Raised\n6.M-Tabel\n7.avsluta");
            //ta input till menyval TODO Error handling på inkorrekt input
            byte menyVal = sc.nextByte();
            switch (menyVal) {

                /**
                 *Case 1 = Plus
                 */
                case 1:
                    do {
                        try {
                            plus();
                            continueLoop = false;
                        } catch (InputMismatchException e) {
                            System.out.println(e);
                        } catch (IllegalStateException e) {
                            System.out.println(e);
                        } catch (Exception e) {
                            System.out.println("Unexpected error type! Please submit bug report!");
                            System.out.println(e);
                        }
                    } while (continueLoop);
                    break;
                /**
                 * Case 2 = Minus
                 */
                case 2:
                    do {
                        try {
                            minus();
                            continueLoop = false;
                        } catch (InputMismatchException e) {
                            System.out.println(e);
                        } catch (Exception e) {
                            System.out.println(e);
                            System.out.println("Unexpected error type! Please submit bug report!");
                            e.printStackTrace();
                        }
                    } while (continueLoop);
                    break;
                /**
                 * Case 3 = Multiplication
                 */
                case 3:
                    do {
                        try {
                            multiplication();
                            continueLoop = false;
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } while (continueLoop);
                    break;

                /**
                 * Case 4 = Divided
                 */
                case 4:
                    try {
                        delat();
                    } catch (IllegalStateException e) {
                        System.out.println(e);
                    } catch (IllegalCallerException e) {
                        System.out.println(e);
                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Unexpected error type, please submit bug report");
                        e.printStackTrace();
                    }
                    break;

                /**
                 * Case 5 = Raised
                 */
                case 5:
                    try {
                        raised();
                    } catch (IllegalStateException e) {
                        System.out.println(e);
                    } catch (IllegalCallerException e) {
                        System.out.println(e);
                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Unexpected error type, please submit bug report");
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    do {
                        try {
                            Mtabel();
                            continueLoop = false;
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } while (continueLoop);
                    break;


                case 7:

                    /**
                     * Case 6 = Avsluta
                     */
                    avsluta();

                default:
                    System.out.println("Vänligen välj genom att skriva in rätt siffra och bekräfta genom att trycka Enter");

            }
        }
    }

    /**
     * Plus är metoden.
     * Private(access modifier) kan bara ses från klassen själv
     * int ör valet av variabel
     *
     */
    private static void plus() {
        Scanner talScanner = new Scanner(System.in); // skapar ett scanning objekt
        System.out.println("Du har valt plus");
        System.out.println("Skriv in ditt första tal");
        int tal1 = talScanner.nextInt(); //sätt värdet på tal1
        System.out.println("Skriv in ditt andra val");
        int tal2 = talScanner.nextInt(); //sätt värdet på tal2
        System.out.println("Här är ditt svar");
        int answer = calculator.plus(tal1, tal2); // sätt värdet på answer med metoden calculator.plus
        System.out.println(answer);
    }
    private static void minus() {
        Scanner talScanner = new Scanner(System.in);  // skapar ett scanning objekt
        System.out.println("Du har valt minus");
        System.out.println("Skriv in ditt första tal");
        int tal1 = talScanner.nextInt(); //sätt värdet på tal1
        System.out.println("Skriv in ditt andra val");
        int tal2 = talScanner.nextInt(); //sätt värdet på tal2
        System.out.println("Här är ditt svar");
        int answer = calculator.minus(tal1, tal2); // sätt värdet på answer med metoden calculator.minus
        System.out.println(answer);
    }
    private static void multiplication() {
        Scanner talScanner = new Scanner(System.in); // skapar ett scanning objekt
        System.out.println("Du har valt multiplication");
        System.out.println("Skriv in ditt första tal");
        int tal1 = talScanner.nextInt(); //sätt värdet på tal1
        System.out.println("Skriv in ditt andra val");
        int tal2 = talScanner.nextInt(); //sätt värdet på tal2
        System.out.println("Här är ditt svar");
        int answer = calculator.multiplication(tal1, tal2); // sätt värdet på answer med metoden calculator.multiplication
        System.out.println(answer);
    }
    private static void delat() {
        Scanner talScanner = new Scanner(System.in); // skapar ett scanning objekt
        System.out.println("Du har valt delat");
        System.out.println("Skriv in ditt första tal");
        int tal1 = talScanner.nextInt(); //sätt värdet på tal1
        System.out.println("Skriv in ditt andra val");
        int tal2 = talScanner.nextInt(); //sätt värdet på tal2
        System.out.println("Här är ditt svar");
        int answer = calculator.divided(tal1, tal2); // sätt värdet på answer med metoden calculator.divided
        System.out.println(answer);
    }
    private static void raised() {
        Scanner talScanner = new Scanner(System.in); // skapar ett scanning objekt
        System.out.println("Du har valt raised");
        System.out.println("Skriv in ditt första tal");
        int tal1 = talScanner.nextInt(); //sätt värdet på tal1
        System.out.println("Skriv in ditt andra val");
        int tal2 = talScanner.nextInt(); //sätt värdet på tal2
        System.out.println("Här är ditt svar");
        double answer = calculator.raised(tal1, tal2); // sätt värdet på answer med metoden calculator.raised
        System.out.println(answer);
    }
    private static void Mtabel() {
        Scanner talScanner = new Scanner(System.in); // skapar ett scanning objekt
        System.out.println("Du har valt Mtabel");
        System.out.println("Skriv in ditt första tal");
        int tal1 = talScanner.nextInt(); //sätt värdet på tal1

        //skapa datastruktur med siffrorna 0-10
        ArrayList<Integer> obj = new ArrayList<Integer>(
                List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("_____________");
        System.out.println();


        ArrayList answer = calculator.multiplication(tal1, obj); // sätt värdet på answer med metoden calculator.multiplication
        System.out.println("Här är ditt svar");
        System.out.println(answer);
    }


    //avsluta programmet
    private static void avsluta(){
        System.exit(0);
    }

    //main method
    public static void main(String args[]){
        visaMeny();
    }
}
