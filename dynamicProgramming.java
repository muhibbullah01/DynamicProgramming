import java.util.*;
import java.util.Vector;

public class MinNoOfPieces{
    int[] brokenPieces = {1,2,3,4,5,6,7,8};
    int k = 0;   //While loop initialization
    public MinNoOfPieces(int selectedPieces){
        Vector<Integer> brokenPieceList = new Vector<>();
        for(int i=brokenPieces.length - 1; i >= 0; i--){
            while(selectedPieces >= brokenPieces[i]){
                selectedPieces -= brokenPieces[i];
                brokenPieceList.add(brokenPieces[i]);
            }
        }
        while(k<brokenPieceList.size()){
            System.out.print("Slected broken pieces are: " +brokenPieceList.elementAt(k));
            k++;
        }
    }
    public static void main(String[] args){
        MinNoOfPieces obj = new MinNoOfPieces(14);
    }
}
