import info.gridworld.actor.ActorWorld;
<<<<<<< HEAD
import info.gridworld.actor.Bug;
=======
import info.gridworld.actor.Critter;
>>>>>>> 355f6f9a6df8adb800a8315b90fdfd457a6d7bc2
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

<<<<<<< HEAD
=======
import java.awt.Color;

>>>>>>> 355f6f9a6df8adb800a8315b90fdfd457a6d7bc2
public class QuickCrabRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
<<<<<<< HEAD
        world.add(new Location(7, 5), new Rock());
        world.add(new Location(5, 4), new Rock());
        world.add(new Location(5, 7), new Rock());
        world.add(new Location(7, 3), new Rock());
        world.add(new Location(7, 8), new Flower());
        world.add(new Location(2, 2), new Flower());
        world.add(new Location(3, 5), new Flower());
        world.add(new Location(3, 8), new Flower());
        //world.add(new Location(6, 5), new Bug());
        //world.add(new Location(5, 3), new Bug());
        world.add(new Location(4, 5), new QuickCrab());
        //world.add(new Location(6, 1), new CrabCritter());
        //world.add(new Location(7, 4), new CrabCritter());
=======
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(2, 8), new Flower(Color.BLUE));
        world.add(new Location(5, 5), new Flower(Color.PINK));
        world.add(new Location(1, 5), new Flower(Color.RED));
        world.add(new Location(7, 2), new Flower(Color.YELLOW));
        world.add(new Location(3, 4), new QuickCrab());
>>>>>>> 355f6f9a6df8adb800a8315b90fdfd457a6d7bc2
        world.show();
    }
}