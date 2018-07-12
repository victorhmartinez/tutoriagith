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
public class Reloj {

    private int hora;

    private int minuto;
    private int segundo;

    public Reloj() {
        this(1, 1, 1);

    }

    public Reloj(int hora) {
        this(hora, 0, 0);
    }

    public Reloj(int minuto, int hora) {
        this(hora, minuto, 0);
    }

    public Reloj(int segundo, int minuto, int hora) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo>=0 && segundo <=59) {
            this.segundo = segundo;
        }else{
            System.out.println("Seg.Incorrecto, se asigana el valor de 0.");
            this.segundo=0;
        }
       
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto>=0&&minuto<=59){
          this.minuto=minuto;  
        }else {
            this.minuto=0;
            System.out.println("MInutos Incorrectos, se les asignara el valor de 0");
        }
        
    }

    public int getHora() {
        
        return hora;
    }

    public void setHora(int hora) {
       if (hora>=0 && hora <= 23){
            this.hora=hora;
        }else{
           System.out.println("Hora incorrecta,se asigna el valor de 0");
           this.hora=0;
       }
    }
    public String mostratTiempo24Horas(){
        return String.format("%d:,%d:,%d",hora,minuto,segundo);
    }
}
