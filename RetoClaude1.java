import java.util.Scanner;

public class RetoClaude1 {
    public static void main(String[] args) {
        int cProd = 0;
        int[] desc = { 0, 10, 25 };
        int total = 0;
        double descA = 0;
        int descU = 0;
        Scanner dato = new Scanner(System.in);

        cProd = dato.nextInt();
        for (int i = 1; i <= cProd; i++) {
            int pProd = dato.nextInt();
            total += pProd;
        }
        switch (cProd) {
            case 1, 2:
                descU = desc[0];
                descA = (total * descU) / 100.0;
                break;

            case 3, 4, 5:
                descU = desc[1];
                descA = (total * descU) / 100.0;
                break;

            default:
                descU = desc[2];
                descA = (total * descU) / 100.0;
                break;
        }
        System.out.println("Total: " + total + ", Descuento: " + descU + "%" + ", A pagar: " + (total - descA));
        dato.close();
    }
}