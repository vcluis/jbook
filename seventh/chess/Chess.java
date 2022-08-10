import java.util.*;

public class Chess{
    public static void main(String[] args){
        int horizontal = new int[8];
        int vertical = new int[8];
        
        int currentRow = 0;
        int currentColumn = 0;

        int movementCounter = 0;
        
        horizontal[0] = 2;
        horizontal[1] = 1;
        horizontal[2] = -1;
        horizontal[3] = -2;
        horizontal[4] = -2;
        horizontal[5] = -1;
        horizontal[6] = 1;
        horizontal[7] = 2;

        vertical[0] = -1;
        vertical[1] = -2;
        vertical[2] = -2;
        vertical[3] = -1;
        vertical[4] = 1;
        vertical[5] = 2;
        vertical[6] = 2;
        vertical[7] = 1;

        // board
        boolean[] board = new boolean[8][8];

        if(!isOutOfBounds(currentRow, currentColumn, rowMovement, columnMovement)){
            currentRow += vertical[movementCounter];
            currentColumn += horizontal[movementCounter];
        }

        System.out.println(currentRow + ", " + currentColumn);
    }

    public static void IsOutOfBounds(int currentRow, int currentColumn, int rowMovement, int columnMovement){
        boolean isXOutOfBounds = false;
        boolean isYOutOfBounds = false;
        if((currentRow + rowMovement) > 0 && (currentRow + rowMovement) < 8) isXOutOfBounds = true;
        if((currentColumn + columnMovement) > 0 && (currentColumn + columnMovement) < 8) isYOutOfBounds = true;
        if(isXOutOfBounds || isYOutOfBounds) return true;
        return false;
    }

    public static List<Integer> getAvailableMovements(boolean[][] board, int currentRow, int currentColumn, int[] horizontal, int[] vertical){
        List<Integer> availableMovements = new ArrayList<Integer>();
        for(int i = 0; i < 8; i++){
            currentRow += vertical[i];
            currentColumn += horizontal[i];
            if(!board[currentRow][currentColumn])
                availableMovements.add(i);
        }
        return availableMovements;
    }

}
