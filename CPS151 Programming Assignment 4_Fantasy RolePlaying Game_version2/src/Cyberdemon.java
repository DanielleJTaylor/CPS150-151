/*
 *
 * Name: Danielle Taylor
 * User Name: taylord24
 * Assignment: 4
 *
 * Description:
 * 
 * Creating a simple fantasy role-playing game in Java. 
 * The game has two phases:

Add each player to the game as a Creature object; each player enters their name and selects their species
Any number of players can be added to a game.  An ArrayList of Creatures would work perfectly for this!
 
Each player plays in turn; for each turn a player may:
Attack another player:
    The player enters the attacked opponent's name
    The damage points are subtracted from the attacked opponent's strength
    If that opponent's strength is then 0, the opponent is dead and is removed from the game
Pass their turn to the next player
Quit the game
The second phase keeps going until only one player is left; that player is the winner.
 * 
 * 
 *
 * Bug Report:
 *  Works well, no problems
 *
 */

import java.util.Random;

// Cyberdemon Class
public class Cyberdemon extends Demon {
	private Random generator = new Random();
    public Cyberdemon(String newName, int newStrength, int newHitPoints) {
        super(newName, newHitPoints, newStrength);
        species = "Cyberdemon";
    }

    @Override
    public int getDamage() {
        int chance = 1 + generator.nextInt(100);
        if (chance <= 5) {
            return super.getDamage() + 50;
        }
        return super.getDamage();
    }

	@Override
	public String getSpecies() {
		return species;
	}
}