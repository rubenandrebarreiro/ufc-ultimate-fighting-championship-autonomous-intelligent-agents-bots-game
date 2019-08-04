package ufc.agents.fight.behaviours;

import jade.core.behaviours.TickerBehaviour;
import ufc.agents.fight.UFCFightAgent;
import ufc.agents.fighter.UFCFighterAgent;

public class VerifyFightersPositionsBehaviour extends TickerBehaviour {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UFCFightAgent ufcFightAgent;
	
	private UFCFighterAgent ufcFighterAgent1;
	
	private UFCFighterAgent ufcFighterAgent2;
	
	
	public VerifyFightersPositionsBehaviour(UFCFightAgent ufcFightAgent,
											   UFCFighterAgent ufcFighterAgent1, 
											   UFCFighterAgent ufcFighterAgent2,
											   long behaviourPeriod) {
		
		super(ufcFightAgent, behaviourPeriod);
		
		this.ufcFightAgent = ufcFightAgent;
		this.ufcFighterAgent1 = ufcFighterAgent1;
		this.ufcFighterAgent2 = ufcFighterAgent2;
	}


	@Override
	protected void onTick() {
		
	}
}
