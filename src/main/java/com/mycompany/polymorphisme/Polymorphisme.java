/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphisme;

/**
 *
 * @author User
 */
public class Polymorphisme {

    public static void main(String[] args) {
        MetodePembayaran kartuKredit = new KartuKredit();
        MetodePembayaran payPal = new PayPal("intanzalukhu.com");
        MetodePembayaran pembayaranTunai = new PembayaranTunai();

        kartuKredit.bayar(100000);
        payPal.bayar(250000);
        pembayaranTunai.bayar(50000);
    }
}
