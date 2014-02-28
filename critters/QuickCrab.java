import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
<<<<<<< HEAD
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {

	public QuickCrab() {
		super();
	}

	public ArrayList<Location> getMoveLocations() {

	    ArrayList<Location> locs = new ArrayList<Location>();
	    Location loc = getLocation();
	    Location tempLoc;

	    Grid gr = getGrid();

	    ArrayList<Location> oneAway = new ArrayList<Location>();

		tempLoc = loc.getAdjacentLocation(getDirection() + Location.LEFT);
	    if (gr.isValid(tempLoc)) {
	    	oneAway.add(tempLoc);	
	    }
	    tempLoc = loc.getAdjacentLocation(getDirection() + Location.RIGHT);
	    if (gr.isValid(tempLoc)) {
	       	oneAway.add(tempLoc);	
	    }

	    for (Location locCheck : oneAway) {
	        if (gr.get(locCheck) != null) {
	            oneAway.remove(locCheck);
	        }
	    }

	    for (Location locCheck : oneAway) {
	    	tempLoc = locCheck.getAdjacentLocation(getDirection() + Location.LEFT);
	    	if (tempLoc != loc && gr.isValid(locCheck) && gr.get(locCheck) == null) {
	    		locs.add(tempLoc);	
	    	}

	    	tempLoc = locCheck.getAdjacentLocation(getDirection() + Location.RIGHT);
	    	if (tempLoc != loc && gr.isValid(locCheck) && gr.get(locCheck) == null) {
	    		locs.add(tempLoc);
	    	}
	    }
	    
	    return locs;
=======
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
>>>>>>> 355f6f9a6df8adb800a8315b90fdfd457a6d7bc2
	}
}