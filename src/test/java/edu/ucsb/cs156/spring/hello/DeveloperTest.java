package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Scott", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_id() {
        assertEquals("RealWeston34", Developer.getGithubId());
    }
    @Test
    public void getTeam_returns_correct_team_with_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("f24-01", t.getName());
        assertTrue(t.getMembers().contains("Cameron"),"Team should contain Cameron");
        assertTrue(t.getMembers().contains("Raymond"),"Team should contain Raymond");
        assertTrue(t.getMembers().contains("Viraj"),"Team should contain Viraj");
        assertTrue(t.getMembers().contains("Vincent"),"Team should contain Vincent");
        assertTrue(t.getMembers().contains("Junhyung"),"Team should contain Junhyung");
        assertTrue(t.getMembers().contains("Scott"),"Team should contain Scott");
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
