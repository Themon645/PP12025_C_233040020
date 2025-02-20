public class node {
private int nilai;
private node next;

// Inisialisasi Node
public node(int nilai) {
this.nilai = nilai;
}

// Setter & Getter
public void setNilai(int nilai) {
this.nilai = nilai;
}

public int getNilai() {
return nilai;
}

public void setNext(node next) {
this.next = next;
}

public node getNext() {
return next;
}
}