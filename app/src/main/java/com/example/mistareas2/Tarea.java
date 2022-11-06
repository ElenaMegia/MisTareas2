package com.example.mistareas2;

public class Tarea {//Creamos el objeto tarea

    private String nombre;
    private double coste;
    private String fecha;
    private String prioridad;
    private String descripcion;

    public Tarea() {
    }

    public Tarea(String nombre, double coste, String fecha, String prioridad, String descripcion) {
        this.nombre = nombre;
        this.coste = coste;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //prueba para hacer commit
    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", coste=" + coste +
                ", fecha='" + fecha + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
