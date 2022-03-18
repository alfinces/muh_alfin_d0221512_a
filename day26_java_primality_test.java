import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class day26_java_primality_test {
     private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scan.nextLine();
        BigInteger number = new BigInteger(n);
        if (number.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scan.close();
    }
}
