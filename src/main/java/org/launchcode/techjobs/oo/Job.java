package org.launchcode.techjobs.oo;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() { //Constructor #1
        id = nextId;
        nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType,
                CoreCompetency coreCompetency) {  //Constructor #2
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override //9.8.23
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override //9.8.23
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {//9.8.23 Lines 54 - 95
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String idString = "ID: " + id + System.lineSeparator();
        String nameString = "Name: " + (name != null && !name.isEmpty() ? name : "Data not available") + System.lineSeparator();
        String employerString = "Employer: " + (employer != null && !employer.getValue().isEmpty() ? employer.getValue() : "Data not available") + System.lineSeparator();
        String locationString = "Location: " + (location != null && !location.getValue().isEmpty() ? location.getValue() : "Data not available") + System.lineSeparator();
        String positionTypeString = "Position Type: " + (positionType != null && !positionType.getValue().isEmpty() ? positionType.getValue() : "Data not available") + System.lineSeparator();
        String coreCompetencyString = "Core Competency: " + (coreCompetency != null && !coreCompetency.getValue().isEmpty() ? coreCompetency.getValue() : "Data not available") + System.lineSeparator();

        return idString + nameString + employerString + locationString + positionTypeString + coreCompetencyString + System.lineSeparator();
    }

}
