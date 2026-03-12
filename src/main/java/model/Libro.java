package model;

public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private int anio;
    private String categoria;
    private boolean disponible;
    
    public Libro() {}

    public Libro(int id, String titulo, String autor, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.anio = 0;
        this.categoria = "";
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}