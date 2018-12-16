import Events.HelloEvent;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Oskar {


    public static void main (String[]args) throws Exception{

        JDA jda = new JDABuilder("").build();


        jda.addEventListener(new HelloEvent());

    }
}
