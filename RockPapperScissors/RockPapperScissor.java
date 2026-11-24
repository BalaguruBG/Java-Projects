
public class RockPapperScissor {
	public int choice(int user,int computer) {
		if(user==1 &&computer==1) {
			System.out.println("\t\t\tDraw Try Again...!");
			return 0;
		}
		else if(user==2 &&computer==2) {
			System.out.println("\t\t\tDraw Try Again...!");
			return 0;
		}	
		else if(user==3 &&computer==3) {
			System.out.println("\t\t\tDraw Try Again...!");
			return 0;
		}	
		else if(user==1 &&computer==2) {
			System.out.println("\t\t\tPaper Defended Rock");
			return 2;
		}	
		else if(user==1 &&computer==3) {
			System.out.println("\t\t\t Rock Smashed The Scissor");
			return 1;
		}	
		else if(user==2 &&computer==1) {
			System.out.println("\t\t\t Paper Defended Rock");
			return 1;
		}	
		else if(user==2 &&computer==3) {
			System.out.println("\t\t\t Scissor Sliced The Paper..!");
			return 1;
		}
		else if (user == 3 && computer == 1) {
            System.out.println("\t\t\tRock Smashed The Scissor");
            return 2;
        }
        else if (user == 3 && computer == 2) {
            System.out.println("\t\t\tScissor Sliced The Paper..!");
            return 1;
        }
		return 0;
	}
	 public String getChoiceName(int choice) {

	        if (choice == 1) {
	            return "Rock";
	        }
	        else if (choice == 2) {
	            return "Paper";
	        }
	        else if (choice == 3) {
	            return "Scissor";
	        }

	        return "Invalid";
	    }
}
