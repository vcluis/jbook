// Fig. 7.11: PruebaPaqueteDeCartas.java
// Aplicación para barajar y repartir cartas.
public class PruebaPaqueteDeCartas
{
// ejecuta la aplicación
public static void main(String[] args){
    PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
    miPaqueteDeCartas.barajar(); // coloca las Cartas en orden aleatorio
    // imprime las 52 Cartas en el orden en el que se reparten
    for (int i = 1; i <= 52; i++){
        // reparte e imprime una Carta
        System.out.printf("%-19s", miPaqueteDeCartas.repartirCarta());
        if (i % 4 == 0) // imprime una nueva línea después de cada cuatro cartas
        System.out.println();
        }
    }
} // fin de la clase PruebaPaqueteDeCartas
