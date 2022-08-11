import java.util.*;

public class Chess{
    public static void main(String[] args){
        int[] horizontal = new int[8];
        int[] vertical = new int[8];
        
        int INITIAL_ROW = 0;
        int INITIAL_COLUMN = 0;
        
        int currentRow = INITIAL_ROW;
        int currentColumn = INITIAL_COLUMN;

        int movementCounter = 0;

        Random rand = new Random();
        
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
        boolean[][] board = new boolean[8][8];

        System.out.println("Current position (x, y): " + currentRow + ", " + currentColumn);
        System.out.println();
        
        List<Integer> availableMovements = new ArrayList<Integer>();
        availableMovements = getAvailableMovements(board, currentRow, currentColumn, horizontal, vertical);
        
        for(int i = 0; i < availableMovements.size(); i++)
            System.out.println(availableMovements.get(i));

        // if(isInBounds(currentRow, currentColumn, rowMovement, columnMovement)){
        //     currentRow += vertical[movementCounter];
        //     currentColumn += horizontal[movementCounter];
        // }

    }

    public static boolean isInBounds(int currentRow, int currentColumn, int rowMovement, int columnMovement){
        boolean isXInBounds = false;
        boolean isYInBounds = false;
        int rowNextMovement = currentRow + rowMovement;
        int columnNextMovement = currentColumn + columnMovement;
        if(rowNextMovement > 0 && rowNextMovement < 8) isXInBounds = true;
        if(columnNextMovement > 0 && columnNextMovement < 8) isYInBounds = true;
        if(isXInBounds && isYInBounds) return true;
        return false;
    }

    public static List<Integer> getAvailableMovements(boolean[][] board, int currentRow, int currentColumn, int[] horizontal, int[] vertical){
        List<Integer> availableMovements = new ArrayList<Integer>();
        for(int i = 0; i < 8; i++){
            int rowMovement = currentRow + vertical[i];
            int columnMovement = currentColumn +  horizontal[i];
            if(isInBounds(currentRow, currentColumn, rowMovement, columnMovement))
                if(!board[rowMovement][columnMovement])
                    availableMovements.add(i);
        }
        return availableMovements;
    }

}
