package game.engine;

import game.immutable.Board;

import java.util.EnumSet;

/**
 * User: Jason Weng
 */
public interface NextMove {

    public EnumSet<Move> nextMove(Board board);

}
