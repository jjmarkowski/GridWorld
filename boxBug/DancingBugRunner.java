import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        int[] turns = {5,3,7,5,9,7,11};
        ActorWorld world = new ActorWorld();
        DancingBug bob = new DancingBug(turns);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}