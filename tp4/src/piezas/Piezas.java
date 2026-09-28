package piezas;
enum Movimiento {
   tenue,sesgo_en_diagonal,encarnizo, directo, ladino ,sesgo_en_L    
}
enum Comportamiento {
   homérica, ligero, armada, postrero, oblicuo, agresor
}
enum Color{
    negro,blanco
}
enum Estado {
    libre, prisionero
}
public class Piezas {
    private Movimiento movimiento;
    private Comportamiento comportamiento;
    private Color color;
    private Estado estado;
    
    public Movimiento getMovimiento() {
        return movimiento;
    }
    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }
    public Comportamiento getComportamiento() {
        return comportamiento;
    }
    public void setComportamiento(Comportamiento comportamiento) {
        this.comportamiento = comportamiento;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Piezas(Movimiento movimiento, Comportamiento comportamiento, Color color, Estado estado) {
        this.movimiento = movimiento;
        this.comportamiento = comportamiento;
        this.color = color;
        this.estado = estado;
    }
    public Piezas() {
    }  

    public void Mover(){
       
    }  
}

