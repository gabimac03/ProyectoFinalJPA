package Modelo;

import Modelo.Entrada;
import Modelo.Pelicula;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T10:50:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Funcion.class)
public class Funcion_ { 

    public static volatile SingularAttribute<Funcion, Pelicula> pelicula;
    public static volatile SingularAttribute<Funcion, String> horario;
    public static volatile ListAttribute<Funcion, Entrada> entradas;
    public static volatile SingularAttribute<Funcion, Integer> id;

}