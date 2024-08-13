
package tareaprogra;

public class electrodomestico {
    
    private int codigo;
    private String marca, tipo;

    public electrodomestico(int codigo, String marca, String tipo) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
