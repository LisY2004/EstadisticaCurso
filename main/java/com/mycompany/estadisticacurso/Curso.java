/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticacurso;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author labctr
 */
public class Curso {
    private String nombre;
    private int cantidadEstudiantes;
    private ArrayList<Estudiante> estudiantes;
    
    public Curso(String nombre, int cantidadEstudiantes) {
    this.nombre = nombre;
    this.cantidadEstudiantes = cantidadEstudiantes;
    this.estudiantes = new ArrayList<>();
    }
    
    public void agregarEstudiante(double nota, int semestre){
    Estudiante estudiante = new Estudiante(nota,semestre);
    estudiantes.add(estudiante);
    }
   
    //Calcular la estadistica osea el promedio y cuantos pasaron
    public void calcularEstadistica(){
       double sumaNotas = 0;
       int estudiantesQueAprobaron=0;
       int estudiantesQueReprobaron;
       
      int[] semestreFrecuente = new int[21]; 
      int[] notaFrecuente = new int[101];
      
      for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();

            if (estudiante.getNota() >= 14) {
                estudiantesQueAprobaron++;
            }
          int semestre = estudiante.getSemestre();
            semestreFrecuente[semestre]++;

            int nota = (int) estudiante.getNota();
            notaFrecuente[nota]++;
      }
         estudiantesQueReprobaron = cantidadEstudiantes - estudiantesQueAprobaron;

         int semestreMasRepetido = maxIndex(semestreFrecuente);
         double notaMasRepetida = maxIndex(notaFrecuente);
        
         System.out.println("\nEstadísticas del curso:");
         System.out.println("Nota promedio: " + notaMasRepetida);
         System.out.println("Estudiantes Aprobados: " + estudiantesQueAprobaron);
         System.out.println("Estudiantes Reprobados : " + estudiantesQueReprobaron);
         System.out.println("Semestre : " + semestreMasRepetido);
         
    }
    //Para buscar el numero maximo en un array
     private int maxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
