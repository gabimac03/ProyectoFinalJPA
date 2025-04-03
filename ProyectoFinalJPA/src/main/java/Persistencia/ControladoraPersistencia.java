/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Cine;
import Modelo.Cliente;
import Modelo.ClienteVip;
import Modelo.Compra;
import Modelo.Empleado;
import Modelo.Entrada;
import Modelo.Funcion;
import Modelo.Insumo;
import Modelo.Pago;
import Modelo.Pelicula;
import Modelo.Proovedor;
import Modelo.Sala;
import Modelo.SalaVip;
import Modelo.Venta;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ControladoraPersistencia {
    CineJpaController cineJpa = new CineJpaController();
    ClienteJpaController clieJpa = new ClienteJpaController();
    ClienteVipJpaController clienVipJpa = new ClienteVipJpaController();
    CompraJpaController compraJpa = new CompraJpaController();
    EmpleadoJpaController empleJpa = new EmpleadoJpaController();
    EntradaJpaController entraJpa = new EntradaJpaController();
    FuncionJpaController funJpa = new FuncionJpaController();
    InsumoJpaController insuJpa = new InsumoJpaController();
    PagoJpaController pagoJpa = new PagoJpaController();
    PeliculaJpaController peliJpa = new PeliculaJpaController();
    ProovedorJpaController proJpa = new ProovedorJpaController();
    SalaJpaController salaJpa = new SalaJpaController();
    VentaJpaController ventaJpa = new VentaJpaController();

    
    //CREAR
    public void crearProovedor(Proovedor prov) {
        proJpa.create(prov);
    }

    public void crearCine(Cine cine) {
        cineJpa.create(cine);        
    }

    public void crearCliente(Cliente cliente) {
        clieJpa.create(cliente);
    }

    public void crearClienteVip(ClienteVip clienteVip) {
        clienVipJpa.create(clienteVip);
    }

    public void crearCompra(Compra compra) {
        compraJpa.create(compra);
    }

    public void crearEmpleado(Empleado emp) {
        empleJpa.create(emp);
    }

    public void crearEntrada(Entrada entrada) {
        entraJpa.create(entrada);
    }

    public void crearFuncion(Funcion fun) {
        funJpa.create(fun);
               
    }

    public void crearInsumo(Insumo insu) {
        insuJpa.create(insu);
    }

    public void crearPago(Pago pago) {
        pagoJpa.create(pago);
    }

    public void crearPelicula(Pelicula peli) {
        peliJpa.create(peli);
    }

    public void crearSala(Sala sala) {
        salaJpa.create(sala);
    }

    public void crearventa(Venta venta) {
        ventaJpa.create(venta);
    }
    
    //ELIMINAR
  
    public void eliminarProovedor(int id) {
        try {
            proJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCine(int id) {
        try {
            cineJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCliente(int id) {
        try {
            clieJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarClienteVip(int id) {
        try {
            clienVipJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCompra(int id) {
        try {
            compraJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEmpleado(int id) {
        try {
            empleJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEntrada(int id) {
        try {
            entraJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarFuncion(int id) {
        try {
            funJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarInsumo(int id) {
        try {
            insuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPago(int id) {
        try {
            pagoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPelicula(int id) {
        try {
            peliJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarSala(int id) {
        try {
            salaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public void eliminarVenta(int id) {
        try {
            ventaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //EDITAR

    public void editarProovedor(Proovedor prov) {
        try {
            proJpa.edit(prov);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCine(Cine cine) {
        try {
            cineJpa.edit(cine);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

    public void editarCliente(Cliente cliente) {
        try {
            clieJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarClienteVip(ClienteVip clienteVip) {
        try {
            clienVipJpa.edit(clienteVip);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCompra(Compra compra) {
        try {
            compraJpa.edit(compra);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEmpleado(Empleado empleado) {
        try {
            empleJpa.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEntrada(Entrada entrada) {
        try {
            entraJpa.edit(entrada);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarFuncion(Funcion funcion) {
        try {
            funJpa.edit(funcion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarInsumo(Insumo insumo) {
        try {
            insuJpa.edit(insumo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPago(Pago pago) {
        try {
            pagoJpa.edit(pago);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPelicula(Pelicula peli) {
        try {
            peliJpa.edit(peli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarSala(Sala sala) {
        try {
            salaJpa.edit(sala);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void editarVenta(Venta venta) {
        try {
            ventaJpa.edit(venta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //MOSTRAR

    public Proovedor traerProovedor(int id) {
        return proJpa.findProovedor(id);
    }
    public ArrayList<Proovedor> traerProovedores() {
        
        List<Proovedor> listita = proJpa.findProovedorEntities();
        ArrayList<Proovedor> listaProovedores = new ArrayList(listita);
        return listaProovedores;
    }

    public Cliente traerCliente(int id) {
        return clieJpa.findCliente(id);    
    }
    public ArrayList<Cliente> traerClientes() {
        List<Cliente> listita = clieJpa.findClienteEntities();
        ArrayList<Cliente> listaClientes = new ArrayList(listita);
        return listaClientes;    
    }

    public ClienteVip traerClienteVip(int id) {
        return clienVipJpa.findClienteVip(id);
    }
    public ArrayList<ClienteVip> traerClientesVip() {
        List<ClienteVip> listita = clienVipJpa.findClienteVipEntities();
        ArrayList<ClienteVip> listaClientesVip = new ArrayList(listita);
        return listaClientesVip;     
    }

    public Compra traerCompra(int id) {
    return compraJpa.findCompra(id);    
    }
    public ArrayList<Compra> traerCompras() {
        List<Compra> listita = compraJpa.findCompraEntities();
        ArrayList<Compra> listaCompras = new ArrayList(listita);
        return listaCompras;     
    }

    public Empleado traerEmpleado(int id) {
        return empleJpa.findEmpleado(id);    
    }
    public ArrayList<Empleado> traerEmpleados() {
        List<Empleado> listita = empleJpa.findEmpleadoEntities();
        ArrayList<Empleado> listaEmpleados = new ArrayList(listita);
        return listaEmpleados;    
    }

    public Entrada traerEntrada(int id) {
        return entraJpa.findEntrada(id);    
    }
    public ArrayList<Entrada> traerEntradas() {
        List<Entrada> listita = entraJpa.findEntradaEntities();
        ArrayList<Entrada> listaEntradas = new ArrayList(listita);
        return listaEntradas;  
    }

    public Funcion traerFuncion(int id) {
        return funJpa.findFuncion(id);
    }
    
    public ArrayList<Funcion> traerFunciones() {
        List<Funcion> listita = funJpa.findFuncionEntities();
        ArrayList<Funcion> listaFunciones = new ArrayList(listita);
        return listaFunciones; 
    }

    public Insumo traerInsumo(int id) {
        return insuJpa.findInsumo(id);
    }
    public ArrayList<Insumo> traerInsumos() {
        List<Insumo> listita = insuJpa.findInsumoEntities();
        ArrayList<Insumo> listaInsumos = new ArrayList(listita);
        return listaInsumos;    
    }

    public Pago traerPago(int id) {
        return pagoJpa.findPago(id);
    }
    public ArrayList<Pago> traerPagos() {
        List<Pago> listita = pagoJpa.findPagoEntities();
        ArrayList<Pago> listaPagos = new ArrayList(listita);
        return listaPagos; 
    }

    public Pelicula traerPelicula(int id) {
        return peliJpa.findPelicula(id);
    }
    public ArrayList<Pelicula> traerPeliculas() {
        List<Pelicula> listita = peliJpa.findPeliculaEntities();
        ArrayList<Pelicula> listaPeliculas = new ArrayList(listita);
        return listaPeliculas; 
    }

    public Sala traerSala(int id) {
        return salaJpa.findSala(id);
    }
    public ArrayList<Sala> traerSalas() {
        List<Sala> listita = salaJpa.findSalaEntities();
        ArrayList<Sala> listaSalas = new ArrayList(listita);
        return listaSalas;
    }

    public Venta traerVenta(int id) {
        return ventaJpa.findVenta(id);
    }
    public ArrayList<Venta> traerVentas() {
        List<Venta> listita = ventaJpa.findVentaEntities();
        ArrayList<Venta> listaVentas = new ArrayList(listita);
        return listaVentas;
    }

    //FUNCION ESPECIAL CREADA
    public Funcion traerFuncionHorario(String horario) {
    List<Funcion> listita = funJpa.findFuncionEntities();
        ArrayList<Funcion> listaFunciones = new ArrayList(listita);
        for (Funcion funcion : listaFunciones) {
            if (funcion.getHorario().equalsIgnoreCase(horario)) {
                return funcion;
            }
        }
        return null;
    }
    
    
    public Entrada traerEntradaNueva(String asiento) {
    List<Entrada> lista = entraJpa.findEntradaEntities();
        ArrayList<Entrada> listaEntrada = new ArrayList(lista);
        for (Entrada entrada : listaEntrada) {
            if (entrada.getAsiento().equalsIgnoreCase(asiento)) {
                return entrada;
            }
        }
        return null;
    }
        
    
    
}
