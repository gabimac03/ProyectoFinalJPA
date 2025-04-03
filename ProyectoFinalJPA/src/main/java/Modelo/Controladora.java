/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import IGU.Empleados;
import IGU.Inicio;
import IGU.LoginCliente;
import IGU.Salas;
import IGU.Ventas;
import Persistencia.ControladoraPersistencia;
import Persistencia.EmpleadoJpaController;
import Persistencia.EntradaJpaController;
import Persistencia.FuncionJpaController;
import Persistencia.VentaJpaController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public final class Controladora{
   
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();

    public Controladora() {
    }



    //CREAR
    public void crearProovedor (Proovedor prov){
        controlpersis.crearProovedor(prov);
    }
    public void crearCine (Cine cine){
        controlpersis.crearCine(cine);
    }
    public void crearCliente (Cliente cliente){
        // Validación en el Controlador
        if (cliente.getNombre().isEmpty() || cliente.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Los campos no pueden estar vacíos.");
        }
    
        if (!cliente.getEmail().contains("@")) {
            throw new IllegalArgumentException("El correo electrónico no es válido.");
        }
        try {
            controlpersis.crearCliente(cliente);
        } catch (Exception e) {
            throw new RuntimeException("Error al guardarr el cliente", e);
        }
  
    }
    public void crearClienteVip (ClienteVip clienteVip){
        controlpersis.crearClienteVip(clienteVip);
    }
    public void crearCompra (Compra compra){
        controlpersis.crearCompra(compra);
    }
    public void crearEmpleado (Empleado emp){
        controlpersis.crearEmpleado(emp);
    }
    public void crearEntrada (Entrada entrada){
        controlpersis.crearEntrada(entrada);
    }
    public void crearFuncion (Funcion fun){
        controlpersis.crearFuncion(fun);
    }
    public void crearInsumo (Insumo insu){
        controlpersis.crearInsumo(insu);
    }
    public void crearPago (Pago pago){
        controlpersis.crearPago(pago);
    }
    public void crearPelicula (Pelicula peli){
        controlpersis.crearPelicula(peli);
    }
    public void crearSala (Sala sala){
        controlpersis.crearSala(sala);
    }
    public void crearVenta (Venta venta){
        controlpersis.crearventa(venta);
    }
    
    //ELIMINAR
    
    public void eliminarProovedor(int id){
        controlpersis.eliminarProovedor(id);
    }
    public void eliminarCine(int id){
        controlpersis.eliminarCine(id);
    }
    public void eliminarCliente(int id){
        controlpersis.eliminarCliente(id);
    }
    public void eliminarClienteVip(int id){
        controlpersis.eliminarClienteVip(id);
    }
    public void eliminarCompra(int id){
        controlpersis.eliminarCompra(id);
    }
    public void eliminarEmpleado(int id){
        controlpersis.eliminarEmpleado(id);
    }
    public void eliminarEntrada(int id){
        controlpersis.eliminarEntrada(id);
    }
    public void eliminarFuncion(int id){
        controlpersis.eliminarFuncion(id);
    }
    public void eliminarInsumo(int id){
        controlpersis.eliminarInsumo(id);
    }
    public void eliminarPago(int id){
        controlpersis.eliminarPago(id);
    }
    public void eliminarPelicula(int id){
        controlpersis.eliminarPelicula(id);
    }
    public void eliminarSala(int id){
        controlpersis.eliminarSala(id);
    }
    public void eliminarVenta(int id){
        controlpersis.eliminarVenta(id);
    }
    
    //EDITAR
    
    public void editarProovedor(Proovedor prov){
        controlpersis.editarProovedor(prov);
    }
    public void editarCine(Cine cine){
        controlpersis.editarCine(cine);
    }
    public void editarCliente(Cliente cliente){
        controlpersis.editarCliente(cliente);
    }
    public void editarClienteVip(ClienteVip clienteVip){
        controlpersis.editarClienteVip(clienteVip);
    }
    public void editarCompra(Compra compra){
        controlpersis.editarCompra(compra);
    }
    public void editarEmpleado(Empleado empleado){
        controlpersis.editarEmpleado(empleado);
    }
    public void editarEntrada(Entrada entrada){
        controlpersis.editarEntrada(entrada);
    }
    public void editarFuncion(Funcion funcion){
        controlpersis.editarFuncion(funcion);
    }
    public void editarInsumo(Insumo insumo){
        controlpersis.editarInsumo(insumo);
    }
    public void editarPago(Pago pago){
        controlpersis.editarPago(pago);
    }
    public void editarPelicula(Pelicula peli){
        controlpersis.editarPelicula(peli);
    }
    public void editarSala(Sala sala){
        controlpersis.editarSala(sala);
    }
    public void editarVenta(Venta venta){
        controlpersis.editarVenta(venta);
    }
    
    //MOSTRAR
    
    public Proovedor traerProovedor(int id){
        return controlpersis.traerProovedor(id);
    }
    public ArrayList<Proovedor> traerProovedores (){
        return controlpersis.traerProovedores();
    }
    
    public Cliente traerCliente(int id){
        return controlpersis.traerCliente(id);
    }
    public ArrayList<Cliente> traerClientes (){
        return controlpersis.traerClientes();
    }
    
    public ClienteVip traerClienteVip(int id){
        return controlpersis.traerClienteVip(id);
    }
    public ArrayList<ClienteVip> traerClientesVip (){
        return controlpersis.traerClientesVip();
    }
    
    public Compra traerCompra(int id){
        return controlpersis.traerCompra(id);
    }
    public ArrayList<Compra> traerCompras (){
        return controlpersis.traerCompras();
    }
    
    public Empleado traerEmpleado(int id){
        return controlpersis.traerEmpleado(id);
    }
    public ArrayList<Empleado> traerEmpleados (){
        return controlpersis.traerEmpleados();
    }
    
    public Entrada traerEntrada(int id){
        return controlpersis.traerEntrada(id);
    }
    public ArrayList<Entrada> traerEntradas (){
        return controlpersis.traerEntradas();
    }
    
    public Funcion traerFuncion(int id){
        return controlpersis.traerFuncion(id);
    }
    public ArrayList<Funcion> traerFunciones (){
        return controlpersis.traerFunciones();
    }
    
    public Insumo traerInsumo(int id){
        return controlpersis.traerInsumo(id);
    }
    public ArrayList<Insumo> traerInsumos (){
        return controlpersis.traerInsumos();
    }
    
    public Pago traerPago(int id){
        return controlpersis.traerPago(id);
    }
    public ArrayList<Pago> traerPagos (){
        return controlpersis.traerPagos();
    }
    
    public Pelicula traerPelicula(int id){
        return controlpersis.traerPelicula(id);
    }
    public ArrayList<Pelicula> traerPeliculas (){
        return controlpersis.traerPeliculas();
    }
    
    public Sala traerSala(int id){
        return controlpersis.traerSala(id);
    }
    public ArrayList<Sala> traerSalas (){
        return controlpersis.traerSalas();
    }
    
    public Venta traerVenta(int id){
        return controlpersis.traerVenta(id);
    }
    public ArrayList<Venta> traerVentas (){
        return controlpersis.traerVentas();
    }
    public Funcion traerFuncionHorario(String horario){
        return controlpersis.traerFuncionHorario(horario);
    }
    public Entrada traerEntradaNueva(String asiento){
        return controlpersis.traerEntradaNueva(asiento);
    }
  
}

    
    
