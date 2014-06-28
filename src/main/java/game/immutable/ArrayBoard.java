package game.immutable;


import com.google.common.base.Preconditions;

/**
 * User: Jason Weng
 */
public class ArrayBoard implements  Board {


    private int[][] board;
    private int size;



    private ArrayBoard(Builder builder){
        this.size = builder.size;
        this.board = builder.board;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int[] getRow(int num) {
        return board[num];
    }

    @Override
    public int[] getCol(int num) {
        int[] colVal = new int[size];
        for(int i=0;i<size;i++){
            colVal[i] = board[i][num];
        }
        return colVal;
    }



    public static class Builder{

        private int[][] board;

        private int size;


        public  ArrayBoard build() {

            return new ArrayBoard(this);
        }

        public Builder(int size) {
           this.board = new int[size][size];
           this.size = size;
        }


        public Builder setRow(int row, int[] vals){
            Preconditions.checkArgument(vals.length == this.size, "vals do not have correct number of elements");

            for(int i=0;i<vals.length;i++){
                board[row][i]  =vals[i];
            }

            return this;
        }

        public Builder setCol(int col, int[] vals) {
            Preconditions.checkArgument(vals.length == this.size, "vals do not have correct number of elements");

            for(int i=0;i<vals.length;i++){
                board[i][col]  =vals[i];
            }

            return this;

        }


    }

}
