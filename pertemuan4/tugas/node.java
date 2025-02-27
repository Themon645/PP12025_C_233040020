package pertemuan4.tugas;

public class node {
    private double data;
    private node next;
    
    public node(double data) {
        this.data = data;
        this.next = null;
    }
    
    public double getData() {
        return data;
    }
    
    public void setData(double data) {
        this.data = data;
    }
    
    public node getNext() {
        return next;
    }
    
    public void setNext(node next) {
        this.next = next;
    }
}
