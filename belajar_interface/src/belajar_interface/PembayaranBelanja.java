/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar_interface;
// by RAPANTO
/**
 *
 * @author User
 */
public class PembayaranBelanja implements MetodeBayarPakeAplikasi{
    
    double kodeQR;
    double kembalian;
    double Walletbayar;
    double Pakecard;
    double Debitcard;

    @Override
    public double bayarGopay(int idUser, double saldo, double belanjaTotal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double bayarShopee(int idUser, double saldo, double belanjaTotal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double Bayarcash(double cash, double belanja) {
        kembalian = cash - belanja;
        return kembalian;
    }

    @Override
    public double BayarQRIS(double belanja, double saldo) {
        kodeQR = saldo - belanja;
        return kodeQR;
    }

    @Override
    public double BayarEwallet(int idUser, int pin, double belanja, double saldo) {
        Walletbayar = saldo -belanja;
        return Walletbayar;
    }

    @Override
    public double BayarCreditCard(int idUser, int pin, double belanja, double saldo) {
        Pakecard = saldo - belanja;
        return Pakecard;
    }

    @Override
    public double BayarDebitCard(int idUser, int pin, double belanja, double saldo) {
        Debitcard = saldo - belanja;
        return Debitcard;
    }
}
