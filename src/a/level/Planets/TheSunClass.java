package a.level.Planets;

import a.level.SolarSystem.Planets;

public class TheSunClass implements Planets {

    public static double This_is_big_speed = 10.0;

    private String Name;
    private String Weight;
    private Integer CirculationPeriod;
    private Integer Radius;
    private String DayDuration;
    private String Satellites;
    private Double AccelerationOfGravity;



    public TheSunClass(String Name, String Weight, Integer CirculationPeriod, Integer Radius,
                       String DayDuration, String Satellites, Double AccelerationOfGravity) {
        this.Name = Name;
        this.Weight = Weight;
        this.CirculationPeriod = CirculationPeriod;
        this.Radius = Radius;
        this.DayDuration = DayDuration;
        this.Satellites = Satellites;
        this.AccelerationOfGravity = AccelerationOfGravity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public Integer getCirculationPeriod() {
        return CirculationPeriod;
    }

    public void setCirculationPeriod(Integer circulationPeriod) {
        CirculationPeriod = circulationPeriod;
    }

    public Integer getRadius() {
        return Radius;
    }

    public void setRadius(Integer radius) {
        Radius = radius;
    }

    public String getDayDuration() {
        return DayDuration;
    }

    public void setDayDuration(String dayDuration) {
        DayDuration = dayDuration;
    }

    public String getSatellites() {
        return Satellites;
    }

    public void setSatellites(String satellites) {
        Satellites = satellites;
    }

    public Double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }

    public void setAccelerationOfGravity(Double accelerationOfGravity) {
        AccelerationOfGravity = accelerationOfGravity;
    }

    public boolean isBigSpeed(){
        return this.AccelerationOfGravity > This_is_big_speed;
    }
}


