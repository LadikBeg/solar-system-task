package a.level.Planets;

import a.level.SolarSystem.Planets;

public class MercuryClass implements Planets {
    public static double This_is_big_speed = 10.0;

    private String Name;
    private Double Weight;
    private Integer CirculationPeriod;
    private Double Radius;
    private String DayDuration;
    private String Satellites;
    private Double AccelerationOfGravity;



    public MercuryClass(String Name, Double Weight, Integer CirculationPeriod, Double Radius,
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

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public Integer getCirculationPeriod() {
        return CirculationPeriod;
    }

    public void setCirculationPeriod(Integer circulationPeriod) {
        CirculationPeriod = circulationPeriod;
    }

    public Double getRadius() {
        return Radius;
    }

    public void setRadius(Double radius) {
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
