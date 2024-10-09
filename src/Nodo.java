public class Nodo {
    T dato;
    Nodo<T> ps;

    public Nodo(T dato){
        this.dato = dato;
        this.ps = null;

    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getPs() {
        return ps;
    }

    public void setPs(Nodo<T> ps) {
        this.ps = ps;
    }


}
