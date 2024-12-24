/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Famacy.model;


import javax.persistence.*;

@Entity
@Table(name = "\"Medicine\"")
public class Medicine implements Comparable<Medicine>{

    @EmbeddedId
    private MedicineId id;
    
    @Column(name = "\"Supplier\"")
    private String supplier;

    @Column(name = "\"Supplied_date\"")
    private String suppliedDate;

    @Column(name = "\"Expired_date\"")
    private String expirationDate;

    @Column(name = "\"Quantity\"")
    private int quantity;
    
    @Column(name = "\"MPrice\"")
    private double price; // Add this field
    
    // Constructor
    public Medicine(MedicineId id, String supplier, String suppliedDate, 
            String expirationDate, int quantity, double price) {
        this.id = id;
        this.supplier = supplier;
        this.suppliedDate = suppliedDate;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
        this.price = price;
    }
    
    public Medicine() {
        this.id = null;
        this.supplier = null;
        this.suppliedDate = null;
        this.expirationDate = null;
        this.quantity = -1;
        this.price = -1;
    }

    // Getters and setters
    public MedicineId getId() {
        return id;
    }

    public void setId(MedicineId id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSuppliedDate() {
        return suppliedDate;
    }

    public void setSuppliedDate(String suppliedDate) {
        this.suppliedDate = suppliedDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public int compareTo(Medicine other) {
        // Compare by medicine name (id.getName())
        return this.id.getName().compareToIgnoreCase(other.getId().getName());
    }
}

