/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Desarrollo
 */

@Entity
public class Cine implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Basic
    private String nombre;
    private String direccion;
    
    @OneToMany
    private final List<Pelicula> peliculas = new ArrayList<>();;
    @OneToMany
    private final List<Venta> ventas = new ArrayList<>();;
    @OneToMany
    private final List<SalaVip> salaVip = new ArrayList<>();;
    @OneToMany
    private List<Sala> salas = new ArrayList<>();;
    @OneToMany
    private final List<Compra> compras = new ArrayList<>();;
    @ManyToMany
    private final List<Empleado> empleados = new ArrayList<>();;

    public Cine() {
    }

    public Cine(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    @Override
    public String toString() {
        return "Cine{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", peliculas=" + peliculas + ", ventas=" + ventas + ", salaVip=" + salaVip + ", salas=" + salas + ", compras=" + compras + ", empleados=" + empleados + '}';
    }
    
    
    
    
    
    
}
