public class interfac {

    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

        bear b=new bear();
        b.carn();
        b.herb();

    }

}


interface Herbivore{
    void herb();
}


interface Carnivore{
 void carn();
}

class bear implements Herbivore, Carnivore{
    public void herb(){
        System.out.println("is a herbivore");
    }

    public void carn(){
        System.out.println("is a carnivore");
    }
   
}


interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down , left , right , diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up ,down , left , right");
    }
}