/**
 * 
 * U.F.C. - Ultimate Fighting Championship
 * - Autonomous and Intelligent Agents'/Bots' Game
 * 
 * Authors:
 * @author Ruben Andre Barreiro
 *
 */

package ufc.agents.fighter;

import java.awt.Image;
import java.awt.Point;

import jade.core.Agent;
import ufc.octagon.OctagonObject;

/**
 * The class responsible for an UFC Fighter Agent, extending Agent.
 */
public class UFCFighterAgent extends Agent {

	/**
	 * The default UID of the Aircraft Agent.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The number of the Fighter Agent.
	 */
	private byte numFighter;
	
	/**
	 * The Name of the Fighter Agent.
	 */
	private String name;
	
	/**
	 * The Nickname of the Fighter Agent.
	 */
	private String nickname;
	
	/**
	 * The Alias of the Fighter Agent.
	 */
	private String alias;
	
	/**
	 * The Country of the Fighter Agent.
	 */
	private byte country;
	
	/**
	 * The Gender of the Fighter Agent.
	 */
	private byte gender;
	
	/**
	 * The Weight Category of the Fighter Agent.
	 */
	private byte weightCategory;
	
	/**
	 * The Striking's ability value of the Fighter Agent.
	 */
	private int striking;
	
	/**
	 * The Grappling's ability value of the Fighter Agent.
	 */
	private int grappling;

	/**
	 * The Stamina's ability value of the Fighter Agent.
	 */
	private int stamina;

	/**
	 * The Health's ability value of the Fighter Agent.
	 */
	private int health;

	/**
	 * The current Stamina's value of the Fighter Agent.
	 */
	private int currentStamina;
	
	/**
	 * The current Health's value of the Fighter Agent.
	 */
	private int currentHealth;

	/**
	 * The Octagon's object of the Fighter Agent.
	 */
	private OctagonObject octagonObject;
	
	/**
	 * The Sprite's Image of the Fighter Agent.
	 */
	private Image imageSprite;
	
	/**
	 * The last knowing Opponent's Fighter Agent's Position.
	 */
	private Point lastKnowingOpponentPosition;
	
	
	/**
	 * 
	 * 
	 * @param name
	 * @param nickname
	 * @param alias
	 * @param country
	 * @param gender
	 * @param weightCategory
	 * @param striking
	 * @param grappling
	 * @param stamina
	 * @param health
	 * @param currentStamina
	 * @param currentHealth
	 */
	public UFCFighterAgent(byte numFighter, String name, String nickname, String alias, byte country, byte gender, byte weightCategory,
							int striking, int grappling, int stamina, int health) {
		
		this.numFighter = numFighter;
		
		// The Name, Nickname and Alias of the Fighter Agent
		this.name = name;
		this.nickname = nickname;
		this.alias = alias;
		
		// The Country of the Fighter Agent
		this.country = country;
		
		// The Gender of the Fighter Agent
		this.gender = gender;
		
		// The Weight Category of the Fighter Agent
		this.weightCategory = weightCategory;
	
		// The ability values of the Fighter Agent's Statistics
		this.striking = striking;
		this.grappling = grappling;
		this.stamina = stamina;
		this.health = health;
		
		// The constantly variable values of the Fighter Agent, during the Fight Combat (Current Stamina and Current Health)
		this.currentStamina = 100;
		this.currentHealth = 100;
		
		if(this.numFighter == 0) {
			this.octagonObject = new OctagonObject(new Point(0, 0));
		}
		else {
			this.octagonObject = new OctagonObject(new Point(0, 0));
		}
		
		this.lastKnowingOpponentPosition = new Point(0,0);
	}
	
	public OctagonObject getOctagonObject() {
		return this.octagonObject;
	}
	
	
	protected void setup() {
		//addBehaviour(new AskTheOpponentPositionBehaviour(this, 1000));
		//addBehaviour(new UpdateMyPositionBehaviour(this, 1000));
	}
}