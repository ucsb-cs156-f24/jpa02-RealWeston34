package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toSrting_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void test_equals_returns_correct_bool() {
        Team other1 = new Team("test-team");
        Team other2 = new Team("test-team");
        Team other3 = new Team("incorrect");
        Team other4 = new Team("incorrect");

        other2.addMember("test");
        other4.addMember("test");

        assert(team.equals(other1));
        assert(!team.equals(other2));
        assert(!team.equals(other3));
        assert(!team.equals(other4));
    }

    @Test
    public void test_hash_returns_correct_code() {
        // instantiate t as a Team object
        Team t = new Team("test");
        int result = t.hashCode();
        int expectedResult = 3556499;
        assertEquals(expectedResult, result);
    
    }
}
