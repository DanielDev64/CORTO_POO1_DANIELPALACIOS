/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dante
 */
public class Control {
    List<Jugadores> listJugadores;

    public Control() {
        this.listJugadores = new ArrayList<>();
    }
    
    public boolean GuardarJugadores(String nombre, int edad, double estatura, double peso)
    {
        boolean resp = false;
        try{
            this.listJugadores.add(new Jugadores(nombre,edad,estatura,peso));
            resp = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
    public void BorrarLista()
    {
        this.listJugadores.clear();
    }
    
    public String JugadorAlto()
    {
        String resp = "";
        double base = 0;
        String nom = "";
        try
        {
          for(Jugadores alto: this.listJugadores)
            {
                if(alto.getEstatura() > base)
                {
                    base = alto.getEstatura();
                    nom = alto.getNombre();
                }
            }
            resp = nom + " con" + base + " m";  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return resp;
    }
    
    public String JugadorJoven()
    {
        String resp = "";
        int base = 1000;
        String nom = "";
        try{
            for(Jugadores alto: this.listJugadores)
            {
                if(alto.getEdad() < base)
                {
                    base = alto.getEdad();
                    nom = alto.getNombre();
                }
            }
            resp = nom + " con" + base + " años";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return resp;
    }
    
    public String JugadorPesado()
    {
        String resp = "";
        double base = 0;
        String nom = "";
        try
        {
            for(Jugadores alto: this.listJugadores)
            {
                if(alto.getPeso() > base)
                {
                    base = alto.getPeso();
                    nom = alto.getNombre();
                }
            }
            resp = nom + " con" + base + " lbs";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return resp;
    }
    
}
