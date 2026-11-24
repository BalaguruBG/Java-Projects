import java.util.Random;
import java.util.Scanner;

abstract class Player{
	String name;
	int choice;
	
	abstract void move();
}
class Human extends Player{
	Human(String name){
		this.name=name;
	}
	public void move(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 || 2 || 3 ");
		choice = sc.nextInt();
	}
}
class AI extends Player{
	AI(String name){
		this.name=name;
	}
	public void move(){
		Random ran = new Random();
		choice=ran.nextInt(3)+1;
		
	}
}
public class Game {
	public static void main(String[] args){
		System.out.println("================Rock Papper Scissors===============");
		Human p1= new Human("Bala");
		AI p2 = new AI("Chiitti");
		boolean flag = true;
		
		int userScore=0;
		int computerScore=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1,Rock\n2,Papper,\n3,Scissor\n4,Exit");
		RockPapperScissor game = new RockPapperScissor();
		
		while(flag) {
			System.out.print("Enter Your Choice ");
			int input = sc.nextInt();
			
			if(input==4) {
				flag = false;
				break;
			}
			p1.choice=input;
			p2.move();
			System.out.println(p1.name+" choose "+ game.getChoiceName(p1.choice));
			System.out.println(p2.name+" choose "+ game.getChoiceName(p2.choice));

			int winner = game.choice(p1.choice,p2.choice);
			if(winner ==1) {
				userScore++;
			}
			else if(winner ==2) {
				computerScore++;
			}
			System.out.println("Score: "+p1.name+" = " +userScore +" | "+p2.name +" = "+ computerScore);
		}
        System.out.println("\n================ GAME OVER ================");
        System.out.println(p1.name + " Score : " + userScore);
        System.out.println(p2.name + " Score : " + computerScore);

        if (userScore > computerScore) {
            System.out.println(p1.name + " Wins the Game...!");
        }
        else if (computerScore > userScore) {
            System.out.println(p2.name + " Wins the Game...!");
        }
        else {
            System.out.println("Game Draw...!");
        }

        System.out.println("============================================");

	}
}
