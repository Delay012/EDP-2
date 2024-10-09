public class Cola {
    private Nodo <T> front, rear;
    public boolean isVacia(){
        return front == null;
    }

    public void encolar(T data ) {
        Nodo<T> temp = new Nodo<>(data);
        if (rear == null){
            front = rear = temp;
        }else {
            rear.ps = temp;
            rear = temp;
        }
    }

    public T desencolar(){
        if(isVacia()){
            System.out.println("La cola está vacía");
            return null;

        }else {
            T data = front.dato;
            front = front.ps;
            if(front == null){
                rear=null;
            }
            return data;
            System.out.println("Hola invancito");
        }
    }

    public recorrer(){

    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public void encolar(){
        Nodo T = new Nodo(data)
    }
}
