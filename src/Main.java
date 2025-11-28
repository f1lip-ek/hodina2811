public class Main {
    public static void main(String[] args) {

        Listik listik = new Listik();
        listik.addNumber(5);
        listik.addNumber(6);
        listik.addNumber(9);
        listik.addNumber(1);
        listik.addNumber(4);
        listik.addNumber(20);
        listik.addNumber(8);
        listik.addNumber(3);
        listik.addNumber(2);

        IteratorListik iterator = (IteratorListik) listik.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}