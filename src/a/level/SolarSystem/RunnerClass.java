package a.level.SolarSystem;

import a.level.Planets.*;

import java.util.Scanner;


public class RunnerClass extends SolarSystemClass {
    public static void main(String[] args) {
        SolarSystemClass Info = new SolarSystemClass();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome ");
        System.out.println("Solar System - ");
        Info.Information();

        TheSunClass Sun = new TheSunClass("The Sun", "1,9885⋅10^30", 85, 695510, "----",
                "???", 7274.0);
        MercuryClass Mercury = new MercuryClass("Mercury", 3.285E23, 88, 2439.7, "58 days 15 hours 30 min",
                "Nope", 3.7);
        VenusClass Venus = new VenusClass("Venus", 4.867E24, 225, 6051.8, "116 days 18 hours",
                "Nope", 8.87);
        EarthCLass Earth = new EarthCLass("Earth", 5.972E24, 7.53, 148940000, 361132000,
                "24 hours", "Moon", 9.780327);
        MarsClass Mars = new MarsClass("Mars", "6,4171⋅10^23", 24.13, " 1,4437⋅10^8",
                "1 day 0 hours 37 min", "Nope", 0.0933941, "от −153 °C до +35 °C", 3.711);
        JupiterClass Jupiter = new JupiterClass("Jupiter", 1.898E27, 69911, 778500000,
                12, "Europe, Ganymede, Io, Callisto, Valletudo, Amalthea", 24.79);
        SaturnClass Saturn = new SaturnClass("Saturn", 1.434E9, 5.683E26, 58232, 4.27E10,
                29, "Titanium, Enceladus, Mimas, Tefiya, Dion, Iapetus, Phoebe", 10.44);
        UranusClass Uranus = new UranusClass("Uranus", 2.871E9, 8.681E25, 25362,
                84, 8.083E9, "Umbriel, Oberon, Titania, Pak, Desdemona", 8.87);
        NeptuneClass Neptune = new NeptuneClass("Neptune", 4.495E9, 1.024E26, 24622,
                165, 7.618E9, "Triton, Thalassa, Naiad, Hippocampus, Proteus, Despina",
                11.15);


        System.out.println("Выберите планету или звезду - ");
        System.out.println("1: " + Sun.getName());
        System.out.println("2: " + Mercury.getName());
        System.out.println("3: " + Venus.getName());
        System.out.println("4: " + Earth.getName());
        System.out.println("5: " + Mars.getName());
        System.out.println("6: " + Jupiter.getName());
        System.out.println("7: " + Saturn.getName());
        System.out.println("8: " + Uranus.getName());
        System.out.println("9: " + Neptune.getName());



        System.out.print("Ваш выбор (1-9): ");
        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("Название: " + Sun.getName());
            System.out.println("Масса: " + Sun.getWeight() + " кг");
            System.out.println("Период обращения: " + Sun.getCirculationPeriod() + " days");
            System.out.println("Радиус: " + Sun.getRadius() + " км");
            System.out.println("Спутники: " + Sun.getSatellites());
            System.out.println("Ускорение свободного падения: " + Sun.getAccelerationOfGravity() + "м/с^2");
            System.out.println("Большая скорость: " + Sun.isBigSpeed());
        } else if (number == 2) {
            System.out.println("Название: " + Mercury.getName());
            System.out.println("Масса: " + Mercury.getWeight() + " кг");
            System.out.println("Период обращения: " + Mercury.getCirculationPeriod() + " days");
            System.out.println("Радиус: " + Mercury.getRadius() + " км");
            System.out.println("Продолжительность дня: " + Mercury.getDayDuration());
            System.out.println("Спутники: " + Mercury.getSatellites());
            System.out.println("Ускорение свободного падения: " + Mercury.getAccelerationOfGravity() + "м/с^2");
            System.out.println("Большая скорость: " + Mercury.isBigSpeed());
        } else if (number == 3) {
            System.out.println("Название: " + Venus.getName());
            System.out.println("Масса: " + Venus.getWeight() + " кг");
            System.out.println("Период обращения: " + Venus.getCirculationPeriod() + " days");
            System.out.println("Радиус: " + Venus.getRadius() + " km");
            System.out.println("Продолжительность дня: " + Venus.getDayDuration());
            System.out.println("Спутники: " + Venus.getSatellites());
            System.out.println("Ускорение свободного падения: " + Venus.getAccelerationOfGravity() + "м/с^2");
            System.out.println("Большая скорость: " + Venus.isBigSpeed());
        } else if (number == 4) {
            System.out.println("Название: " + Earth.getName());
            System.out.println("Масса: " + Earth.getWeight() + " кг");
            System.out.println("Население: " + Earth.getPopulation());
            System.out.println("Продолжительность дня: " + Earth.getDayLength());
            System.out.println("Спутники: " + Earth.getSatellites());
            System.out.println("Площадь суши: " + Earth.getLandArea() + " км²");
            System.out.println("Площадь воды: " + Earth.getWaterArea() + " км²");
            System.out.println("Ускорение свободного падения: " + Earth.getAccelerationOfGravity());
            System.out.println("Большая скорость: " + Earth.isBigSpeed());
        } else if (number == 5) {
            System.out.println("Название: " + Mars.getName());
            System.out.println("Масса: " + Mars.getWeight() + " кг");
            System.out.println("Орбитальная скорость: " + Mars.getOrbitalSpeed());
            System.out.println("Площадь поверхности: " + Mars.getSurfaceArea() + " км²");
            System.out.println("Продолжительность дня: " + Mars.getDayDuration());
            System.out.println("Спутники: " + Mars.getSatellites());
            System.out.println("Эксцентриситет орбиты: " + Mars.getOrbitalEccentricity());
            System.out.println("Температура: " + Mars.getTemperature());
            System.out.println("Ускорение свободного падения: " + Mars.getAccelerationOfGravity() + "м/с²");
            System.out.println("Большая скорость: " + Mars.isBigSpeed());
        } else if (number == 6) {
            System.out.println("Название: " + Jupiter.getName());
            System.out.println("Масса: " + Jupiter.getWeight() + " кг");
            System.out.println("Радиус: " + Jupiter.getRadius() + " км");
            System.out.println("Расстояние от Солнца: " + Jupiter.getDistanceFromTheSun());
            System.out.println("Период обращения: " + Jupiter.getCirculationPeriod() + " days");
            System.out.println("Спутники: " + Jupiter.getSatellites());
            System.out.println("Ускорение свободного падения: " + Jupiter.getAccelerationOfGravity() + "м/с²");
            System.out.println("Большая скорость: " + Jupiter.isBigSpeed());
        } else if (number == 7) {
            System.out.println("Название: " + Saturn.getName());
            System.out.println("Масса: " + Saturn.getWeight() + " кг");
            System.out.println("Радиус: " + Saturn.getRadius() + " км");
            System.out.println("Расстояние от Солнца: " + Saturn.getDistanceFromTheSun());
            System.out.println("Площадь поверхности: " + Saturn.getSurfaceArea() + " км²");
            System.out.println("Период обращения: " + Saturn.getCirculationPeriod() + " days");
            System.out.println("Спутники: " + Saturn.getSatellites());
            System.out.println("Ускорение свободного падения: " + Saturn.getAccelerationOfGravity() + "м/с²");
            System.out.println("Большая скорость: " + Saturn.isBigSpeed());
        } else if (number == 8) {
            System.out.println("Название: " + Uranus.getName());
            System.out.println("Масса: " + Uranus.getWeight() + " кг");
            System.out.println("Радиус: " + Uranus.getRadius() + " км");
            System.out.println("Расстояние от Солнца: " + Uranus.getDistanceFromTheSun());
            System.out.println("Площадь поверхности: " + Uranus.getSurfaceArea() + " км²");
            System.out.println("Период обращения: " + Uranus.getCirculationPeriod() + " days");
            System.out.println("Спутники: " + Uranus.getSatellites());
            System.out.println("Ускорение свободного падения: " + Uranus.getAccelerationOfGravity() + "м/с²");
            System.out.println("Большая скорость: " + Uranus.isBigSpeed());
        } else if (number == 9) {
            System.out.println("Название: " + Neptune.getName());
            System.out.println("Масса: " + Neptune.getWeight() + " кг");
            System.out.println("Радиус: " + Neptune.getRadius() + " км");
            System.out.println("Расстояние от Солнца: " + Neptune.getDistanceFromTheSun());
            System.out.println("Площадь поверхности: " + Neptune.getSurfaceArea() + " км²");
            System.out.println("Период обращения: " + Neptune.getCirculationPeriod() + " days");
            System.out.println("Спутники: " + Neptune.getSatellites());
            System.out.println("Ускорение свободного падения: " + Neptune.getAccelerationOfGravity() + "м/с²");
            System.out.println("Большая скорость: " + Neptune.isBigSpeed());
        } else if (number > 10 || number < 1) {
            System.out.println("Вы ввели число больше  или меньше 10!!!!");
        }

    }
}
