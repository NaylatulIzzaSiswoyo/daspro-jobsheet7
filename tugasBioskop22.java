import java.util.Scanner;
public class tugasBioskop22 {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hargaTiket = 50000;
    int tiket; 
    double diskon;
    int totalTiket = 0;
    int totalPenjualan = 0;

    System.out.println("Penjualan tiket bioskop (Ketik 0 untuk selesai)");
    
    do {
        System.out.println("Jumlah tiket yang dibeli pelanggan:");
        tiket = sc.nextInt();
         if (tiket < 0 ) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }
            if (tiket == 0) {
                break;
            }
            double harga = tiket * hargaTiket;
                 diskon = 0;
            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            }
            double bayar = harga - (harga * diskon);
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar pelanggan: Rp" + (long) bayar);

            totalTiket += tiket;
            totalPenjualan += bayar;
        } while (tiket != 0);
        System.out.println("------------------------------------");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + (long) totalPenjualan);

        sc.close();
        }
    }

   
   

   
    
