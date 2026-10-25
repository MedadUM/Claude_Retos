import java.util.Scanner;
public class RetoClaude2A {
    public static void main(String[] args) {
        int nApro = 60;
        int cAlum = 0;
        int aApro = 0;
        Scanner dato = new Scanner(System.in);
        cAlum = dato.nextInt();
        int pNota = dato.nextInt();
        double total = pNota;
        int nMayor = pNota;
        int nMenor = pNota;

        if (pNota >= nApro) {
            aApro++;
        }

        for (int i = 1; i < cAlum; i++) {
            int notas = dato.nextInt();
            total += notas;
            if (nMenor > notas) {
                nMenor = notas;
            }

            if (nMayor < notas) {
                nMayor = notas;
            }

            if (notas >= nApro) {
                aApro++;
            }
        }

        System.out.println("Promedio: " + (total / cAlum) + ", Mayor: " + nMayor + ", Menor: " + nMenor + ", Aprobados: " + aApro);
        dato.close();
    }
}