package a.level.Planets;

import a.level.SolarSystem.Planets;

public class JupiterClass implements Planets {
    public static double This_is_big_speed = 10.0;
    private String Name;
    private Double Weight;
    private Integer Radius;
    private Integer DistanceFromTheSun;
    private Integer CirculationPeriod;
    private String Satellites;
    private Double AccelerationOfGravity;

    public JupiterClass(String Name, Double Weight, Integer Radius, Integer DistanceFromTheSun, Integer CirculationPeriod,
                        String Satellites, Double AccelerationOfGravity) {
        this.Name = Name;
        this.Weight = Weight;
        this.Radius = Radius;
        this.DistanceFromTheSun = DistanceFromTheSun;
        this.CirculationPeriod = CirculationPeriod;
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

    public Integer getRadius() {
        return Radius;
    }

    public void setRadius(Integer radius) {
        Radius = radius;
    }

    public Integer getDistanceFromTheSun() {
        return DistanceFromTheSun;
    }

    public void setDistanceFromTheSun(Integer distanceFromTheSun) {
        DistanceFromTheSun = distanceFromTheSun;
    }

    public Integer getCirculationPeriod() {
        return CirculationPeriod;
    }

    public void setCirculationPeriod(Integer circulationPeriod) {
        CirculationPeriod = circulationPeriod;
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
