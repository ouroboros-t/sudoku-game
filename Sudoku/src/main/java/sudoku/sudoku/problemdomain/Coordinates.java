package sudoku.sudoku.problemdomain;

import java.util.Objects;

public class Coordinates {
    private final int x;
    private final int y;


    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     *stores coordinate objects in hashmap in order to keep track of
     * UI elements...
     * @param o
     * @returns
     */
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x &&
                y == that.y;
}

    /**
     *hashcode is unique identifier that is generated
     * @return
     */
    @Override
    public int hashCode(){
        return Objects.hash(x,y);//creates unique identifier from the x and y values;


}

}
