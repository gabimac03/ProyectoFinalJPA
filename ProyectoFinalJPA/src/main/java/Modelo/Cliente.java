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
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Basic
    protected String nombre;
    protected String email;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + '}';
    }

    
    public boolean ingresoValido(String nombre, String email) {
    // Verificar que el nombre no esté vacío o tenga longitud menor a 1
    if (nombre == null || nombre.length() < 1) {
        System.out.println("El nombre es obligatorio y no puede estar vacío.");
        return false; // El nombre no es válido
    }

    // Verificar que el email no esté vacío
    if (email == null || email.length() < 1) {
        System.out.println("El email es obligatorio y no puede estar vacío.");
        return false; // El email no es válido
    }

    // Verificar formato del email (básicamente que contenga "@" y ".")
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    if (!email.matches(emailRegex)) {
        System.out.println("El email no tiene un formato válido.");
        return false; // El email no es válido
    }

    return true; // Ambos campos son válidos
}
    
}
