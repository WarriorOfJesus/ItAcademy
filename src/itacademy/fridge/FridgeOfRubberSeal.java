package itacademy.fridge;

public class FridgeOfRubberSeal  {
    boolean rubberSeal;

    public FridgeOfRubberSeal(boolean rubberSeal){
        this.rubberSeal = rubberSeal;
    }

    public void setRubberSeal(boolean rubberSeal){
        this.rubberSeal = rubberSeal;
    }
    public boolean getRubberSeal(){
        return this.rubberSeal;
    }

    @Override
    public String toString() {
        return "\nFridge have a rubber seal?: " + rubberSeal;
    }
}
