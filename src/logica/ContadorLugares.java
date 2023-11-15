package logica;

public class ContadorLugares{
    private int cantEventos;
    private Lugar lugar;
    
    public int getCantEventos(){
        return cantEventos;
    }

    public Lugar getLugar(){
        return lugar;
    }

    public ContadorLugares(Lugar lugar){
        this.cantEventos=1;
        this.lugar=lugar;
    }

public void contarLugares(){
cantEventos++;
}
}