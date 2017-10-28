package ch8;

import java.awt.*;

public class GPSCar extends Car implements GPS {
    public Point getLocation() {
        Point point = new Point();
        point.setLocation(super.getSpeed(), super.getSpeed());
        return point;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(",坐标：（" +  getLocation().x + ", " + getLocation().y + "）");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        GPSCar gpsCar = new GPSCar();
        gpsCar.setName("wanghan");
        gpsCar.setSpeed(33.43f);
        System.out.println(gpsCar.toString());
    }
}
