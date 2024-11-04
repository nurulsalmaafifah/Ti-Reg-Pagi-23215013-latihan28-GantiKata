/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class GantiKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata : ");
        String kataLama = scanner.nextLine();

        System.out.print("Menjadi Kata : ");
        String kataBaru = scanner.nextLine();

        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);

        scanner.close();
        System.out.println("BUILD SUCCESSFUL (total time: 50 seconds)");
    }
}
