package Main;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        RevolverDeAgua revolver= new RevolverDeAgua();
        Juego juego = new Juego();
        
        int cant;
        System.out.println("Ingrese la cantidad de jugadores");
        int aux = scn.nextInt();
        if (aux < 1 || aux > 6) {
            cant = 6;
        } else {
            cant = aux;
        }
        revolver.llenarRevolver(cant);
        int id=1;
        for (int i=0;i<cant;i++){
            Jugador jugador = new Jugador(id);
            id=id+1;
            jugador.setMojado(jugador.disparo(revolver));
            jugadores.add(jugador);
        }
        juego.llenarJuego(jugadores, revolver);
       //System.out.println(revolver.toString());
        juego.ronda();
        

    }

}
