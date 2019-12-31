package a.level.Planets;

import a.level.SolarSystem.Planets;

public class MarsClass implements Planets {
    public static double This_is_big_speed = 10.0;

    private String Name;
    private String Weight;
    private Double OrbitalSpeed;
    private String SurfaceArea;
    private String DayDuration;
    private String Satellites;
    private Double OrbitalEccentricity;
    private String Temperature;
    private Double AccelerationOfGravity;


    public MarsClass(String Name,String Weight,Double OrbitalSpeed,String SurfaceArea,String DayDuration,String Satellites,
                     Double OrbitalEccentricity,String Temperature,Double AccelerationOfGravity) {
        this.Name = Name;
        this.Weight = Weight;
        this.OrbitalSpeed = OrbitalSpeed;
        this.SurfaceArea = SurfaceArea;
        this.DayDuration = DayDuration;
        this.Satellites = Satellites;
        this.OrbitalEccentricity = OrbitalEccentricity;
        this.Temperature = Temperature;
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

    public Double getOrbitalSpeed() {
        return OrbitalSpeed;
    }

    public void setOrbitalSpeed(Double orbitalSpeed) {
        OrbitalSpeed = orbitalSpeed;
    }

    public String getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        SurfaceArea = surfaceArea;
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

    public Double getOrbitalEccentricity() {
        return OrbitalEccentricity;
    }

    public void setOrbitalEccentricity(Double orbitalEccentricity) {
        OrbitalEccentricity = orbitalEccentricity;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
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
