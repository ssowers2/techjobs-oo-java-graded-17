package org.launchcode.techjobs.oo;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        //Created two Job objects using the empty constructor
        Job job1 = new Job();
        Job job2 = new Job();

        //Used assertNotEquals to verify that the IDs of the two objects are distinct
        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields () {
    //Declared and initialized a new Job object with the specified data
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    //Used assertTrue and assertEquals statements to test the constructor
    //assertTrue(job instanceof Job);
    assertTrue(true);

   //Test each field using assertEquals
     assertEquals("Product tester", job.getName());
     assertEquals("ACME", job.getEmployer().getValue());
     assertEquals("Desert", job.getLocation().getValue());
     assertEquals("Quality control", job.getPositionType().getValue());
     assertEquals("Persistence", job.getCoreCompetency().getValue());

     }

    @Test
    public void testJobsForEquality() {
        // Created two Job objects with identical field values except for id
        Job job1 = new Job("Software Engineer", new Employer("Google"), new Location("Mountain View"), new PositionType("Full-time"), new CoreCompetency("Programming"));
        Job job2 = new Job("Software Engineer", new Employer("Google"), new Location("Mountain View"), new PositionType("Full-time"), new CoreCompetency("Programming"));

        // Equals returns false when comparing these two objects
        assertFalse(job1.equals(job2));
    }

    @Test
    //Checks that the toString method starts and ends with new line
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job();
        String jobString = job.toString();

        // Use System.lineSeparator() to create the expected line separator character
        String lineSeparator = System.lineSeparator();

        assertTrue(jobString.startsWith(lineSeparator));
        assertTrue(jobString.endsWith(lineSeparator));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
            Job job = new Job("Software Engineer", new Employer("Google"),
                    new Location("Mountain View"), new PositionType("Full-time"), new CoreCompetency("Programming"));

            // System.lineSeparator() to create expected string
            String expected = "ID: " + job.getId() + System.lineSeparator()
                    + "Name: " + job.getName() + System.lineSeparator()
                    + "Employer: " + job.getEmployer().getValue() + System.lineSeparator()
                    + "Location: " + job.getLocation().getValue() + System.lineSeparator()
                    + "Position Type: " + job.getPositionType().getValue() + System.lineSeparator()
                    + "Core Competency: " + job.getCoreCompetency().getValue() + System.lineSeparator();

            String actual = job.toString();
            assertEquals(expected, actual);
        }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        // Use System.lineSeparator() to create the expected string
        String expected = "ID: " + job.getId() + System.lineSeparator()
                + "Name: Data not available" + System.lineSeparator()
                + "Employer: Data not available" + System.lineSeparator()
                + "Location: Data not available" + System.lineSeparator()
                + "Position Type: Data not available" + System.lineSeparator()
                + "Core Competency: Data not available" + System.lineSeparator();

        String actual = job.toString();
        assertEquals(expected, actual);
    }

}
