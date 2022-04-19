import java.util.ArrayList;

public class Ejemplo {
  public static void main(String[] args) {

    int contador = 10;
    ArrayList<Integer> miArray = new ArrayList<Integer>();

    // Rellena el arrayList con valores de 0 a 9
    for (int i = 0; i < contador; i++) {
      miArray.add(i);
    }

    // Muestra el contenido del array
    System.out.println("Array original: ");
    for (Integer valor : miArray) {
      System.out.println(valor);
    }

    // Modifica el contenido del array multiplicando cada elemento por dos
    for (int i = 0; i < contador; i++) {
      miArray.set(i, contador * 2);
    }
    System.out.println("Array Multiplicado: ");
    // Vuelve a mostrar el contenido del array
    for (Integer valor : miArray) {
      System.out.println(valor);
    }
  }
}
