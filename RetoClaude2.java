import java.util.Scanner;
public class RetoClaude2 {
    public static void main(String[] args) {
        int nApro = 60;
        int cAlum = 0;
        int aApro = 0;
        double total = 0;
        Scanner dato = new Scanner(System.in);
        cAlum = dato.nextInt();
        int[] notas = new int[cAlum];
        for (int i = 0; i < notas.length; i++) {
            int aNota = dato.nextInt();
            notas[i] = aNota;
            total += aNota;
            if (notas[i] >= nApro) {
                aApro++;
            }

        }

        for (int j = 1; j < notas.length; j++) {
            int temp = 0;
            for (int k = 0; k < notas.length - 1; k++) {
                if (notas[k] > notas[j]) {
                    temp = notas[j];
                    notas[j] = notas[k];
                    notas[k] = temp;
                }
            }
        }
        System.out.println("Promedio: " + (total / cAlum) + ", Mayor: " + notas[notas.length - 1] + ", Menor: "
                + notas[0] + ", Aprobados: " + aApro);
        dato.close();
    }
}