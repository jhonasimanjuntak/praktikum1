
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class LargestNumber {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        // Meminta pengguna untuk memasukkan 10 nomor
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1) + ":");
            numbers[i] = Integer.parseInt(input);
        }

        // Temukan nomor terbesar
        int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        // Tampilkan nomor terbesar kepada pengguna
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah: " + largestNumber);
    }
}
