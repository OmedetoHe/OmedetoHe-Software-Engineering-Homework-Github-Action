import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadTerm readTerm = new ReadTerm();
        Polynomial1 myPoly = readTerm.getTerm(sc);
        //System.out.println(myPoly.getTerm());
        myPoly.deriveTerm();
        System.out.println(myPoly.getTerm());
    }

}

/*

- 2 * x ** 6 + -6 * x ** 4 + +4 + -4 + 3 * x ** 0 + - x
 */