import java.util.*;
import java.security.*;

public class Chess{
    public static void main(String[] args){
        int[] horizontal = new int[8];
        int[] vertical = new int[8];
        
        final int INITIAL_ROW = 4;
        final int INITIAL_COLUMN = 0;
        
        int currentRow = INITIAL_ROW;
        int currentColumn = INITIAL_COLUMN;

        int movementCounter = 0;

        // Random random = new Random();
        SecureRandom random = new SecureRandom();
        
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
        
        // availableMovements = getAvailableMovements(board, currentRow, currentColumn, horizontal, vertical);
        // for(int i = 0; i < availableMovements.size(); i++)
        //     System.out.println(availableMovements.get(i));

        // set first position as visited
        board[currentRow][currentColumn] = true;
        for(int i = 0; i < 64; i++){
            availableMovements = getAvailableMovements(board, currentRow, currentColumn, horizontal, vertical);
            if(availableMovements.size() == 0){
                System.out.println("No movements available, max score: " + (i - 1));
                break;
            }
            int randomMovement = random.nextInt(availableMovements.size());
            int movement = availableMovements.get(randomMovement);
            System.out.println("Step: " + i);
            System.out.printf("Available movements: (Size: %d) ", availableMovements.size());
            for(int j = 0; j < availableMovements.size(); j++){
                System.out.printf(", %d", availableMovements.get(j));
            }
            System.out.println();
            System.out.println("Next movement value: " + movement);
            System.out.println("Location: X: " + currentRow + ", Y: " + currentColumn);
            System.out.println("Movement: " + movement + " -> X: " + horizontal[movement] + ", Y: " + vertical[movement]);
            currentRow += horizontal[movement];
            currentColumn += vertical[movement];
            board[currentRow][currentColumn] = true;
            availableMovements.clear();
            System.out.println();
        }

        // if(isInBounds(currentRow, currentColumn, rowMovement, columnMovement)){
        //     currentRow += vertical[movementCounter];
        //     currentColumn += horizontal[movementCounter];
        // }

    }

    public static boolean isInBounds(int row, int column){
        boolean isXInBounds = false;
        boolean isYInBounds = false;
        if(row > 0 && row < 8) isXInBounds = true;
        if(column > 0 && column < 8) isYInBounds = true;
        if(isXInBounds && isYInBounds) return true;
        return false;
    }

    public static List<Integer> getAvailableMovements(boolean[][] board, int currentRow, int currentColumn, int[] horizontal, int[] vertical){
        List<Integer> availableMovements = new ArrayList<Integer>();
        for(int i = 0; i < 8; i++){
            int rowMovement = currentRow + horizontal[i];
            int columnMovement = currentColumn + vertical[i];
            if(isInBounds(rowMovement, columnMovement))
                if(!board[rowMovement][columnMovement])
                    availableMovements.add(i);
        }
        return availableMovements;
    }

    /*
    public static int getMin(List<Integer> collection){
        int min = collection.get(0);
        for(int i = 1; i < collection.size(); i++){
            if(collection.get(i) < min) min = collection.get(i);
        }
        return min;
    }

    public static int getMax(List<Integer> collection){
        int max = collection.get(0);
        for(int i = 1; i < collection.size(); i++){
            if(collection.get(i) > max) max = collection.get(i);
        }
        return max;
    }
    */

}
