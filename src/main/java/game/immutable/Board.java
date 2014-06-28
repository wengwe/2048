package game.immutable;

/**
 * User: Jason Weng

 */
public interface Board {

    public int getSize();

    public static int EMPTY_VAL  =   0;

    public int[] getRow(int num);


    public  int[] getCol(int num);

}
