package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // You may use just the name that is used on <https://bit.ly/cs156-f24-teams>
        // i.e. your first name, or your first and initial of last name

        return "Scott";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "RealWeston34";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f24-01");
        team.addMember("Junhyung");
        team.addMember("Vincent");
        team.addMember("Viraj");
        team.addMember("Raymond");
        team.addMember("Cameron");
        team.addMember("Scott");
        return team;
    }
}
