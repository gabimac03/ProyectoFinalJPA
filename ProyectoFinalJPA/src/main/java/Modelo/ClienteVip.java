/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Desarrollo
 */

@Entity
public class ClienteVip extends Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idClienteVip;
    
    @Basic
    protected float descuento;

    public ClienteVip() {
    }

    public ClienteVip(int idClienteVip, float descuento) {
        this.idClienteVip = idClienteVip;
        this.descuento = descuento;
    }

    public ClienteVip(int idClienteVip, float descuento, int id, String nombre, String email) {
        super(id, nombre, email);
        this.idClienteVip = idClienteVip;
        this.descuento = descuento;
    }

    public int getIdClienteVip() {
        return idClienteVip;
    }

    public void setIdClienteVip(int idClienteVip) {
        this.idClienteVip = idClienteVip;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ClienteVip{" + "idClienteVip=" + idClienteVip + ", descuento=" + descuento + '}';
    }

    

    
    

    
    
    
    
}
