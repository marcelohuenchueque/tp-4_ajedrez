

public class Alfil extends Pieza{
  
  public Alfil(Movimiento movimiento, Comportamiento comportamiento, Color color, Estado estado) {
    super(movimiento, comportamiento, color, estado);
  }

        @Override
    public void Mover(){
      System.out.println("se mueve en diagonal");

    }
    
}
