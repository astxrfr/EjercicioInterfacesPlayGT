public class Cancion extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;

    public Cancion(String titulo, String autor, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public String tipo() {
        return "canción";
    }

    @Override
    public double calcularTamanoMB() {
        return duracionSeg * 60 * 1.5;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo "+tipo()+": "+getTitulo()+" ("+duracionSeg+"s)");
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }
}
