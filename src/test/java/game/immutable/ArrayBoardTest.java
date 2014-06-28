package game.immutable;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

/**
 * User: Jason Weng
 */
public class ArrayBoardTest extends TestCase {


    @Test
    public void testThatRowBuilderOK() {
         ArrayBoard arrayBoard = buildBoardByRow();

         int[] row1 = arrayBoard.getRow(0);
         assertTrue(Arrays.equals(new int[]{1, 0, 0, 0}, row1));

         int[] row4 = arrayBoard.getRow(3);
         assertTrue(Arrays.equals(new int[]{0, 0, 0, 1}, row4));
       //assertEquals(new int[]{0, 0, 0, 1}, row4);

         int[] col1 = arrayBoard.getCol(0);
         assertTrue(Arrays.equals(new int[]{1, 0, 0, 0}, col1));
      //   assertEquals(new int[]{1, 0, 0, 0}, col1);

        int[] col4 = arrayBoard.getCol(3);
        assertTrue(Arrays.equals(new int[]{0, 0, 0, 1}, col4));
       // assertEquals(new int[]{0, 0, 0, 1}, col3);

    }

    @Test
    public void testThatColBuilderOK() {
        ArrayBoard arrayBoard = buildBoardByCol();

        int[] row1 = arrayBoard.getRow(0);
        assertTrue(Arrays.equals(new int[]{1, 0, 0, 0}, row1));

        int[] row4 = arrayBoard.getRow(3);
        assertTrue(Arrays.equals(new int[]{0, 0, 0, 1}, row4));
        //assertEquals(new int[]{0, 0, 0, 1}, row4);

        int[] col1 = arrayBoard.getCol(0);
        assertTrue(Arrays.equals(new int[]{1, 0, 0, 0}, col1));
        //   assertEquals(new int[]{1, 0, 0, 0}, col1);

        int[] col4 = arrayBoard.getCol(3);
        assertTrue(Arrays.equals(new int[]{0, 0, 0, 1}, col4));
        // assertEquals(new int[]{0, 0, 0, 1}, col3);

    }

    private ArrayBoard buildBoardByRow() {
        return new ArrayBoard.Builder(4).setRow(0, new int[]{1, 0, 0, 0})
                .setRow(1, new int[]{0, 1, 0, 0})
                .setRow(2, new int[]{0, 0, 1, 0})
                .setRow(3, new int[]{0, 0, 0, 1})
                .build();


    }


    private ArrayBoard buildBoardByCol() {
        return new ArrayBoard.Builder(4).setCol(0, new int[]{1, 0, 0, 0})
                .setCol(1, new int[]{0, 1, 0, 0})
                .setCol(2, new int[]{0, 0, 1, 0})
                .setCol(3, new int[]{0, 0, 0, 1})
                .build();


    }

}
