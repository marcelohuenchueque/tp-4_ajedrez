public class Torre extends Pieza{
  
  public Torre(Movimiento movimiento, Comportamiento comportamiento, Color color, Estado estado) {
    super(movimiento, comportamiento, color, estado);
  }

    @Override
    public void Mover(){
      System.out.println("se mueve en linea recta hacia la direccion que desee");

    }    
}
