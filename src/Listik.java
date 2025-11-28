import java.util.ArrayList;
import java.util.Iterator;

public class Listik implements Iterable<Integer>{

    private ArrayList<Integer> listik;


    public int size(){
        return listik.size();
    }

    public Integer get(int index){
        return listik.get(index);
    }


    public void addNumber(int number){
        listik.add(number);
    }


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
