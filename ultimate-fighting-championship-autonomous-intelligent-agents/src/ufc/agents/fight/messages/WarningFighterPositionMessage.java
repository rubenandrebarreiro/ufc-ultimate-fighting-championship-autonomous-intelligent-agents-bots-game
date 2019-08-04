package ufc.agents.fight.messages;

import java.awt.Point;
import java.util.Date;

import jade.core.AID;
import jade.domain.FIPANames;
import jade.lang.acl.ACLMessage;
import ufc.agents.fight.UFCFightAgent;
import ufc.agents.fighter.UFCFighterAgent;

@SuppressWarnings("deprecation")
public class WarningFighterPositionMessage extends ACLMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ACLMessage messageToSend;
	
	private UFCFightAgent ufcFightAgent;
	
	private UFCFighterAgent ufcFighterAgent1;
	
	private UFCFighterAgent ufcFighterAgent2;
	
	
	public WarningFighterPositionMessage() {
		super(ACLMessage.CFP);
		
		this.ufcFightAgent = ufcFightAgent;
		this.ufcFighterAgent1 = ufcFighterAgent1;
		this.ufcFighterAgent2 = ufcFighterAgent2;
		
		this.setMessageToSend();
	}


	private void setMessageToSend() {
		Object[] ufcFighterAgentReceivers = UFCFightAgent.getUFCFighterAgentsNames(this.ufcFightAgent.getUFCFighterAgents());
		
		this.messageToSend = new ACLMessage(ACLMessage.CFP);
		
		for(Object ufcFighterAgentReceiver : ufcFighterAgentReceivers) {
			this.messageToSend.addReceiver(new AID((String) ufcFighterAgentReceiver, AID.ISLOCALNAME));
			
			this.messageToSend.setProtocol(FIPANames.InteractionProtocol.FIPA_CONTRACT_NET);
			
			// We want to receive a reply in 4 seconds
			this.messageToSend.setReplyByDate(new Date(System.currentTimeMillis() + 4000));
			
			Point ufcFighterAgent1Position = this.ufcFighterAgent1.getOctagonObject().getPosition();
			Point ufcFighterAgent2Position = this.ufcFighterAgent2.getOctagonObject().getPosition();
			
			this.messageToSend.setContent("UFC's Fighter #1 currently in Position (" + ((int) ufcFighterAgent1Position.getX()) + "," + ((int) ufcFighterAgent1Position.getY()) + ")");
			this.messageToSend.setContent("UFC's Fighter #2 currently in Position (" + ((int) ufcFighterAgent2Position.getX()) + "," + ((int) ufcFighterAgent2Position.getY()) + ")");

		}
	}
}
