import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains chameleon critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BlusterCritterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 4), new BlusterCritter(1));
        world.add(new Location(6, 1), new BlusterCritter(1));
        world.add(new Location(2, 6), new BlusterCritter(1));
        world.add(new Location(4, 2), new BlusterCritter(1));
        world.add(new Location(5, 4), new BlusterCritter(1));
        world.show();
    }
}