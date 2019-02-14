import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;

public class Runner {

    public static void main(String[] args) {

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
//        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");

        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Animal animals[] = {tigger, pooh, rarity, gemma, stinger};
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "pasta");


    }




}
