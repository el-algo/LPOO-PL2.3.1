/*
1. Modelar una clase llamada Persona.
2. Considerar al menos CINCO atributos demográficos de una persona.
3. Modelar los métodos set y get para cada atributo.
4. Considerar los métodos comer(...), dormir(...), tomarShower(...). Para cada
método decida el protocolo. Cada uno de los tres métodos debe recibir AL MENOS
UN PARAMETRO, y como comportamiento deben al menos imprimir el valor del
parámetros o parámetros que le llegaron.
5. Al menos un atributo declararlo como PROTECTED. Al menos un atributo
declararlo como PRIVATE.
6. Poner al menos un método como PROTECTED. Al menos un método declararlo como
PRIVATE.
*/
public class Persona {
    // Atributos de la clase Persona
    String nombre;               
    int edad;                    
    String genero;               
    protected String nacionalidad; 
    private String estadoCivil;

    // Método protegido para tomar una ducha
    // Parámetros: minutosDucha (int) y agradable (boolean)
    protected void tomarShower(int minutosDucha, boolean agradable) {
        System.out.println("La ducha fue de " + minutosDucha + " minutos.");
        System.out.println("¿La ducha fue agradable? " + agradable);
    }

    // Método público para descansar, invoca al método dormir
    // Parámetro: horas (int)
    public void descansar(int horas) {
        dormir(horas); // Llama al método privado dormir con las horas especificadas
    }

    // Método privado para dormir
    // Parámetro: horasDescanso (int)
    private void dormir(int horasDescanso) {
        System.out.println("Esta persona descansó " + horasDescanso + " horas seguidas.");
    }

    // Método público para comer
    // Parámetro: platillo (String)
    public void comer(String platillo) {
        System.out.println("Degustando un delicioso " + platillo + ".");
    }

    // Métodos setter y getter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el valor del atributo nombre
    }

    public String getNombre() {
        return nombre; // Devuelve el valor del atributo nombre
    }

    // Métodos setter y getter para el atributo edad
    public void setEdad(int edad) {
        this.edad = edad; // Establece el valor del atributo edad
    }

    public int getEdad() {
        return edad; // Devuelve el valor del atributo edad
    }

    // Métodos setter y getter para el atributo genero
    public void setGenero(String genero) {
        this.genero = genero; // Establece el valor del atributo genero
    }

    public String getGenero() {
        return genero; // Devuelve el valor del atributo genero
    }

    // Métodos setter y getter para el atributo nacionalidad
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad; // Establece el valor del atributo nacionalidad
    }
    
    public String getNacionalidad() {
        return nacionalidad; // Devuelve el valor del atributo nacionalidad
    }

    // Métodos setter y getter para el atributo estadoCivil
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil; // Establece el valor del atributo estadoCivil
    }

    public String getEstadoCivil() {
        return estadoCivil; // Devuelve el valor del atributo estadoCivil
    }
}
