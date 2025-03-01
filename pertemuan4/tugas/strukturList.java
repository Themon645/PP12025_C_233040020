package pertemuan4.tugas;

public class strukturList {
    private node HEAD;
  
    public void addTail(double data) {
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
    
    public void addHead(double data) {
      node newNode = new node(data);
      if (HEAD == null) {
        HEAD = newNode;
      } else {
        newNode.setNext(HEAD);
        HEAD = newNode;
      }
    }
  

    public void addmid(double data, double pos) {
      node posNode=null, curNode=null;
      int i;
      node newNode = new node(data);
      if (HEAD == null) 
      {
        HEAD = newNode;
      } 
      else {
        curNode = HEAD;
        if (curNode.getData() == pos) {
          newNode.setNext(curNode.getNext());
          curNode.setNext(newNode);
        } 
        else {
          i = 1;
          while (curNode != null && i < pos) {
            posNode = curNode;
            curNode = curNode.getNext();
            i++;
          }
          posNode.setNext(newNode);
          newNode.setNext(curNode);
        }
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
