package a.level.Planets;

import a.level.SolarSystem.Planets;

public class UranusClass implements Planets {
    public static double This_is_big_speed = 10.0;

    private String Name;
    private Double DistanceFromTheSun;
    private Double Weight;
    private Integer Radius;
    private Integer CirculationPeriod;
    private Double SurfaceArea;
    private String Satellites;
    private Double AccelerationOfGravity;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getDistanceFromTheSun() {
        return DistanceFromTheSun;
    }

    public void setDistanceFromTheSun(Double distanceFromTheSun) {
        DistanceFromTheSun = distanceFromTheSun;
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

    public Integer getCirculationPeriod() {
        return CirculationPeriod;
    }

    public void setCirculationPeriod(Integer circulationPeriod) {
        CirculationPeriod = circulationPeriod;
    }

    public Double getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        SurfaceArea = surfaceArea;
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

    public UranusClass(String Name, Double DistanceFromTheSun, Double Weight, Integer Radius, Integer CirculationPeriod,
                       Double SurfaceArea, String Satellites, Double AccelerationOfGravity) {
        this.Name = Name;
        this.DistanceFromTheSun = DistanceFromTheSun;
        this.Weight = Weight;
        this.Radius = Radius;
        this.CirculationPeriod = CirculationPeriod;
        this.SurfaceArea = SurfaceArea;
        this.Satellites = Satellites;
        this.AccelerationOfGravity = AccelerationOfGravity;

    }
    public boolean isBigSpeed(){
        return this.AccelerationOfGravity > This_is_big_speed;
    }
}
