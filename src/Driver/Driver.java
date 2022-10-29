package Driver;

import Transport.Passenger;

public abstract class Driver {
    private String fullName;
    private String license;
    private String experience;

    public abstract void startMoving();
    public abstract void stop();
    public abstract void refill();


    public Driver(String fullName, String license, String experience) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLicense() {
        return license;
    }

    public String getExperience() {
        return experience;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
