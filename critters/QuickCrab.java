import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
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
	}
}