public class Traffic {

  //Campos
  private String color;

  //Constructor
  public Traffic(){
    this.color = "ROJO";
  }

  //Metodos
  public String getColor(){
    return this.color;
  }

  public void changeColor(){
    if(this.color.equals("ROJO")){
      this.color = "VERDE";
    } else if (this.color.equals("VERDE")){
      this.color = "AMARILLO";
    } else if (this.color.equals("AMARILLO")){
      this.color = "ROJO";
    }
  }

  @Override 
  public String toString(){
    return String.format("%s", this.color);
  }

}