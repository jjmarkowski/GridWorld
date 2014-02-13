import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
	
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();

		checkMoveLocations(locs);

		if (locs.size() == 0) {
			return super.getMoveLocations();
		}

		return locs;
	}

	public void checkMoveLocations(ArrayList<Location> locs) {
		Grid g = getGrid();
		Location leftMove = getLocation().getAdjacentLocation(Location.LEFT);
		Location rightMove = getLocation().getAdjacentLocation(Location.RIGHT);

		if (g.isValid(leftMove) && g.get(leftMove) == null) {
			leftMove = leftMove.getAdjacentLocation(Location.LEFT);
			if (g.isValid(leftMove) && g.get(leftMove) == null) {
				locs.add(leftMove);
			}
		}

		if (g.isValid(rightMove) && g.get(rightMove) == null) {
			rightMove = rightMove.getAdjacentLocation(Location.RIGHT);
			if (g.isValid(rightMove) && g.get(rightMove) == null) {
				locs.add(rightMove);
			}
		}
	}
}