import java.util.*;

public class SoccerMatch{

	Date startTime;
	Date endTime;

	String venue;
	String home;
	String visitor;
	
	Player homePlayers[];
	Player visitorPlayers[];

	Goal homeGoals[];
	Goal visitorGoals[];

	int homePlayerCounter, visitPlayerCounter;
	int homeGoalCounter, visitGoalCounter;

	SoccerMatch(){

		startTime = endTime = null;
	
		venue = home = visitor = null;
	
		homePlayers = new Player[11];
	
		visitorPlayers = new Player[11];
	
		homeGoals = new Goal[10];
	
		visitorGoals = new Goal[10];
	
		homePlayerCounter = visitPlayerCounter = homeGoalCounter = visitGoalCounter = 0;
	
		for(int x = 0; x < 11; x++){
	
			homePlayers[x] = new Player();
	
			visitorPlayers[x] = new Player();
		}
	
		for(int x = 0; x < 10; x++){
	
			homeGoals[x] = new Goal();
	
			visitorGoals[x] = new Goal();
	
		}

	}

	SoccerMatch(Date st, Date en, String ven, String ho, String vi){
		this();

		startTime = st;
	
		endTime = en;
	
		venue = ven;
	
		home = ho;
	
		visitor = vi;
	
		}
	
		void addHomePlayer(Player p){
			homePlayers[homePlayerCounter++] = p;
		}
	
		void addVisitorPlayer(Player p){
			visitorPlayers[visitPlayerCounter++] = p;
		}
	
		void addHomeGoal(Goal g){
			homeGoals[homeGoalCounter++] = g;
		}
	
		void addVisitorGoal(Goal g){
			visitorGoals[visitGoalCounter++] = g;
		}
	
		int [] getHomeGoals(){
			int goals[] = new int[10];
			
			for(int x = 0; x < 10; x++)
				goals[x] = homeGoals[x].getPlayer().getGoals();
			return goals;
		}
	
		int [] getVisitorGoals(){
			int goals[] = new int[10];
			
			for(int x = 0; x < 10; x++)
				goals[x] = visitorGoals[x].getPlayer().getGoals();
			return goals;
		}
	
		String getWinner(){
			String winStatus = "";
			int homeGoals[] = getHomeGoals();
			int visitGoals[] = getVisitorGoals();
			int totHome = 0, totVisit = 0;
	
			for(int x = 0; x < 10; x++){
				totHome += homeGoals[x];
				totVisit += visitGoals[x];
			}
			winStatus = "\n Home Team Total Goals: " + totHome + "\n Visitor Team Total Goals: " + totVisit;
			if(totHome > totVisit)
				winStatus += "\n Winner: Home Team";
				else if(totVisit > totHome)
					winStatus += "\n Winner: Visitor Team";
				else
					winStatus += "\n Tie";
			return winStatus;
		}
	
		public static void main(String[] args){
			Random rand = new Random();
			@SuppressWarnings("deprecation")
			Date d1 = new Date(2018, 11, 12, 10, 12, 30);
			@SuppressWarnings("deprecation")
			Date d2 = new Date(2018, 11, 12, 12, 40, 30);
		
			SoccerMatch sm = new SoccerMatch(d1, d2, "Red Foxes", "Avengers", "Justice League");
			String homePlayerName [] = {"Captain America", "Hulk", "War Machine", "Iron Man", "Spider-Man", "Black Panther", "Thor", "Groot", "Rocket", "Hawkeye", "Doctor Strange"};
		
			String visitPlayerName [] = {"Batman", "Superman", "Flash", "Green Lantern", "Green Arrow", "Aquaman", "Black Canary", "Wonder Woman", "Cyborg", "Martian Manhunter", "Shazam"};
			
			for(int x = 0; x < 11; x++){
				sm.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Avengers"));
				sm.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Justice League"));
			}
			
			for(int x = 0; x < 10; x++){
				sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[x]));
				sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[x]));
			}
			
			System.out.print("\n\n*************************** Home Team Players *************************** ");
			for(int x = 0; x < 11; x++)
				System.out.println(sm.homePlayers[x]);
				System.out.print("\n\n*************************** Visiting Team Players *************************** ");
				
			for(int x = 0; x < 11; x++)
				System.out.println(sm.visitorPlayers[x]);
				System.out.print("\n\n*************************** Home Team Goals *************************** ");
				
			for(int x = 0; x < 10; x++)
				System.out.println(sm.homeGoals[x]);
				System.out.print("\n\n*************************** Visiting Team Goals *************************** ");
				
			for(int x = 0; x < 10; x++)
				System.out.println(sm.visitorGoals[x]);
				System.out.print("\n\n*************************** GAME STATUS *************************** ");
				System.out.println(sm.getWinner());
	}
}