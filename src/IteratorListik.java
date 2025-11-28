import java.util.Iterator;

public class IteratorListik implements Iterator<Integer> {

    private Listik listik;
    private int index;

    public IteratorListik(Listik listik){
        this.listik = listik;
        this.index = listik.size() -1;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return 0;
    }
}
