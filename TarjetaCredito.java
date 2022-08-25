import java.util.*;
import java.util.regex.Pattern;
import java.util.Random;

public class TarjetaCredito {

  //Campos
  private String numero;
  private String nombre;
  private double limite;
  private double tasa;
  private double saldo;

  //Constructor
  public TarjetaCredito(String numero, String nombre, double limite, double tasa) {
      if (Pattern.matches("[\\d]{4}-[\\d]{4}-[\\d]{4}-[\\d]{4}", numero)) {
        this.numero = numero;
      } else {
        Random r = new Random();
        int r1 = r.nextInt(9000) + 1000;
        int r2 = r.nextInt(9000) + 1000;
        int r3 = r.nextInt(9000) + 1000;
        int r4 = r.nextInt(9000) + 1000;
        String nuevoNum = r1 + "-" + r2 +  "-" + r3 + "-" + r4;
        this.numero = nuevoNum;
      }
    this.nombre = nombre;
    this.limite = limite;
    this.tasa = tasa;
    this.saldo = 0.0;
  }

  //Los metodos getLimiteCredito(), getNombre(), getTasaInteres(), y getNumero(), que devuelven los valores de los campos respectivamentes

  //Metodos
  public double getLimiteCredito(){
    return this.limite;
  }

  public String getNombre(){
    return this.nombre;
  }

  public double getTasaInteres(){
    return this.tasa;
  }

  public String getNumero(){
    return this.numero;
  }

  public double getSaldoActual(){
    return this.saldo;
  }

  public double getSaldoDisponible(){
    return this.limite - this.saldo;
  }

  public boolean comprar(double monto){
    if (this.limite >= monto){
      this.saldo += monto;
      return true;
    } else {
      return false;
    }
  }

  public boolean pagar(double monto){
    if (this.limite >= monto){
      this.saldo -= monto;
      return true;
    } else {
      return false;
    }
  }

  public void corte(){
    this.saldo = this.saldo + (this.saldo * this.tasa);
  }

  @Override
  public String toString(){
    return String.format("Numero: %s \nNombre: %s \nSaldo Actual: %.2f \nSaldo Disponible: %.2f \nLimite: %.2f \nTasa: %.2f \n", this.numero, this.nombre, this.saldo, this.getSaldoDisponible() , this.limite, this. tasa);
  }

  



  






  
}