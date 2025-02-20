package PP12025_C_233040020.pertemuan3;

public class StrukturList {
  private node HEAD;

  public void addTail(int data) {
    node posNode=null, curNode=null;
    node newNode = new node(data);
    if (HEAD == null) 
    {
      HEAD = newNode;
    } 
    else {
      curNode = HEAD;
      while (curNode != null) {
        posNode = curNode;
        curNode = curNode.getNext();
      }
      posNode.setNext(newNode);
    }
  }
  
  public void addHead(int data) {
    node newNode = new node(data);
    if (HEAD == null) {
      HEAD = newNode;
    } else {
      newNode.setNext(HEAD);
      HEAD = newNode;
    }
  }

  public void displayElement() {
    node curNode = HEAD;
    while (curNode != null) {
      System.out.printf(curNode.getData()+ " ");
      curNode = curNode.getNext();
    }
  }
}
