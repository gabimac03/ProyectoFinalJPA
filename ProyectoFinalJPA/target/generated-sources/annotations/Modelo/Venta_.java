package Modelo;

import Modelo.Cliente;
import Modelo.Funcion;
import Modelo.Pago;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T10:50:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile ListAttribute<Venta, Funcion> funciones;
    public static volatile SingularAttribute<Venta, Integer> id;
    public static volatile ListAttribute<Venta, Cliente> clientes;
    public static volatile SingularAttribute<Venta, Pago> pago;

}