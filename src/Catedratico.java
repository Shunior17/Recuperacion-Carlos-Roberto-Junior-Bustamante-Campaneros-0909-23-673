public class Catedratico {
    private String nombre;
    private String apellido;
    private String curso;
    private int id;

    public Catedratico(String nombre, String apellido, String curso, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.id = id;
    }
    public Catedratico() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
