/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar_interface;
// by IKKHHIIINNNN
/**
 *
 * @author User
 */
public class Belajar_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        PembayaranBelanja pb = new PembayaranBelanja();
        pb.Bayarcash(5000, 1000);
        System.out.println(pb.kembalian);
        pb.BayarQRIS(20000, 50000);
        System.out.println(pb.kodeQR);
        pb.BayarEwallet(2222, 2222, 40000, 60000);
        System.out.println(pb.Walletbayar);
        pb.BayarCreditCard(4444, 4444, 60000, 80000);
        System.out.println(pb.Pakecard);
        pb.BayarDebitCard(6666, 6666, 2000, 4000);
        System.out.println(pb.Debitcard);
    }
}
