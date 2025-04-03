/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladoraGrafica;

import IGU.Empleados;
import IGU.Inicio;
import IGU.LoginCliente;
import IGU.Salas;
import IGU.Ventas;
import Modelo.Cliente;
import Modelo.Controladora;
import Modelo.Empleado;
import Modelo.Entrada;
import Modelo.Funcion;
import Modelo.Pago;
import Modelo.Sala;
import Modelo.SalaVip;
import Modelo.TipoPago;
import Modelo.Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ControladoraGrafica implements ActionListener{
    
    
    public LoginCliente vistaCliente;
    public Cliente modeloCliente;
    public Inicio vistaInicio;
    public Empleados vistaEmpleados;
    public Ventas vistaVentas;
    public Salas vistaSalas;
    Controladora control = new Controladora();

    public ControladoraGrafica(LoginCliente vistaCliente, Cliente modeloCliente, Inicio vistaInicio, Empleados vistaEmpleados, Ventas vistaVentas, Salas vistaSalas) {
        this.vistaCliente = vistaCliente;
        this.modeloCliente = modeloCliente;
        this.vistaInicio = vistaInicio;
        this.vistaEmpleados = vistaEmpleados;
        this.vistaVentas = vistaVentas;
        this.vistaSalas = vistaSalas;
        
        vistaCliente.setVisible(true);
        vistaCliente.jBINICIAR.addActionListener(this);
        vistaInicio.jBDETALLES.addActionListener(this);
        vistaInicio.jBEMPLEADOS.addActionListener(this);
        vistaInicio.jBRESERVAR.addActionListener(this);
        vistaInicio.jBSALAS.addActionListener(this);
        vistaInicio.jBVENTAS.addActionListener(this);
        
        cargarEntradasEnComboBox();
        cargarFuncionesEnComboBoxMod();
     
    }
    
    

    
    
    
    
    
    @Override
public void actionPerformed(ActionEvent e) {
    // Acción para el botón de iniciar sesión
    if (e.getSource().equals(vistaCliente.getjBINICIAR())) {
        login();
    }else if (e.getSource().equals(vistaInicio.getjBDETALLES())) {
        detalles();
    } else if (e.getSource().equals(vistaInicio.jBRESERVAR)) {
       reservarFuncion();
    }else if (e.getSource().equals(vistaInicio.jBEMPLEADOS)) {
        vistaEmpleados.setVisible(true);
        cargarEmpleados();
    }else if (e.getSource().equals(vistaInicio.jBVENTAS)) {
        vistaVentas.setVisible(true);
        cargarVentas();
    }else if (e.getSource().equals(vistaInicio.jBSALAS)) {
        vistaSalas.setVisible(true);
        cargarSalas();
    }
    
}

// Método para cargar las funciones en el ComboBox
private void cargarFuncionesEnComboBoxMod() {
        // Obtener la lista de clientes desde la capa lógica
        ArrayList<Funcion> listaFunciones = control.traerFunciones();

        // Limpiar el ComboBox antes de agregar los nuevos clientes
        vistaInicio.jCBFUNCIONES.removeAllItems();

        // Crear un ArrayList de Strings para mostrar en el ComboBox (por ejemplo, nombres de los clientes)
        ArrayList<String> listaIdFunciones = new ArrayList<>();

        // Llenar la lista con los nombres de los clientes
        for (Funcion funcion : listaFunciones) {
            listaIdFunciones.add(funcion.getHorario());  // O usa cliente.getEmail() o el campo que prefieras
        }

        // Crear un DefaultComboBoxModel con la lista de nombres
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listaIdFunciones.toArray(new String[0]));

        // Establecer el modelo del ComboBox
        vistaInicio.jCBFUNCIONES.setModel(model);
    }
private void cargarEntradasEnComboBox() {
           // Obtener la lista de clientes desde la capa lógica
        ArrayList<Entrada> listaEntradas = control.traerEntradas();

        // Limpiar el ComboBox antes de agregar los nuevos clientes
        vistaInicio.jCBENTRADAS.removeAllItems();

        // Crear un ArrayList de Strings para mostrar en el ComboBox (por ejemplo, nombres de los clientes)
        ArrayList<String> listaEntradasAsiento = new ArrayList<>();

        // Llenar la lista con los nombres de los clientes
        for (Entrada entrada : listaEntradas) {
            listaEntradasAsiento.add(String.valueOf(entrada.getAsiento()));  // O usa cliente.getEmail() o el campo que prefieras
        }

        // Crear un DefaultComboBoxModel con la lista de nombres
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listaEntradasAsiento.toArray(new String[0]));

        // Establecer el modelo del ComboBox
        vistaInicio.jCBENTRADAS.setModel(model);
}
private void cargarSalas(){
                // Obtener la lista de salas desde la base de datos
            List<Sala> listaSalas = control.traerSalas();

            // Validar si la lista está vacía
            if (listaSalas.isEmpty()) {
                JOptionPane.showMessageDialog(vistaInicio, "No hay salas registradas.", "Información", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Crear el modelo para el JTable
            String[] columnas = {"ID", "Número", "Capacidad", "Beneficio"};
            Object[][] datos = new Object[listaSalas.size()][columnas.length];

            // Rellenar los datos para el JTable
            for (int i = 0; i < listaSalas.size(); i++) {
                Sala sala = listaSalas.get(i);
                datos[i][0] = sala.getId(); 
                datos[i][1] = sala.getNumero(); 
                datos[i][2] = sala.getCapacidad();

                // Verificar si la sala es una SalaVip
                if (sala instanceof SalaVip) {
                    SalaVip salaVip = (SalaVip) sala; // Hacer cast a SalaVip
                    datos[i][3] = salaVip.getBeneficios(); // Agregar el beneficio al modelo
                } else {
                    datos[i][3] = "N/A"; // Si no es SalaVip, mostrar "N/A"
                }
            }

            // Configurar el modelo para el JTable
            vistaSalas.getjTSALAAS().setModel(new javax.swing.table.DefaultTableModel(datos, columnas));
}
private void cargarEmpleados(){
            // Obtener la lista de empleados desde la base de datos
        List<Empleado> listaEmpleados = control.traerEmpleados();

        // Validar si la lista está vacía
        if (listaEmpleados.isEmpty()) {
            JOptionPane.showMessageDialog(vistaInicio, "No hay empleados registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Crear el modelo para el JTable
        String[] columnas = {"DNI", "Nombre", "Cine"};
        Object[][] datos = new Object[listaEmpleados.size()][columnas.length];

        // Rellenar los datos para el JTable
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado empleado = listaEmpleados.get(i);
            datos[i][0] = empleado.getDni(); // Suponiendo que Empleado tiene un método getNombre()
            datos[i][1] = empleado.getNombre(); // Suponiendo que Empleado tiene un método getApellido()
            datos[i][2] = empleado.getCines().get(i).getNombre(); // Suponiendo que Empleado tiene un método getEmail()
        }

        // Configurar el modelo para el JTable
        vistaEmpleados.getjTEMPLEADOS().setModel(new javax.swing.table.DefaultTableModel(datos, columnas));
}
private void cargarVentas(){
    // Obtener la lista de empleados desde la base de datos
        List<Venta> listaVentas = control.traerVentas();

        // Validar si la lista está vacía
        if (listaVentas.isEmpty()) {
            JOptionPane.showMessageDialog(vistaInicio, "No hay ventas registradas.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Crear el modelo para el JTable
        String[] columnas = {"ID", "Fecha", "Tipo Pago"};
        Object[][] datos = new Object[listaVentas.size()][columnas.length];

        // Rellenar los datos para el JTable
        for (int i = 0; i < listaVentas.size(); i++) {
            Venta venta = listaVentas.get(i);
            datos[i][0] = venta.getId(); 
            datos[i][1] = venta.getFecha(); 
            datos[i][2] = venta.getPago().getPago(); 
        }

        // Configurar el modelo para el JTable
        vistaVentas.getjTVENTAS().setModel(new javax.swing.table.DefaultTableModel(datos, columnas));
}
private void reservarFuncion(){
    // Obtener la función seleccionada
    String funcionSeleccionada = (String) vistaInicio.jCBFUNCIONES.getSelectedItem();
    Funcion funcionSeleccionadaObj = (Funcion) control.traerFuncionHorario(funcionSeleccionada);
    String entradaSeleccionada = (String) vistaInicio.jCBENTRADAS.getSelectedItem();
    Entrada entradaSeleccionadaObj = (Entrada) control.traerEntradaNueva(entradaSeleccionada);

    if (funcionSeleccionada != null && entradaSeleccionada != null) {
        // Obtener los detalles
        String pelicula = funcionSeleccionadaObj.getPelicula().getTitulo();
        String horario = funcionSeleccionadaObj.getHorario();
        double precio = entradaSeleccionadaObj.getPrecio(); // Suponiendo que Entrada tiene un método getPrecio()
        String asiento = entradaSeleccionadaObj.getAsiento();
        
         // Determinar cuál radio button está seleccionado
        String sala = "";
        if (vistaInicio.jBSALAS.isSelected()) { // RadioButton para Comun
            sala = "Común";
        } else if (vistaInicio.jRBSALAVIP.isSelected()) { // RadioButton para Vip
            sala = "VIP";
        }
        // Obtener el ButtonGroup donde están los RadioButton
        ButtonGroup grupoPago = vistaInicio.getButtonGroup2(); 
        

        // Verificar cuál radio button está seleccionado
        TipoPago metodoPagoSeleccionado = null;
        if (vistaInicio.jRadioButton1.isSelected()) {
            metodoPagoSeleccionado = TipoPago.EFECTIVO;
        } else if (vistaInicio.jRadioButton2.isSelected()) {
            metodoPagoSeleccionado = TipoPago.TARJETA;
        } else {
            // Si ninguno está seleccionado, puedes mostrar un mensaje de error o dejarlo vacío
            System.out.println("No selecciono un tipo de pago");
        }
        // Crear el comprobante en formato texto
        // Crear el objeto Pago
        Pago pago = new Pago(precio, metodoPagoSeleccionado);

        // Crear la venta
        Venta nuevaVenta = new Venta(new Date(), pago); // Pasa el objeto Pago al constructor

        try {
           control.crearVenta(nuevaVenta);

            // Crear el comprobante
            String comprobante = "Comprobante de Reserva:\n"
                               + "Película: " + pelicula + "\n"
                               + "Horario: " + horario + "\n"
                               + "Asiento: " + asiento+ "\n"
                               + "Precio: $" + String.format("%.2f", precio) + "\n"
                               + "Método de Pago: " + metodoPagoSeleccionado + "\n"
                               + "ID Venta: " + nuevaVenta.getId() + "\n"
                               + "Fecha: " + nuevaVenta.getFecha() + "\n"
                               + "¡Gracias por su reserva!";

            // Mostrar el comprobante
            JOptionPane.showMessageDialog(vistaInicio, comprobante, "Reserva Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vistaInicio, "Error al guardar la venta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(vistaInicio, "Por favor, seleccione una función, una entrada y un método de pago.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
private void login(){
     // Obtener los datos de los campos de texto
        String nombre = vistaCliente.getjTFNOMBRE().getText();
        String email = vistaCliente.getjTFEMAIL().getText();

        // Verificar si los datos son válidos
        if (modeloCliente.ingresoValido(nombre, email)) {
            modeloCliente.setNombre(nombre);
            modeloCliente.setEmail(email);

            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setEmail(email);

            try {
                // Guardar el cliente en la base de datos
                control.crearCliente(nuevoCliente);
     
                // Crear y mostrar la ventana de Inici
                vistaInicio.setVisible(true);
                vistaCliente.dispose(); // Cerrar la ventana de login
            } catch (RuntimeException ex) {
                // Manejo de errores
                JOptionPane.showMessageDialog(vistaCliente, "Error al crear el cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(vistaCliente, "Por favor, ingrese datos válidos.");
        }
}
private void detalles(){
     System.out.println("asfasfasfasf");
        // Obtener la función seleccionada en el JComboBox
        String funcionSeleccionada = (String) vistaInicio.jCBFUNCIONES.getSelectedItem();
        Funcion funcionSeleccionadaObj = (Funcion) control.traerFuncionHorario(funcionSeleccionada);
        
        
        if (funcionSeleccionada != null) {
            // Obtener los detalles de la película y el horario
            String titulo = funcionSeleccionadaObj.getPelicula().getTitulo();
            // Mostrar los detalles en el JLabel
            vistaInicio.jLPELICULA.setText(titulo);
            
        // Obtener la función seleccionada en el JComboBox
        String entradaSeleccionada = (String) vistaInicio.jCBENTRADAS.getSelectedItem();
        Entrada entradaSeleccionadaObj = (Entrada) control.traerEntradaNueva(entradaSeleccionada);
            
            if (entradaSeleccionada != null){
            Double precio = entradaSeleccionadaObj.getPrecio();
            
            vistaInicio.jLPRECIO.setText(String.valueOf(precio));
            }
            
        } else {
            // Si no hay función seleccionada, mostrar mensaje de error
            JOptionPane.showMessageDialog(vistaInicio, "Por favor, seleccione una función.", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
}
