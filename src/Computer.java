import java.util.concurrent.Callable;

public class Computer {
    public static void main(String[] args){



        System.out.println("This is my computer");
        Computer myComputer = new Computer();
        myComputer.turnOnComputer();
        myComputer.turnOffComputer();
        myComputer.cleanCashe();
        myComputer.reduceBrightNess(30);
        myComputer.playMusic();


        String volume ="high";
        if(volume == "high")
            System.out.println("Adjust volume");




        }

    public void turnOnComputer() {
        System.out.println("Turn on Computer");
    }
    public void turnOffComputer(){
        System.out.println("Turn off computer");

    }
    public void cleanCashe(){
        System.out.println("Clean the cashe");
    }
    public void reduceBrightNess(int percentage){
        System.out.println("Reduce the broghtness :" + percentage + "%");

    }
    public void playMusic(){
        System.out.println("Play the music");

    }
    public void adjustTheVolume(){
        String volume ="high";
        if(volume == "high")
        System.out.println("Adjust volume");
    }

    }

