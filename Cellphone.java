public class Cellphone {

  //Campos
  private String telefono;
  private String marca;
  private int empresa;
  private int minutos;

  //Constructor
  public Cellphone(String telefono, String empresa, String marca){
    this.telefono = telefono;
    if (empresa.equals("Tigo")) {
      this.empresa = 1;
    } else if (empresa.equals("Claro")){
      this.empresa = 2;
    } else if (empresa.equals("Movistar")){
      this.empresa = 3;
    } else if (empresa.equals("Indefinido")){
      this.empresa = 0;
    }
    this.marca = marca;
    minutos = 250; 
  }

  public String getEmpresa(){
    if(this.empresa == 1){
      return "Tigo";
    } else if (this.empresa == 2){
      return "Claro";
    } else if (this.empresa == 3){
      return "Movistar";
    } else {
      return "Indefinido";
    }
  }

  public void changeEmpresa(String nueva){
    if (nueva.equals("Tigo")) {
      this.empresa = 1;
    } else if (nueva.equals("Claro")){
      this.empresa = 2;
    } else if (nueva.equals("Movistar")){
      this.empresa = 3;
    } else if (nueva.equals("Indefinido")){
      this.empresa = 0;
    }
  }

  public String getNumero(){
    return this.telefono;
  }

  public int saldoMinutos(){
    return this.minutos;
  }

  public void resetMinutos(){
    this.minutos = 250;
  }

  public void consumirMinutos(int consumidos){
    if(this.minutos >= consumidos){
      this.minutos -= consumidos;
    } else {
      System.out.println("Minutos Insuficientes");
    }
  }

  public String getMarca(){
    return this.marca;
  }

  @Override
  public String toString(){
    return String.format("%s - %s - %s", this.telefono,empresa, this.marca);
  }



}