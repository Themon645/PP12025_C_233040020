package pertemuan4.latihan;

public class StrukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        list.addTail(3);
        list.addTail(4);
        list.addmid(7,2);
        list.addmid(8,2);
        list.addHead(5);
        list.displayElement();
    }
}
