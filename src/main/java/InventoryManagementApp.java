package main.java;

import java.util.Scanner;

/**
 * Kelas utama untuk menjalankan aplikasi pengelolaan inventaris barang di toko.
 */
public class InventoryManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n=== Menu Pengelolaan Inventaris ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan Daftar Barang");
            System.out.println("4. Hitung Total Nilai Inventaris");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Membersihkan buffer input
                    System.out.print("Masukkan Nama Barang: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Harga Barang: ");
                    double price = scanner.nextDouble();
                    System.out.print("Masukkan Jumlah Barang: ");
                    int quantity = scanner.nextInt();

                    Product product = new Product(name, price, quantity);
                    inventory.addProduct(product);
                    break;

                case 2:
                    scanner.nextLine(); // Membersihkan buffer input
                    System.out.print("Masukkan Nama Barang yang akan dihapus: ");
                    String productName = scanner.nextLine();
                    try {
                        inventory.removeProduct(productName);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        inventory.displayProducts();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    double totalValue = inventory.calculateTotalInventoryValue();
                    System.out.println("Total Nilai Inventaris: " + totalValue);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
