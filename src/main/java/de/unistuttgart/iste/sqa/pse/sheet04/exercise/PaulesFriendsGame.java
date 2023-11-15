package de.unistuttgart.iste.sqa.pse.sheet04.exercise;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.model.Territory;
import de.hamstersimulator.objectsfirst.external.model.TerritoryBuilder;

/**
 * In this hamster-game {@code paule} gets two new friends.
 *
 * @author (Your name)
 * @version (A date or a version number)
 */
public class PaulesFriendsGame extends InternalPaulesFriendsGame {

	/**
	 * Creates {@code paule}s friends {@code ronnie} in the bottom right corner and
	 * {@code paula} in the bottom left corner.
	 */
	void createPaulesFriends() {
	

		// Local variables for Ronnie
		Location locationRonnie = Location.from(7, 7);
		Direction directionRonnie = Direction.NORTH;
		Territory territoryRonnie = game.getTerritory();
		Integer grainCountRonnie = 16;
		
		// Local variables for Paula
		Location locationPaula = Location.from(7, 0);
		Direction directionPaula = Direction.EAST;
		Territory territoryPaula = game.getTerritory();
		Integer grainCountPaula = 12;
		
		Hamster Ronnie = new Hamster(territoryRonnie, locationRonnie, directionRonnie, 16);
		Hamster Paula = new Hamster(territoryPaula, locationPaula, directionPaula, 12);



		// Hint: Be careful with the location of the new hamsters
	}

	/**
	 * Starts the PaulesFriendsGame to create {@code paule}s friends.
	 * Do <strong>not modify</strong> this operation!
	 */
	protected void run() {
		game.startGame();
		createPaulesFriends();
	}
}
