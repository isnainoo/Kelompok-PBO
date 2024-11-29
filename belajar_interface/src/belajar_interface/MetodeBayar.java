/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package belajar_interface;
// by IKHINNN GANTENG
/**
 *
 * @author User
 */
public interface MetodeBayar {
    public double Bayarcash(double cash, double belanja);
    public double BayarQRIS(double belanja, double saldo);
    public double BayarEwallet(int idUser, int pin, double belanja, double saldo);
    public double BayarCreditCard(int idUser, int pin, double belanja, double saldo);
    public double BayarDebitCard(int idUser, int pin, double belanja, double saldo);
}
