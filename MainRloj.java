/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase15.Rejoj;

/**
 *
 * @author Usuario
 */
public class MainRloj {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(6,6,12);
        reloj.setHora(7);
        System.out.println(reloj.mostratTiempo24Horas());
    }
}
