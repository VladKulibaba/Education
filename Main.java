import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Delta on 01.08.2015.
 */
//some comment
//some comment 2
public class Main {
   static long d, x, y,q, r, x1, x2, y1, y2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );


        System.out.println("Атака на зв'язаних довгострокових і сеансових ключах");
        System.out.println("Передбачаеться, що в систему буза зроблена закладка, що в певний момент часу виконала зв'язування");
        System.out.println("довгострокових d та сеансових k ключів і як результат отримано два однокових підписи для різних повідомлень");
        System.out.println("На вхід программи подаються хеш-значення повыдомлень, для яких було виконане зв'язування а також сеансовий ключ k");
        System.out.println("На виході отримуэмо обидва довгострокові ключі");
        System.out.println("Введіть k");
        String k=br.readLine();
        BigInteger inputK=new BigInteger(k);
        System.out.println("Введіть h1");
        String h1=br.readLine();
        BigInteger inputH1=new BigInteger(h1);
        System.out.println("Введіть h1");
        String h2=br.readLine();
        BigInteger inputH2=new BigInteger(h2);
        long ans=inverse(354545,54848);
        System.out.println(ans);
        BigInteger a=new BigInteger("2");
        a=a.modInverse(new BigInteger("17"));//!!!!!!!!!!!!!!!!!!!
        System.out.println(a);
    }



    static long extended_euclid(long a, long b)

/* calculates a * *x + b * *y = gcd(a, b) = *d */

    {


        if (b == 0) {

            d = a; x = 1; y = 0;

            return x;
        }

        x2 = 1; x1 = 0; y2 = 0; y1 = 1;

        while (b > 0) {

            q = a / b;
            r = a - q * b;

            x = x2 - q * x1;
            y = y2 - q * y1;

            a = b;
            b = r;

            x2 = x1;
            x1 = x;
            y2 = y1;
            y1 = y;

        }

        d = a;
        x = x2;
        y = y2;

        return x;
    }


    static long inverse(long a, long n)
/* computes the inverse of a modulo n */
    {
        x=extended_euclid(a, n);

        if (d == 1) {
            if (x < 0)
                x += n;
            return x;
        }
        return 0;

    }


}

