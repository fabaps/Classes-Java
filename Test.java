public class Test{
  public static void main(String[] args){

    Traffic semaforo = new Traffic();
    System.out.println(semaforo.getColor());
    semaforo.changeColor();
    System.out.println(semaforo);
    semaforo.changeColor();
    System.out.println(semaforo);
    semaforo.changeColor();
    System.out.println(semaforo);

  }
}