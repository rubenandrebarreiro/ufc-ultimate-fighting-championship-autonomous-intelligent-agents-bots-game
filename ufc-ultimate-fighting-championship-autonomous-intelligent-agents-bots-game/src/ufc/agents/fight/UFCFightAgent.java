package ufc.agents.fight;

import jade.core.Agent;
import ufc.agents.fighter.UFCFighterAgent;
import ufc.utils.configuration.Configuration;

public class UFCFightAgent extends Agent {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	// Global Instance Variables:
	
	/**
	 * The matrix that represents all the positions/points of the Octagon's map/grid.
	 */
	private Object[][] octagonMap;
	
	private UFCFighterAgent ufcFighterAgent1;
	
	private UFCFighterAgent ufcFighterAgent2;
	
	
	public UFCFightAgent() {
		this.createOctagon();
	}


	private void createOctagon() {
		
		// Creation of the matrix/grid that represents all the positions/points of the Octagon's map/grid
		this.octagonMap = new Object[Configuration.GRID_WIDTH][Configuration.GRID_HEIGHT];	
	}
	
	/*
	private void createFighters() {
		this.ufcFighterAgent1 = new UFCFighterAgent((byte) 0, name, nickname, alias, country, gender, weightCategory, striking, grappling, stamina, health);	}
	}
	private void createFighterAgent1(String name, String nickname, String alias, byte country, byte gender, byte weightCategory,
								int striking, int grappling, int stamina, int health) {
		
		
	}
	*/
}
