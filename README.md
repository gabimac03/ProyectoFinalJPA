Proyecto Final JPA

Este es un proyecto desarrollado en Java utilizando JPA (Java Persistence API) para la gestión de datos en una base de datos relacional. Implementa operaciones CRUD (Crear, Leer, Actualizar y Eliminar) con una estructura optimizada para el manejo de entidades.

----------------------------------------------------------------------

🚀 Tecnologías utilizadas

Java (JDK 17 o superior)

JPA con Hibernate como proveedor de persistencia

MySQL como base de datos

Maven para la gestión de dependencias

NetBeans / IntelliJ / Eclipse (cualquier IDE compatible)

----------------------------------------------------------------------

📂 Estructura del proyecto

ProyectoFinalJPA/

├── src/main/java/

│   ├── entidades/        # Clases de entidad JPA

│   ├── dao/              # Clases de acceso a datos (DAO)

│   ├── servicios/        # Lógica de negocio

│   ├── utils/            # Configuración y utilidades

│   ├── main/             # Clase principal del proyecto

│

├── src/main/resources/

│   ├── META-INF/persistence.xml  # Configuración de JPA

│

├── pom.xml             # Archivo de configuración de Maven

└── README.md           # Documentación del proyecto

----------------------------------------------------------------------

⚙️ Configuración del proyecto

Configurar la base de datos:

Crear una base de datos en MySQL con el nombre correspondiente (ej. proyecto_jpa).

Configurar las credenciales en persistence.xml.

----------------------------------------------------------------------

Compilar y ejecutar:

mvn clean install

mvn exec:java -Dexec.mainClass="main.Main"

----------------------------------------------------------------------

🛠️ Funcionalidades principales

✔️ Gestión de entidades mediante JPA✔️ Uso de anotaciones como @Entity, @Table, @Column, @Id, @GeneratedValue✔️ CRUD completo con EntityManager✔️ Manejo de relaciones @OneToMany, @ManyToOne✔️ Configuración en persistence.xml✔️ Conexión con MySQL a través de JDBC Driver

----------------------------------------------------------------------

📌 Contribuciones

¡Siéntete libre de hacer un fork del repositorio y mejorar el proyecto! ✨

👨‍💻 Autor

Ángel Gabriel Macocco
