/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package guerigeri.ejercicio5f;

import java.util.*;
import java.lang.Iterable;

/**
 *
 * @author ERICK
 */
public class Soldado implements Comparable<Soldado>{

    // Definición y encapsulación de datos
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    // Método constructor de la clase
    public Soldado(String nif, String nombre, String apellido1, String apellido2, int edad) {
        
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    // GETTERS
    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getEdad() {
        return edad;
    }

    // SETTERS
    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // toString para los datos que se van a mostrar
    @Override
    public String toString() {
        return "Soldado{" + "nif=" + nif + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + '}';
    }

    // equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Soldado other = (Soldado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    // métodos abstractos para el comparable
    @Override
    public int compareTo(Soldado o) {
        return this.nif.compareToIgnoreCase(o.nif);
    
    }
    
    
    /*
    1. Saber el número de soldados que hay.
    2. Alistar a un solado.
    3. Saber si el ejército no tiene soldados.
    4. Saber si un soldado está en el ejército.
    4. Sacar todos los soldados, en forma de ArrayList.
    5. Desmatricular a un soldado del ejército.    
    */
    
//    public int numSoldados(Soldado s){
//        s.
//    }
    
//    public static boolean comprobarListado(Soldado s){
//        
//    }
//    
//    public static Soldado nuevoSoldado(String nif, String nombre, String apellido1, String apellido2, int edad){
//        
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
