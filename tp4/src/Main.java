public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Tablero tablero1 = new Tablero();

        Peon peon1n = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.negro,Estado.libre); 
        Peon peon2n = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.negro,Estado.libre);
        Peon peon3n = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.negro,Estado.libre);
        Peon peon4n = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.negro,Estado.libre);
        Peon peon5n = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.negro,Estado.libre);
        Peon peon6n = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.negro,Estado.libre);
        Peon peon7n = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.negro,Estado.libre);
        Peon peon8n = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.negro,Estado.libre);
        //----------------------------------------------------------------------------------------
        Rey reyN = new Rey(Movimiento.tenue,Comportamiento.postrero,Color.negro,Estado.libre);
        //----------------------------------------------------------------------------------------
        Reina reinaN = new Reina(Movimiento.encarnizo,Comportamiento.armada,Color.negro,Estado.libre);
        //----------------------------------------------------------------------------------------
        Caballo caballo1n = new Caballo(Movimiento.sesgo_en_L,Comportamiento.ligero ,Color.negro ,Estado.libre);
        Caballo caballo2n = new Caballo(Movimiento.sesgo_en_L,Comportamiento.ligero ,Color.negro ,Estado.libre);
        //----------------------------------------------------------------------------------------
        Torre torre1n = new Torre(Movimiento.directa,Comportamiento.homérica,Color.negro,Estado.libre);
        Torre torre2n = new Torre(Movimiento.directa,Comportamiento.homérica,Color.negro,Estado.libre);
        //----------------------------------------------------------------------------------------
        Alfil alfil1n = new Alfil(Movimiento.sesgo_en_diagonal,Comportamiento.oblicuo,Color.negro,Estado.libre);
        Alfil alfil2n = new Alfil(Movimiento.sesgo_en_diagonal,Comportamiento.oblicuo,Color.negro,Estado.libre);

        //----------------------------------------------------------------------------------------
        Peon peon1b = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.blanco,Estado.libre);
        Peon peon2b = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.blanco,Estado.libre);
        Peon peon3b = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.blanco,Estado.libre);
        Peon peon4b = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.blanco,Estado.libre);
        Peon peon5b = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.blanco,Estado.libre);
        Peon peon6b = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.blanco,Estado.libre);
        Peon peon7b = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.blanco,Estado.libre);
        Peon peon8b = new Peon (Movimiento.ladino,Comportamiento.agresor,Color.blanco,Estado.libre);
        //----------------------------------------------------------------------------------------
        Rey reyB = new Rey(Movimiento.tenue,Comportamiento.postrero,Color.blanco,Estado.libre);
        //----------------------------------------------------------------------------------------
        Reina reinaB = new Reina(Movimiento.encarnizo,Comportamiento.armada,Color.blanco,Estado.libre);
        //----------------------------------------------------------------------------------------
        Caballo caballo1b = new Caballo(Movimiento.sesgo_en_L,Comportamiento.ligero ,Color.blanco ,Estado.libre);
        Caballo caballo2b = new Caballo(Movimiento.sesgo_en_L,Comportamiento.ligero ,Color.blanco ,Estado.libre);
        //----------------------------------------------------------------------------------------
        Torre torre1b = new Torre(Movimiento.directa,Comportamiento.homérica,Color.blanco,Estado.libre);
        Torre torre2b = new Torre(Movimiento.directa,Comportamiento.homérica,Color.blanco,Estado.libre);
        //----------------------------------------------------------------------------------------
        Alfil alfil1b = new Alfil(Movimiento.sesgo_en_diagonal,Comportamiento.oblicuo,Color.blanco,Estado.libre);
        Alfil alfil2b = new Alfil(Movimiento.sesgo_en_diagonal,Comportamiento.oblicuo,Color.blanco,Estado.libre);
        //----------------------------------------------------------------------------------------        

        System.out.println(peon1n);
        System.out.println(reyN);
        System.out.println(reinaN);
        System.out.println(caballo1n);
        System.out.println(torre1n);
        System.out.println(alfil1n);
    
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(peon1b);
        System.out.println(reyB);
        System.out.println(reinaB);
        System.out.println(caballo1b);
        System.out.println(torre1b);
        System.out.println(alfil1b);
        //-----------------------------------------------------------------------------------------
        tablero1.MostrarTablero();

    }
} 