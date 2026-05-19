import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class MissionControl {

    public static void main(String[] args) {
       SecretAgent agent = new SecretAgent("007", "James Bond", 5);

       System.out.println("AGENT STATUS");
       System.out.println("Code: " + agent.getAgentCode());
       System.out.println("Name: " + agent.getName());
       System.out.println("Clearance Level: " + agent.getClearanceLevel());
       System.out.println("On Mission: " + agent.isOnMission());
        System.out.println();

        Mission mission = new Mission();

        mission.displayMissionBriefing();   
        System.out.println();

        if(agent.getClearanceLevel() >= mission.getDifficulty()) {
            agent.setOnMission(true);
            System.out.println("Agent " + agent.getAgentCode() + " is cleared for the mission");
        } else {
            System.out.println("Agent " + agent.getAgentCode() + " 's clearance is too low for this mission");
           return; 
        }

        System.out.println("\n UPDATE AGENT STATUS");
        System.out.println("On Mission: " + agent.isOnMission());

        System.out.println("\n(Time passes... mission in progress...)");

        agent.completeMission();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println("\n FINAL AGENT STATUS");
       
        System.out.println("On Mission: " + agent.isOnMission());
        System.out.println("Last Mission Completion: " + agent.getLastMissionCompletionTime().format(formatter));
    } 
}