
public class Peon extends Pieza {
  
  public Peon(Movimiento movimiento, Comportamiento comportamiento, Color color, Estado estado) {
    super(movimiento, comportamiento, color, estado);
  }

    @Override
    public void Mover(){
      System.out.println("se mueve 1 casilla hacia adelante");

    }
    
}
