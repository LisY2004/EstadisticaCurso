/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticacurso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EstadisticaCurso {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = leer.nextLine();
        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadEstudiantes= leer.nextInt();
        Curso curso = new Curso(nombreCurso, cantidadEstudiantes);
        
        for(int i=1; i<=cantidadEstudiantes; i++){
        System.out.print("Ingrese la nota del estudiante: " + i + ": ");
        double nota = leer.nextDouble();
        System.out.print("Ingrese el semetre del estudiante: " + i + ": ");
        int semestre =leer.nextInt();
        curso.agregarEstudiante(nota, semestre);
        }
        curso.calcularEstadistica();
    }
}
