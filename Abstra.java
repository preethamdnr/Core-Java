class Car{

    public void drive(){
        System.out.println("Driving the Car");
    }
    class Kia{
        public void playMusic(){
            System.out.println("Music is playing");
        }
    }
}

public class Abstra {
    public static void main(String args[]){
        Car obj =new Car();
        obj.drive();
        Car.Kia obj1= obj.new Kia();
        obj1.playMusic();
    }
}
