package principal;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanj
 */
public class miClaseGenial {

    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        for (int i = 0; i < 10; i++) {
            rs.crearRectangulos();
            rs.mostarRect();
            rs.dibujar();
        }
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Perrito firu = new Perrito();
        Perrito perris[] = new Perrito[3];
        
        firu.crearPerrito("Firulais", "Salchicha"); 
        perris[0]=firu;
        System.out.println("Perro: "+ firu);
        Perrito amado = new Perrito();
        System.out.println("Ingrese los datos de este perro tan amado");
        String razaX = sc.next();
        firu.setNombre(razaX);
        amado.crearPerrito(razaX, sc.next());
        
        perris[1]=amado;
        System.out.println("Amado es: "+amado);
        System.out.println("Cargue la edad del perro: ");
        firu = new Perrito("Colita","Collie",sc.nextInt());
        perris[2]=firu;
        System.out.println("su nombre: "+firu.getNombre());
        System.out.println("Perro: "+ firu);
        for (int i = 0; i < perris.length; i++) {
            System.out.println("Perro"+i+"-> "+perris[i].getNombre());
        }
        System.out.println("Todos los datos con for-e");
        for (Perrito perri : perris) {
            System.out.println(perri);
        }  
    }
}  

