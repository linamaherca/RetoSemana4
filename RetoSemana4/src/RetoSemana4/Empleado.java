package RetoSemana4;



public class Empleado {
    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private Boolean esProveedor;
    private int salario;
    private String cargo;

    public Empleado(String nombre, String correo, String celular, int salario) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.salario = salario;
    }
    
    public Empleado() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getEsProveedor() {
        return esProveedor;
    }

    public void setEsProveedor(Boolean EsProveedor) {
        this.esProveedor = esProveedor;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + "\n nombre=" + nombre + "\n apellido=" + apellido + "\n correo=" + correo + "\n celular=" + celular + "\n esProveedor=" + esProveedor + "\n salario=" + salario + "\n cargo=" + cargo + '}';
    }
    
}

