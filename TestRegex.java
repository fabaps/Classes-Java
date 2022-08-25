import java.util.Random;
import java.util.regex.Pattern;

public class TestRegex{
  public static void main(String[] args){

    String numero = "9823-12D4-1234-1234";

    if (Pattern.matches("[\\d]{4}-[\\d]{4}-[\\d]{4}-[\\d]{4}", numero)) {
        System.out.println("Valido");
      } else {
        System.out.println("Creando Tarjeta");
        Random r = new Random();
        int r1 = r.nextInt(9000) + 1000;
        int r2 = r.nextInt(9000) + 1000;
        int r3 = r.nextInt(9000) + 1000;
        int r4 = r.nextInt(9000) + 1000;
        String nuevoNum = r1 + "-" + r2 +  "-" + r3 + "-" + r4;
        System.out.println(nuevoNum);
      }

  }
}