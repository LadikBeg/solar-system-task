package a.level.Planets;

import a.level.SolarSystem.Planets;

public class SaturnClass implements Planets {
    public static double This_is_big_speed = 10.0;

    private String Name;
    private Double DistanceFromTheSun;
    private Double Weight;
    private Integer Radius;
    private Double SurfaceArea;
    private Integer CirculationPeriod;
    private String Satellites;
    private Double AccelerationOfGravity;

    public SaturnClass(String Name, Double DistanceFromTheSun, Double Weight, Integer Radius, Double SurfaceArea,
                       Integer CirculationPeriod, String Satellites, Double AccelerationOfGravity) {
        this.Name = Name;
        this.DistanceFromTheSun = DistanceFromTheSun;
        this.Weight =Weight;
        this.Radius = Radius;
        this.SurfaceArea = SurfaceArea;
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

    public Double getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        SurfaceArea = surfaceArea;
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
