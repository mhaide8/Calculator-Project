import java.util.*;
public class Code {

    /*
        Topic
            Game
                OS- Windows/Mac
                Storage-GB
                Proccesor Speed- Gghz
                RAM-
                Graphics VRAM-
                List Setup - NAMEOFGAME_data= {"Name of the Game" (0), OS (1),Storage (2) , Processor Speed (3), RAM (4), Graphics VRAM (5)}
    */
    public static void main (String [] args)
    {
        String[]  Phasmophobia_data = {"Phasmophobia","Windows", "15", "3.3" , "8", "4"};
        String[]  Counterstrike_data = {"Counterstrike","Windows and Mac","15", "2.4", "2", "0.256"};
        String[]  Cyberpunk_data= {"Cyberpunk","Windows","70", "3.4", "8", "4"};

        String user_OS;
        double user_storage;
        double user_pspeed;
        double user_ram;
        double user_vram;

        System.out.println("Can Your PC Run These Popular Gaming Titles?");

        System.out.println("What OS is running on your computer?");
        Scanner scan= new Scanner (System.in);
        user_OS=scan.nextLine();

        System.out.println("How much available storage (in gigabytes) do you have on your computer?");
        user_storage=scan.nextDouble();


        System.out.println("What is the processing speed (in gigahertz) on your computer?");
        user_pspeed=scan.nextDouble();

        System.out.println("What is amount of RAM (in GB) on your computer?");
        user_ram=scan.nextDouble();

        System.out.println("What is the VRAM (in GB) of computer's graphics card?");
        user_vram=scan.nextDouble();




    }
}
