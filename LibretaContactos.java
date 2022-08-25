public class LibretaContactos{

  //Campos
  private String apellido;
  private String nombre;
  private String telefono;
  private boolean favorito;

  //Constructor 
  public LibretaContactos(String apellido, String nombre, String telefono){
    this.apellido = apellido;
    this.nombre = nombre;
    this.telefono = telefono;
    favorito = false;
  }

  //Metodos
  public String getLastName(){
    return this.apellido;
  }

  public String getFirstName(){
    return this.nombre;
  }

  public String getPhoneNumber(){
    return this.telefono;
  }

  public boolean isFavorite(){
    if(favorito){
      return true;
    } else {
      return false;
    }
  }

  public void setAsFavorite(){
    if (favorito == false){
      favorito = true;
    }
  }

  public boolean equals(LibretaContactos otra){
    if(this.telefono.equals(otra.telefono)){
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString(){
    return String.format("%s %s %s", this.telefono, this.apellido, this.nombre);
  }




}





