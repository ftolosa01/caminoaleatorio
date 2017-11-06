/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caminoaleatorio;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ProcesoCaminoaleatoraio {
    
    private int moneda;
    public void Menu(){
        lugar();
    }
    
    public void moneda (){
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese 1 si es cara 2 si es cruz");
        moneda = intro.nextInt();
    }
    
    public void lugar(){
        System.out.println("facultad de ciencias juridicas y empresariales");
            moneda();
            if (moneda == 2){
            System.out.println("sigue caminando");
            moneda();
                if (moneda == 2){
                System.out.println("sigue caminando"); 
                moneda();
                if (moneda == 2){
                System.out.println("sigue caminando"); 
                  moneda();
                if (moneda == 2){
                System.out.println("sigue caminando"); 
                  moneda();
                if (moneda == 2){
                System.out.println("sigue caminando"); 
                    System.out.println("llega al departamento de ingeneria en computacion e informatica");
            }else{
                System.out.println("se queda en la sala dis");             
                }
            }else{
                System.out.println("se queda en la sala e");                  
                }
            }else{
                System.out.println("se queda en la sala d");
                }
            }else{
                System.out.println("se queda en la sala r1");
            }
        }else{
            System.out.println("se queda en la sala ra");
        }
    }
    
}
/*Un día Alejandro estaba aburrido y no sabía cómo distraerse, así que se propuso ir desde
el departamento de Ciencias jurídicas y empresariales hasta el departamento de Ingeniería de 
Computación e Informática, estaba buscando una mesa para sentarse cómodamente y prender su computador
para jugar StarCraft. Desde el edificio en el que estaba podía pasar al edificio RA, R1, D, E, DIS.
Al pasar por cada uno de éstos edificios se propuso lanzar una moneda, si salía cara iba a buscar
una mesa en ése edificio, si salía cruz seguía caminando.

Se necesita que se programe su trayecto. */