package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest {


    @Before
    public void setUp() throws Exception {
        System.out.println("Starting test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Cleaning up test");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void eventAllNullTest() throws Exception {
        System.out.println("Testing when everything is null");

        Event testAllNull = new Event();
        thrown.expect(IllegalArgumentException.class);
        EventLog events = new EventLog();
        events.addEvent(testAllNull);
    }

    @Test
    public void eventNameNullTest() throws Exception {
        System.out.println("Testing when just name is null");

        Event testNameNull = new Event();
        testNameNull.setName("Name");
        EventLog events = new EventLog();
        thrown.expect(IllegalArgumentException.class);

        events.addEvent(testNameNull);
    }

    @Test
    public void eventActionNulllTest() throws Exception {
        System.out.println("Testing when just action is null");

        Event testActionNull = new Event();
        testActionNull.setAction("Test Action");
        EventLog events = new EventLog();
        thrown.expect(IllegalArgumentException.class);

        events.addEvent(testActionNull);
    }

    @Test
    public void eventIncorrectActionTests() throws Exception {
        System.out.println("Testing when name and action are there but action is not a valid action");

        Event testAllGood = new Event();
        testAllGood.setName("Tests Name");
        testAllGood.setAction("Test Action");
        EventLog events = new EventLog();
        thrown.expect(IllegalArgumentException.class);

        events.addEvent(testAllGood);
    }

    @Test
    public void goodEventTestFace2Face() throws Exception {
        System.out.println("Testing when name and action are there and action is a valid action");

        Event testAllGood = new Event();
        testAllGood.setName("Tests Name");
        testAllGood.setAction("Face2Face");
        EventLog events = new EventLog();

        assertTrue(events.addEvent(testAllGood));
    }

    @Test
    public void goodEventTestPhone() throws Exception {
        System.out.println("Testing when name and action are there and action is a valid action");

        Event testAllGood = new Event();
        testAllGood.setName("Tests Name");
        testAllGood.setAction("PhoneCall");
        EventLog events = new EventLog();

        assertTrue(events.addEvent(testAllGood));
    }

    @Test
    public void goodEventTestText() throws Exception {
        System.out.println("Testing when name and action are there and action is a valid action");

        Event testAllGood = new Event();
        testAllGood.setName("Tests Name");
        testAllGood.setAction("TextMessaging");
        EventLog events = new EventLog();

        assertTrue(events.addEvent(testAllGood));
    }

    @Test
    public void goodEventTestUnknown() throws Exception {
        System.out.println("Testing when name and action are there and action is a valid action");

        Event testAllGood = new Event();
        testAllGood.setName("Tests Name");
        testAllGood.setAction("Unknown");
        EventLog events = new EventLog();

        assertTrue(events.addEvent(testAllGood));
    }
}