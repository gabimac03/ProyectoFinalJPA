Proyecto Final JPA

Este es un sistema de gestión desarrollado en Java utilizando JPA (Hibernate) para la persistencia de datos. Permite realizar operaciones CRUD sobre entidades en una base de datos relacional.

-----------------------------------------------------------------------------------------

Tecnologías Utilizadas 🚀

Java 17+

JPA (Hibernate)

MySQL como base de datos

Maven como gestor de dependencias

NetBeans / IntelliJ / Eclipse (IDE recomendado)

-----------------------------------------------------------------------------------------

Instalación y Configuración ⚙️

1. Clonar el repositorio 📂

 git clone https://github.com/gabimac03/ProyectoFinalJPA.git
 
 cd ProyectoFinalJPA

2. Configurar la base de datos 🛢️

Asegúrate de tener MySQL instalado y crea una base de datos:

CREATE DATABASE gestion_db;

Configura las credenciales en persistence.xml (ubicado en src/main/resources/META-INF/):

<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/gestion_db"/>

<property name="javax.persistence.jdbc.user" value="root"/>

<property name="javax.persistence.jdbc.password" value="tu_contraseña"/>

-----------------------------------------------------------------------------------------

3. Compilar y ejecutar 🏃‍♂️

mvn clean install

mvn exec:java

-----------------------------------------------------------------------------------------

Estructura del Proyecto 📂

ProyectoFinalJPA/
├── src/main/java/com/gestion/
│   ├── entidades/        # Clases de entidad JPA
│   ├── repositorios/     # Interfaces DAO con JPA
│   ├── servicios/        # Lógica de negocio
│   ├── Main.java         # Punto de entrada del programa
├── src/main/resources/META-INF/persistence.xml  # Configuración de JPA
├── pom.xml              # Dependencias de Maven
└── README.md            # Documentación

-----------------------------------------------------------------------------------------

Uso 🖥️

Una vez ejecutado, puedes probar las operaciones CRUD:

Crear una nueva entidad

Listar registros

Actualizar datos

Eliminar una entidad

-----------------------------------------------------------------------------------------

Contribuciones 🤝

Si quieres contribuir, haz un fork del repositorio, realiza tus cambios y envía un pull request.

-----------------------------------------------------------------------------------------

🚀 Desarrollado por Ángel Gabriel Macocco


