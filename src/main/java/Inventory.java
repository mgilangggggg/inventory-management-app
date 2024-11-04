package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas untuk mengelola daftar barang dalam inventaris.
 */
class Inventory {
    private List<Product> products;

    /**
     * Konstruktor untuk membuat instance dari Inventory.
     */
    public Inventory() {
        products = new ArrayList<>();
    }

    /**
     * Menambahkan barang baru ke dalam inventaris.
     *
     * @param product barang yang akan ditambahkan
     */
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Barang berhasil ditambahkan: " + product.getName());
    }

    /**
     * Menghapus barang dari inventaris berdasarkan nama.
     *
     * @param name nama barang yang akan dihapus
     * @throws IllegalArgumentException jika barang dengan nama tersebut tidak
     *                                  ditemukan
     */
    public void removeProduct(String name) throws IllegalArgumentException {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                products.remove(product);
                System.out.println("Barang berhasil dihapus: " + name);
                return;
            }
        }
        throw new IllegalArgumentException("Barang dengan nama " + name + " tidak ditemukan.");
    }

    /**
     * Menampilkan daftar barang yang tersedia di inventaris.
     * 
     * @throws IllegalStateException jika inventaris kosong
     */
    public void displayProducts() throws IllegalStateException {
        if (products.isEmpty()) {
            throw new IllegalStateException("Inventaris kosong.");
        }
        System.out.println("Daftar Barang di Toko:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * Menghitung total nilai dari semua barang dalam inventaris.
     *
     * @return total nilai inventaris
     */
    public double calculateTotalInventoryValue() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }
}
