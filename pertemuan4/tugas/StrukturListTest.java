package pertemuan4.tugas;

public class StrukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();

        // // tugas a
        // list.addTail(4.5);
        // list.addHead(2.1);
        // list.addmid(3.4,2);

        //tugas b
        list.addTail(5.5);
        list.addHead(3.4);
        list.addmid(2.1,2);
        list.addmid(1.1,3);
        list.addmid(4.5,4); 



        list.displayElement();
    }
}
