import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;

public class KingCrab extends CrabCritter {

    public void processActors(ArrayList<Actor> actors) {
        for (Actor actor : actors) {

            ArrayList<Location> locs = getGrid().getEmptyAdjacentLocations(actor.getLocation());

            int count = 0;
            for (Location loc : locs) {
                if (distance(loc) > 1) {
                    actor.moveTo(loc);
                } else {
                    count++;
                }
            }
            if (count == locs.size()) {
                actor.removeSelfFromGrid();
            }

        }
    }

    public int distance(Location loc) {
        int x1 = getLocation().getRow(); 
        int y1 = getLocation().getCol(); 
        int x2 = loc.getRow(); 
        int y2 = loc.getCol(); 
        double dist = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)) + .5; 
        return (int)Math.floor(dist);
    }  
}