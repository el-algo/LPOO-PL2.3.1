public class Main {
    public static void main(String[] args) {
        // Creando un objeto de la clase Persona
        Persona persona = new Persona("Juan", 25, "Masculino", "Calle Falsa 123", "Mexicana");

        // Desplegando los atributos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.genero);
        System.out.println("Dirección: " + persona.direccion);
        System.out.println("Nacionalidad: " + persona.nacionalidad);

        // Invocando los métodos
        // persona.dormir(); // No se puede acceder a este método porque es privado
        persona.comer();      // Acceso permitido, ya que es protegido
        persona.tomarShower(); // Acceso permitido, ya que es público
    }
}
