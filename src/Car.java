/**
 * Created by Роман on 17.11.2016.
 */
public class Car {
    private double Speed;
    private double beginingSpeed;
    private double maxSpeed;
    private double minSpeed;

    public Car(){
        Speed = 10 +10*Math.random();
    Speed = beginingSpeed;
        maxSpeed = 90;
        minSpeed = 20;
}
public void setSpeed(){
    Speed = Speed -1;
    System.out.println("setSpeed");

}
public String getStatus(){
    if (Speed>maxSpeed)
        return "разгон";
    else if (Speed<maxSpeed)
            return "не спешит";
    else if (Speed<minSpeed)
        return "останавливается";
    else return "P";
}

}
