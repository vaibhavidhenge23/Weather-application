package com.Weather_application.Weather_App.model;

import java.util.List;

public class WeatherResponse {

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private Sys sys;
    private List<Weather> weather;
    private Main main;
    private Wind wind;

    public static class Sys{
        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        private String Country;

    }

    public static class Weather {
        private int id;
        private String desciption;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescription() {
            return desciption;
        }

        public void setDescription(String description) {
            this.desciption = desciption;
        }
    }
        public static class Main{
            private double temp;
            private int Humidity;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public int getHumidity() {
                return Humidity;
            }

            public void setHumidity(int humidity) {
                Humidity = humidity;
            }
        }
        public static class Wind{
            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            private double speed;
    }
}
