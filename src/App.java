public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNombre("Arnold Jimenez");
        cliente.setEdad(25);
        cliente.setTelefono("332-551-12-54");
        cliente.setCredito(5250000);
        System.out.println("*********CLIENTE*********" + "\n" + "Nombre: " + cliente.getNombre() + "\n" + "Edad: "
                + cliente.getEdad() + "\n" + "Telefono: "
                + cliente.getTelefono() + "\n" + "Credito: $" + cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Harold Panza");
        trabajador.setEdad(48);
        trabajador.setTelefono("314-255-45-54");
        trabajador.setSalario(2850000);
        System.out.println("*********TRABAJADOR*********" + "\n" + "Nombre: " + trabajador.getNombre() + "\n" + "Edad: "
                + trabajador.getEdad() + "\n"
                + "Telefono: " + trabajador.getTelefono() + "\n" + "Salario: $" + trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona() {
        // System.out.println("Estamos en el constructor de Persona");
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    float credito;

    public Cliente() {
        // System.out.println("Estamos en el constructor de Cliente");
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {
    float salario;

    public Trabajador() {
        // System.out.println("Estamos en el constructor de Trabajador");
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}