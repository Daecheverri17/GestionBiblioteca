class Transaccion {
    Libro libro;
    boolean esPrestamo; // true si es un préstamo, false si es una devolución
    public String nombrePrestatario;
    public int diasReserva;

    public Transaccion(Libro libro, boolean esPrestamo, String nombrePrestatario, int diasReserva) {
        this.libro = libro;
        this.esPrestamo = esPrestamo;
        this.nombrePrestatario = nombrePrestatario;
        this.diasReserva = diasReserva;


    }
}