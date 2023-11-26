import javax.swing.ImageIcon;

public class Libro {
    private String titulo;
    private String descripcion;
    private int anio;
    private ImageIcon imagen;

    public Libro(String titulo, String descripcion, int anio, ImageIcon imagen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anio = anio;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getAnio() {
        return anio;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ")";
    }
}