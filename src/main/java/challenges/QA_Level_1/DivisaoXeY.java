package challenges.QA_Level_1;

import java.util.Locale;
import java.util.Scanner;

public class DivisaoXeY {
    public static void main(String[] args) {
        //complete os espaços com sua solução
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
//        minhaVariavelDouble = NumberFormat.getInstance().parse(minhaVariavelString).doubleValue;

        double X, Y;
        for (int i = 0; i < N; i++) {
            X = leitor.nextInt();
            Y = leitor.nextInt();
            if (Y == 0) System.out.println("divisao impossivel");
            else {
                System.out.printf(Locale.US, "%.1f %n", X/Y);
            }
        }
    }

}
