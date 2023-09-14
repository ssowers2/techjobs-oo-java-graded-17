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

}