/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar_interface;
// by IKHIN GANTENG
/**
 *
 * @author User
 */
public interface MetodeBayarPakeAplikasi extends MetodeBayar {
    public double bayarGopay (int idUser, double saldo, double belanjaTotal);
    public double bayarShopee (int idUser, double saldo, double belanjaTotal);
}
