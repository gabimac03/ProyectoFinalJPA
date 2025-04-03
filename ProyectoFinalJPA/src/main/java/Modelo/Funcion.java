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



/**
 *
 * @author Desarrollo
 */

@Entity
public class Funcion implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    
    @Basic
    private String horario;
    private Pelicula pelicula;
    
    @ManyToMany
    private List<Entrada> entradas;

    public Funcion() {
    }

    public Funcion(int id, String horario, Pelicula pelicula, List<Entrada> entradas) {
        this.id = id;
        this.horario = horario;
        this.pelicula = pelicula;
        this.entradas = entradas;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    
    @Override
    public String toString() {
        // Se asume que 'pelicula' tiene el método 'getTitulo()' que devuelve el título de la película
        return "Función: " + id; // Asegúrate de que 'horario' sea legible
    }
        // Método para obtener el detalle de la película y el horario
    public String obtenerDetalles() {
        return "Pelicula: " + pelicula.getTitulo() + ", Horario: " + horario;
    }

    
    
    
    

    
    
}
