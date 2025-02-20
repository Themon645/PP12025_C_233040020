package PP12025_C_233040020.pertemuan3;

public class node {
  private int data;
  private node next;

  /* inisialisasi atribut node */
  public node(int data) {
    this.data = data;
  }

  /* setter & getter */
  public void setData(int Data) {
    this.data = data;
    }
    
    public int getData() {
    return data;
    }
    
    public void setNext(node next) {
    this.next = next;
    }
    
    public node getNext() {
    return next;
    }
}
