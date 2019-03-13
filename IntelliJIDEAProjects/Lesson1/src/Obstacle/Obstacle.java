package Obstacle;

public abstract class Obstacle {
    private int size;

    public Obstacle(int size) {
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }
}
