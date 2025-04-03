/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;


/**
 *
 * @author Desarrollo
 */
@Entity
public class SalaVip extends Sala {
   
    
    @Basic
    protected String beneficios;

    public SalaVip() {
    }

    public SalaVip(String beneficios) {
    
        this.beneficios = beneficios;
    }

    public SalaVip(String beneficios, int id, int numero, int capacidad) {
        super(id, numero, capacidad);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public List<Funcion> getFunciones() {
        return funciones;
    }

    @Override
    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    @Override
    public String toString() {
        return "SalaVip{" + ", beneficios=" + beneficios + '}';
    }

    

    
    
    
}
