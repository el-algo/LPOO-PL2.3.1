/*
8. Para probar ciertos niveles de modificador de acceso, debe utilizar el
concepto de HERENCIA. Por lo tanto, cree la CLASE "ESTUDIANTE" (ALUMNO) que
herede de PERSONA. Esta clase debe tener SUS PROPIOS ATRIBUTOS Y MÉTODOS
*/
class Estudiante extends Persona {
    // Atributos de la clase Estudiante
    int matricula;              
    double promedio;            
    int semestre;

    // Constructor de la clase Estudiante
    // Inicializa los atributos de Persona y los propios de Estudiante
    public Estudiante(String nombre, int edad, String genero, String nacionalidad,
                      String estadoCivil, int matricula, double promedio, int semestre) {
        // Llama a los setters de la clase Persona para establecer los atributos
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        setNacionalidad(nacionalidad);
        setEstadoCivil(estadoCivil);

        // Llama a métodos heredados de la clase Persona
        tomarShower(5, true);  // Llama al método protegido tomarShower
        descansar(5);          // Llama al método público descansar
        comer("snack");        // Llama al método público comer

        // Inicializa los atributos específicos de Estudiante
        this.matricula = matricula;
        this.promedio = promedio;
        this.semestre = semestre;
    }

    // Métodos getter y setter para el atributo matricula
    public int getMatricula() {
        return matricula; // Devuelve el valor de matricula
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula; // Establece el valor de matricula
    }

    // Métodos getter y setter para el atributo promedio
    public double getPromedio() {
        return promedio; // Devuelve el valor de promedio
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio; // Establece el valor de promedio
    }

    // Métodos getter y setter para el atributo semestre
    public int getSemestre() {
        return semestre; // Devuelve el valor de semestre
    }
    
    public void setSemestre(int semestre) {
        this.semestre = semestre; // Establece el valor de semestre
    }

    // Método toString para representar al estudiante como una cadena
    public String toString() {
        return getNombre() + "\n" + getEdad() + "\n" + getGenero() + "\n" +
               getNacionalidad() + "\n" + getEstadoCivil() + "\n" +
               getMatricula() + "\n" + getPromedio() + "\n" + getSemestre();
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Crea una instancia de Estudiante
        Estudiante e1 = new Estudiante("Fulano ", 23, "Hombre", "Argentino", 
                                        "Soltero", 156123, 8.5, 5);
        // Imprime la representación en cadena del estudiante
        System.out.println(e1.toString());
    }
}
