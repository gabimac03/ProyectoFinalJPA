/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Desarrollo
 */

@Entity
public class Compra implements Serializable {
    
        
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Basic
    @OneToMany
    private List<Insumo> insumos;
    @OneToMany
    private List<Proovedor> proovedores;

    public Compra() {
    }

    public Compra(int id, Date fecha, List<Insumo> insumos, List<Proovedor> proovedores) {
        this.id = id;
        this.fecha = fecha;
        this.insumos = insumos;
        this.proovedores = proovedores;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Insumo> getInsumos() {
        return insumos;
    }

    public void setInsumos(List<Insumo> insumos) {
        this.insumos = insumos;
    }

    public List<Proovedor> getProovedores() {
        return proovedores;
    }

    public void setProovedores(List<Proovedor> proovedores) {
        this.proovedores = proovedores;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", fecha=" + fecha + ", insumos=" + insumos + ", proovedores=" + proovedores + '}';
    }
    
    
    
    
    
    
}
