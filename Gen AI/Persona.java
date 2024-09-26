class Persona {
    // Atributos
    private String nombre;        // Atributo privado
    private int edad;            // Atributo privado
    protected String genero;      // Atributo protegido
    protected String direccion;   // Atributo protegido
    public String nacionalidad;   // Atributo público

    // Constructor
    public Persona(String nombre, int edad, String genero, String direccion, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
    }

    // Método privado
    private void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    // Método protegido
    protected void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    // Método público
    public void tomarShower() {
        System.out.println(nombre + " está tomando una ducha.");
    }

    // Métodos para obtener atributos privados
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}
