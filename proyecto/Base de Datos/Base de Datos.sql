-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS Proyecto;
USE Proyecto;

-- Tabla de Roles (para control de acceso)
CREATE TABLE roles (
    id_rol INT AUTO_INCREMENT PRIMARY KEY,
    nombre_rol VARCHAR(50) NOT NULL UNIQUE
);

-- Tabla de Usuarios (Entidad base para Administrativos y Pacientes)
CREATE TABLE usuarios (
    documento VARCHAR(20) PRIMARY KEY, -- Documento como identificador único
    contrasena VARCHAR(255) NOT NULL, -- Cifrado según RNF03
    correo VARCHAR(100) NOT NULL UNIQUE,
    id_rol INT,
    activo BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (id_rol) REFERENCES roles(id_rol)
);

-- Tabla de Administrativos
CREATE TABLE administrativos (
    documento VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    correo VARCHAR(100),
    estado BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (documento) REFERENCES usuarios(documento)
);

-- Tabla de Pacientes
CREATE TABLE pacientes (
    documento VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    fecha_nacimiento DATETIME,
    telefono VARCHAR(20),
    correo VARCHAR(100),
    direccion VARCHAR(255),
    activo BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (documento) REFERENCES usuarios(documento)
);

-- Tabla de odontologos
CREATE TABLE odontologos (
    id_odontologo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    especialidad VARCHAR(100),
    telefono VARCHAR(20),
    correo VARCHAR(100),
    disponibilidad BOOLEAN DEFAULT TRUE --
);

-- Tabla de Ubicaciones (para Jornadas y Consultorios)
CREATE TABLE ubicaciones (
    id_ubicacion INT AUTO_INCREMENT PRIMARY KEY,
    latitud VARCHAR(50),
    longitud VARCHAR(50),
    descripcion VARCHAR(255)
);

-- Tabla de Consultorios
CREATE TABLE consultorios (
    id_consultorio INT AUTO_INCREMENT PRIMARY KEY,
    direccion VARCHAR(255),
    estado BOOLEAN DEFAULT TRUE, -- Activo/Inactivo
    matricula VARCHAR(50),
    id_ubicacion INT,
    FOREIGN KEY (id_ubicacion) REFERENCES ubicaciones(id_ubicacion)
);

-- Tabla de Consultas
CREATE TABLE consultas (
    id_consulta INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATETIME NOT NULL,
    motivo VARCHAR(255),
    cantidad INT DEFAULT 1,
    estado VARCHAR(50), -- Pendiente, Realizada, Cancelada
    id_odontologo INT,
    id_consultorio INT,
    FOREIGN KEY (id_odontologo) REFERENCES odontologos(id_odontologo),
    FOREIGN KEY (id_consultorio) REFERENCES consultorios(id_consultorio)
);

-- Tabla de Solicitudes (Vínculo entre Paciente, Administrativo y Consulta)
CREATE TABLE solicitudes (
    id_solicitud INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    estado VARCHAR(50),
    motivo VARCHAR(255),
    documento_paciente VARCHAR(20),
    documento_admin VARCHAR(20),
    id_consulta INT,
    FOREIGN KEY (documento_paciente) REFERENCES pacientes(documento),
    FOREIGN KEY (documento_admin) REFERENCES administrativos(documento),
    FOREIGN KEY (id_consulta) REFERENCES consultas(id_consulta)
);

-- Tabla de Historias Clínicas (Información sensible)
CREATE TABLE historias_clinicas (
    id_historia INT AUTO_INCREMENT PRIMARY KEY,
    fecha_registro DATETIME DEFAULT CURRENT_TIMESTAMP,
    diagnostico TEXT,
    tratamiento TEXT,
    observaciones TEXT,
    documento_paciente VARCHAR(20) NOT NULL,
    -- Estrictamente necesario para RNF04 (Saber quién registró)
    registrado VARCHAR(20) NOT NULL, 
    modificacion DATETIME ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (documento_paciente) REFERENCES pacientes(documento),
    FOREIGN KEY (registrado) REFERENCES administrativos(documento)
);

-- Tabla de registro de acceso a las Hisotias Clinicas (Información sensible)
CREATE TABLE acceso_historias_clinicas (
    id_log INT AUTO_INCREMENT PRIMARY KEY,
    fecha_acceso DATETIME DEFAULT CURRENT_TIMESTAMP,
    documento_admin VARCHAR(20) NOT NULL,
    documento_paciente VARCHAR(20) NOT NULL,
    FOREIGN KEY (documento_admin) REFERENCES administrativos(documento),
    FOREIGN KEY (documento_paciente) REFERENCES pacientes(documento)
);

-- Tabla de Notificaciones
CREATE TABLE notificaciones (
    id_notificacion INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50),
    mensaje TEXT NOT NULL,
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    estado VARCHAR(50), -- Enviada, Leída
    documento_paciente VARCHAR(20),
    FOREIGN KEY (documento_paciente) REFERENCES pacientes(documento)
);

-- Tabla de Jornadas Odontológicas
CREATE TABLE jornadas (
    id_jornada INT AUTO_INCREMENT PRIMARY KEY,
    fecha_inicio DATETIME,
    fecha_fin DATETIME,
    id_ubicacion INT,
    documento_admin VARCHAR(20),
    FOREIGN KEY (id_ubicacion) REFERENCES ubicaciones(id_ubicacion),
    FOREIGN KEY (documento_admin) REFERENCES administrativos(documento)
);

-- Procedimientos almacenados
