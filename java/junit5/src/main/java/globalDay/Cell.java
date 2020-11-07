package globalDay;

public class Cell {
    private boolean isAlive;
    public Cell(boolean b) {
        this.isAlive = b;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void updateState(int i) {
        if(i == 2 || i == 3){
            this.isAlive = true;
        }else{
            this.isAlive = false;
        }

    }
}
