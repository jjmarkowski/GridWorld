import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

import java.awt.Color;

public class BlusterCritter extends Critter {

    private int courage;

    public BlusterCritter(int c) {
    	super();
    	courage = c;
    }

    public void processActors(ArrayList<Actor> actors) {
    	int n = 0;

        for (Actor actor : actors) {
        	if (actor instanceof Critter) {
        		n++;
        	}
        }

        if (n >= courage) {
            darken(50);
        } else {
        	lighten(50);
        }

        return;
    }

    public ArrayList<Actor> getActors() {
    	ArrayList<Actor> actors = new ArrayList<Actor>();

    	for (int row = getLocation().getRow()-2; row<=getLocation().getRow()+2; row++) {
    		for (int col = getLocation().getCol()-2; col<=getLocation().getCol()+2; col++) {
                
    			Location loc = new Location(row, col);

    			if (getGrid().isValid(loc)) {
    				Actor actor = getGrid().get(loc);
    				if (actor != null) {
    					actors.add(actor);
    				}
    			}
    		}
    	}
    	actors.remove(getLocation());
    	return actors;
    }

    public void darken(double factor) {
    	Color c = getColor(); 

        int red = c.getRed();
        int green = c.getGreen();
        int blue = c.getBlue();
        
        if (red >= factor) {
            red = (int) (c.getRed() - factor);
        }
        if (green >= factor) {
            green = (int) (c.getGreen() - factor);
        }
        if (blue >= factor) {
            blue = (int) (c.getBlue() - factor);
        }

        setColor(new Color(red, green, blue));
    }

    public void lighten(double factor) {
        Color c = getColor(); 

        int red = c.getRed();
        int green = c.getGreen();
        int blue = c.getBlue();
 
        if (red <= 255-factor) {
            red = (int) (c.getRed() + factor);
        }
        if (green <= 255-factor) {
            green = (int) (c.getGreen() + factor);
        }
        if (blue <= 255-factor) {
            blue = (int) (c.getBlue() + factor);
        }

        setColor(new Color(red, green, blue));
    }
}