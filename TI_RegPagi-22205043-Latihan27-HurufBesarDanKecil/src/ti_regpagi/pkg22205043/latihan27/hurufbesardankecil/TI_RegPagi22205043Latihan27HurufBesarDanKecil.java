/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan27.hurufbesardankecil;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : program ini untuk mengubah huruf besar dan huruf kecil
 */
import java.util.Scanner;

public class TI_RegPagi22205043Latihan27HurufBesarDanKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ulangi = true;

        while (ulangi) {            
            System.out.print("Masukan Kalimat : ");
            String kalimat = input.nextLine();
            
            String kalimatKecil = kalimat.toLowerCase();
            String kalimatBesar = kalimat.toUpperCase();
            
            System.out.println("\n===== Hasil formatting =====");
            System.out.println("HurufBesar = " +kalimatBesar);
            System.out.println("HurufKecil = " +kalimatKecil);
            
            System.out.print("\nUlangi Program? (ya/tidak)");
            String ulang = input.nextLine().toUpperCase();
            if(ulang.equals("YA")){
                System.out.println("Program akan diulangi\n");
            }else if(ulang.equals("TIDAK")){
                System.out.println("Program berhenti terimakasih\n");
                ulangi = false;
            }
        }

    }

}
