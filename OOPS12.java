public class OOPS12 {
    //Abstract -->interfaces 
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
     void moves();
}
class Queen implements ChessPlayer{
public void moves(){
         System.out.println("left,right,forward,back,diag");
 }
}
class Pawn implements ChessPlayer{
    public void moves(){
             System.out.println("one step forward");
     }
    }
    class Rook implements ChessPlayer{
        public void moves(){
                 System.out.println("vertical,horizontal");
         }
        }
        class King implements ChessPlayer{
            public void moves(){
                     System.out.println("one step in all directions");
             }
            }

