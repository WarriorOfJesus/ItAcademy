package itacademy.board;

public class WhiteBoard extends AbstractBoard implements Recordable{
    @Override
    public void record() {
        System.out.println("the white board is written by black marker ");
    }
}
