/**
 * 
 * U.F.C. - Ultimate Fighting Championship
 * - Autonomous and Intelligent Agents'/Bots' Game
 * 
 * Authors:
 * @author Ruben Andre Barreiro
 *
 */

package ufc.octagon;

import java.awt.Point;


/**
 * The class responsible for a Octagon's object.
 */
public class OctagonObject {

	// Global Instance Variables:
	
	/**
	 * The position/point of the Octagon's object.
	 */
	private Point octagonObjectPosition;
	
	
	// Constructors:
	
	/**
	 * The constructor #1 of the Octagon's object.
	 * 
	 * @param octagonObjectPosition the position of the Octagon's object
	 */
	public OctagonObject(Point octagonObjectPosition) {
		this.octagonObjectPosition = octagonObjectPosition;
	}

	// Methods/Functions:
	
	/**
	 * Returns the position/point of the Octagon's object.
	 * 
	 * @return the position/point of the Octagon's object
	 */
	public Point getPosition() {
		return this.octagonObjectPosition;
	}

	/**
	 * Returns the coordinate X of the position/point of the Octagon's object.
	 * 
	 * @return the coordinate X of the position/point of the Octagon's object
	 */
	public int getPositionX() {
		return this.octagonObjectPosition.x;
	}

	/**
	 * Returns the coordinate Y of the position/point of the Octagon's object.
	 * 
	 * @return the coordinate Y of the position/point of the Octagon's object
	 */
	public int getPositionY() {
		return this.octagonObjectPosition.y;
	}

	/**
	 * Updates the both coordinates of the current position/point of the Octagon's object.
	 * 
	 * @param x the coordinate X of the position/point of the Octagon's object
	 * @param y the coordinate Y of the position/point of the Octagon's object
	 */
	public void updatePosition(int x, int y) {
		this.octagonObjectPosition.x = x;
		this.octagonObjectPosition.y = y;
	}
}