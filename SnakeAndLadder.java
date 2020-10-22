class Player{
        int position=0;
        int dieRoll=0;

        public int roll(){

        int dieNumber= (int)((Math.random()*10)%6+1);
        System.out.println(dieNumber);
        dieRoll++;
	System.out.println("number of die rolled" +dieRoll);
        switch (option())
        {
                case 0:
                        System.out.println("No Play, Current Position: " + position);
                        return 0;
                case 1:
                                //Ensuring exact winning position
                        if(position+dieNumber>100)
                         {
                                System.out.println("Ladder (Player exceeded 100), Current Position: " + position + ", Die Rolled: " + dieNumber);
                                return dieNumber;
                        }
                        System.out.println("Ladder, Initial Position: " + position + ", Die Rolled: " + dieNumber + ", Final Position: " + (position + dieNumber));
                        position+=dieNumber;
                        return dieNumber;
                default:
                        if(position-dieNumber<0)
                        {
                                System.out.println("Snake (Player slumped below 0), Current Position: " + position + ", Die Rolled: " + dieNumber + ", Final Position: " + 0);
                                position=0;
                                  return -dieNumber;
                        }
                        System.out.println("Snake, Initial Position: " + position + ", Die Rolled: " + dieNumber + ", Final Position: " + (position - dieNumber));
                        position-=dieNumber;
                        return -dieNumber;
        }
        }
        public int option(){
        int action=(int)((Math.random()*10)%3);
        return action;
        }
}
public class SnakeAndLadder{
        public static void main(String[] args){
        Player p=new Player();
        p.roll();
        p.option();
        while(p.position!=100){
        int dieRoll = -1;
        dieRoll = p.roll();
        if(dieRoll > 0){
        if(p.position == 100)
          break;
        p.roll();
        }
        }
	//System.out.println("number of times die rolled" +dieRoll);
        if(p.position==100)
        System.out.println("\nPlayerwins");
	
}
}
