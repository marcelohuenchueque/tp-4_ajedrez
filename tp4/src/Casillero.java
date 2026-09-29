
enum ColorCasilla{
    B,N
}
public class Casillero {
    private ColorCasilla  colorCasilla;

    public ColorCasilla getColorCasilla() {
        return colorCasilla;
    }

    public void setColorCasilla(ColorCasilla colorCasilla) {
        this.colorCasilla = colorCasilla;
    }

    public Casillero(ColorCasilla colorCasilla) {
        this.colorCasilla = colorCasilla;
    }

    @Override
    public String toString() {
        return  " "+colorCasilla+" " ;
    }

    
    
}
