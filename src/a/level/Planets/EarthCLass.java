package a.level.Planets;

import a.level.SolarSystem.Planets;

public class EarthCLass implements Planets {
    public static double This_is_big_speed = 10.0;

    private String Name;
    private Double Weight;
    private Double Population;
    private String DayLength;
    private String Satellites;
    private Double AccelerationOfGravity;
    private Integer LandArea;
    private Integer WaterArea;


    public EarthCLass(String Name, Double Weight,Double Population,Integer LandArea,Integer WaterArea,
                       String DayLength, String Satellites, Double AccelerationOfGravity) {
        this.Name = Name;
        this.Weight = Weight;
        this.Population = Population;
        this.DayLength = DayLength;
        this.LandArea = LandArea;
        this.WaterArea = WaterArea;
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

    public Double getPopulation() {
        return Population;
    }

    public void setPopulation(Double population) {
        Population = population;
    }

    public String getDayLength() {
        return DayLength;
    }

    public void setDayLength(String dayLength) {
        DayLength = dayLength;
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

    public Integer getLandArea() {
        return LandArea;
    }

    public void setLandArea(Integer landArea) {
        LandArea = landArea;
    }

    public Integer getWaterArea() {
        return WaterArea;
    }

    public void setWaterArea(Integer waterArea) {
        WaterArea = waterArea;
    }
    public boolean isBigSpeed(){
        return this.AccelerationOfGravity > This_is_big_speed;
    }
}
