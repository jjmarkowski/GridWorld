import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    private int[] turns;
    private int count = 0;


    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] turns)
    {
        this.turns = turns;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        for (int i=0; i<turns[count]; i++) 
        {
            turn();
        }
        
        if (count == turns.length-1) 
        {
            count = 0;
        } 
        else
        {
            count++;
        }

        super.act();

    }
}
