import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

import java.awt.Color;

public class BlackHoleCritter extends Critter {

	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		ArrayList<Location> locations = getGrid().getOccupiedLocations();

		for(Location loc : locations){
			Actor acty = getGrid().get(loc);		
			if(acty != null){
				actors.add(acty);
			}
			actors.remove(getGrid().get(getLocation()));
		}
		return actors;
	}

	public void processActors(ArrayList<Actor> actors) {
		for (Actor actor : actors) {
			Location loc = actor.getLocation();
			Location moveTo = loc.getAdjacentLocation(loc.getDirectionToward(getLocation()));

			if(getGrid().isValid(moveTo)){
				if(getGrid().get(moveTo) == null){
					actor.moveTo(moveTo);
				}else if(moveTo.equals(getLocation())){
					actor.removeSelfFromGrid();
				}
			}	
		}
	}
}