package main.java.com.mgilangggggg;

/**
 * Kelas yang merepresentasikan barang dalam inventaris.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    /**
     * Konstruktor untuk membuat instance dari Product.
     *
     * @param name     nama barang
     * @param price    harga barang per unit
     * @param quantity jumlah stok barang
     */

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Mendapatkan nama barang.
     * 
     * @return nama barang
     */
    public String getName() {
        return name;
    }

    /**
     * Mendapatkan harga barang per unit.
     * 
     * @return harga barang
     */
    public double getPrice() {
        return price;
    }

    /**
     * Menghitung total harga untuk barang berdasarkan jumlah stok.
     *
     * @return total harga stok barang
     */
    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Nama Barang: " + name + ", Harga: " + price + ", Jumlah: " + quantity;
    }
}
