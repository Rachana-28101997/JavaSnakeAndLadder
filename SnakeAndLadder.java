class Player{
	int position=0;
        public int roll(){
        int dieNumber=(int)((Math.random()*10)%6+1);
        System.out.println(dieNumber);
	return 0;
        }
}
public class SnakeAndLadder{
        public static void main(String[] args){
        Player p=new Player();
        p.roll();
        }
}
