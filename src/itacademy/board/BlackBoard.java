package itacademy.board;

public class BlackBoard extends AbstractBoard implements Recordable{

    @Override
    public void record() {
        System.out.println("the black board is written by chalk");
    }
}
