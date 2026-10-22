public class Podcast extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;
    private int episodio;

    public Podcast(String titulo, String autor, int duracionSeg, int episodio) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;
    }

    @Override
    public String tipo() {
        return "podcast";
    }

    @Override
    public double calcularTamanoMB() {
        return duracionSeg * 60;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo "+tipo()+": "+getTitulo()+" ("+duracionSeg+"s)");
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    public int getEpisodio() {
        return episodio;
    }
}
