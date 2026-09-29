

public class Caballo extends Pieza{
  
  public Caballo(Movimiento movimiento, Comportamiento comportamiento, Color color, Estado estado) {
    super(movimiento, comportamiento, color, estado);
  }

       @Override
    public void Mover(){
      System.out.println("se mueve en L");

    } 
}
