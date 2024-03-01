/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphisme;

/**
 *
 * @author User
 */
public class KartuKredit implements MetodePembayaran {
    @Override
    public void bayar(int jumlah) {
        System.out.println("Pembayaran Rp" + jumlah + " menggunakan Kartu Kredit.");
    }
}

