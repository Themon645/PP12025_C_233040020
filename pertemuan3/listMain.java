package PP12025_C_233040020.pertemuan3;

public class listMain {
  public static void main(String[] args) {
  StrukturList list = new StrukturList();
  //addTail Output = 3 4 5
  list.addTail(3);
  list.addTail(4);
  list.addTail(5);

  //addTail Output = 3 2 1 
  list.addTail(3);
  list.addTail(2);
  list.addTail(1);

  //addTail Output = 1 4 5 7
  list.addTail(1);
  list.addTail(4);
  list.addTail(5);
  list.addTail(7);
  
  //addHead Output = 5 4 3
  list.addHead(5);
  list.addHead(4);
  list.addHead(3);

  //addHead Output = 3 2 1
  list.addHead(1);
  list.addHead(2);
  list.addHead(3);

  //addHead Output = 1 4 5 7
  list.addHead(7);
  list.addHead(5);
  list.addHead(4);
  list.addHead(1);

  System.out.println("Menampilkan Element List : ");
  list.displayElement();

}
}
