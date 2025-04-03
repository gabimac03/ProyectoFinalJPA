

package com.mycompany.proyectofinaljpa;

import ControladoraGrafica.ControladoraGrafica;
import IGU.*;
import IGU.LoginCliente;
import Modelo.Cine;
import Modelo.Controladora;
import Modelo.Cliente;

/**
 *
 * @author Admin
 */
public class ProyectoFinalJPA {

    public static void main(String[] args) {
        // Crear la vista de login
        LoginCliente login = new LoginCliente();
        // Crear la vista de inicio
        Inicio inicio = new Inicio();
        // Crear la vista de empleados
        Empleados empleado = new Empleados();
        // Crear la vista de salas
        Salas sala = new Salas();
        // Crear la vista de ventas
        Ventas ventas = new Ventas();
        // Crear el modelo (puedes agregar lógica adicional si lo deseas)
        Cliente modeloCliente = new Cliente();
        // Crear el controlador principal
        ControladoraGrafica control = new ControladoraGrafica(login, modeloCliente, inicio, empleado, ventas, sala);
        Controladora controladoraLogica = new Controladora();
        
    
        
        /* //PROOVEDORES
        List<Proovedor> proovedores = new ArrayList<>();
        Proovedor proovedor1 = new Proovedor(1, "Lucas", "26125626262", "Buenos Aires");
        Proovedor proovedor2 = new Proovedor(2, "Mario", "2612561222", "Catamarca");
        controladoraLogica.crearProovedor(proovedor1);
        controladoraLogica.crearProovedor(proovedor2);
        proovedores.add(proovedor1);
        proovedores.add(proovedor2);
        
        //INSUMOS
        List<Insumo> insumos = new ArrayList();
        Insumo insumo1 = new Insumo(1, "Papa", 2000);
        Insumo insumo2 = new Insumo(2, "Doritos", 3500);
        controladoraLogica.crearInsumo(insumo1);
        controladoraLogica.crearInsumo(insumo2);
        insumos.add(insumo1);
        insumos.add(insumo2);
        
        
        //COMPRA
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date    fecha = sdf.parse("11/11/2024");  // Ajusta el formato a lo que desees
        Compra compra = new Compra();
        compra.setId(1);
        compra.setFecha(fecha);
        compra.setInsumos(insumos);
        compra.setProovedores(proovedores);
        controladoraLogica.crearCompra(compra);
        
        //ENTRADAS
        List<Entrada> entradas = new ArrayList<>();
        Entrada entrada1 = new Entrada(1, 15000, "1");
        Entrada entrada2 = new Entrada(2, 15000, "2");
        controladoraLogica.crearEntrada(entrada1);
        controladoraLogica.crearEntrada(entrada2);
        entradas.add(entrada1);
        entradas.add(entrada2);
        
        //PELICULAS
        List<Pelicula> peliculas = new ArrayList<>();
        Pelicula pelicula1 = new Pelicula(1, "No hables con extraños", "Terror");
        Pelicula pelicula2 = new Pelicula(2, "Fragmentado", "Suspenso");
        controladoraLogica.crearPelicula(pelicula1);
        controladoraLogica.crearPelicula(pelicula2);
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        
        
        //FUNCION
        Funcion funcion1 = new Funcion(1, "20:45", pelicula1, entradas);
        Funcion funcion2 = new Funcion(2, "22:00", pelicula2, entradas);
        controladoraLogica.crearFuncion(funcion1);
        controladoraLogica.crearFuncion(funcion2);
        //SALAS
        Sala sala1 = new Sala(1, 1, 200);
        Sala sala2 = new Sala(2, 2, 200);
        SalaVip salaVip = new SalaVip("Pantalla 8k", 3, 1, 300);
        SalaVip salaVip2 = new SalaVip("3D", 4, 2, 300);
        controladoraLogica.crearSala(salaVip);
        controladoraLogica.crearSala(salaVip2);
        controladoraLogica.crearSala(sala1);
        controladoraLogica.crearSala(sala2);
       
        
        //CINES
        Cine cine1 = new Cine();
        cine1.setDireccion("Shopping");
        cine1.setNombre("Cinepolis");
        Cine cine2 = new Cine();
        cine2.setDireccion("Palmares");
        cine2.setNombre("Cinemark");
        controladoraLogica.crearCine(cine1);
        controladoraLogica.crearCine(cine2);
        List<Cine> cines = new ArrayList<>();
        cines.add(cine1);
        cines.add(cine2);
        
        //EMPLEADOS 
        Empleado empleado1 = new Empleado(1, "Mario", 2333333, cines);
        Empleado empleado2 = new Empleado(2, "Rodrigo", 32222, cines);
        controladoraLogica.crearEmpleado(empleado1);
        controladoraLogica.crearEmpleado(empleado2); */
    }
}
