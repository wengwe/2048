package game.engine;

import game.immutable.Board;

import java.util.EnumSet;

/**
 * User: Jason Weng
 */
public class NextMoveEngine implements NextMove {


    private EnumSet<Move> moveEnumSet = EnumSet.noneOf(Move.class);

    enum Direction {
        BOTH,
        TO_BEGINING,
        TO_END,
        NONE;
    }

    @Override
    public EnumSet<Move> nextMove(Board board) {

        moveEnumSet.add(Move.DOWN_UP);
        return null;
    }


    private Direction getDirection(int[]  data){
        if(data[1] == Board.EMPTY_VAL ||data[2] == Board.EMPTY_VAL )  return Direction.BOTH ;

        if(data[0] == Board.EMPTY_VAL && data[3] == Board.EMPTY_VAL)  return Direction.BOTH;

        int first = Board.EMPTY_VAL;
        for(int val: data){
            if(val != Board.EMPTY_VAL) {
                if(val == first)  return Direction.BOTH;
                first = val;
            }
        }

        if(data[0] ==  Board.EMPTY_VAL) return Direction.TO_BEGINING;

        if(data[3]  == Board.EMPTY_VAL)   return Direction.TO_END;

        return Direction.NONE;

    }



}
