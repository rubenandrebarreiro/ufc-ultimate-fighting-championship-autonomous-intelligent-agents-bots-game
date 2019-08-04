package ufc.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class WelcomeScreen {
	
	private JFrame welcomeScreenWindowFrame;

	private ButtonGroup radioButtonGroupGenderSelectionOptions;
	
	private JRadioButton maleRadioButtonGenderSelectionOption;
	
	private JRadioButton femaleRadioButtonGenderSelectionOption;
	
	
	private boolean firstTimeChoice = true;
	
	
	private static final String[] weightCategorySelectionOptionsMale = { "Select an option...", "Heavyweight", "Light Heavyweight", "Middleweight", "Welterweight", "Lightweight", "Featherweight", "Bantaweight" };
	
	private static final String[] weightCategorySelectionOptionsFemale = { "Select an option...", "Bantaweight", "Strawweight" };
	
	private JComboBox<String> listComboWeightCategorySelectionOption;
	
	
	
	private static final String[] heavyweightFighterSelectionOptionsMale = { "Select an option...", "Daniel Cormier", "Mirko 'Cro Cop' Filipovic", "Junior dos Santos", "Todd Duffee", "Mark Hunt", "Stipe Miocic" };

	private static final String[] lightHeavyweightFighterSelectionOptionsMale = { "Select an option...", "Daniel Cormier" };
	
	private static final String[] middleweightFighterSelectionOptionsMale = { "Select an option...", "Daniel Cormier" };
	
	private static final String[] welterweightFighterSelectionOptionsMale = { "Select an option...", "Daniel Cormier" };
	
	private static final String[] lightweightFighterSelectionOptionsMale = { "Select an option...", "Khabib Nurgamendov", "Conor McGregor" };
	
	private static final String[] featherweightFighterSelectionOptionsMale = { "Select an option...", "Daniel Cormier" };
	
	private static final String[] bantaweightFighterSelectionOptionsMale = { "Select an option...", "Daniel Cormier" };
	
	
	
	private JComboBox<String> listComboFighterSelectionOption1;
	
	private JComboBox<String> listComboFighterSelectionOption2;
	
	
	
	private static final String[] fightCombatMaxRoundsQuantitySelectionOptions = { "Select an option...", "1", "2", "3", "4", "5" };

	private JComboBox<String> listFightCombatMaxRoundsQuantitySelectionOption;
	
	
	
	private static final String[] fightCombatMaxRoundsMinsTimeSelectionOptions = { "Select an option...", "0", "1", "2", "3", "4", "5" };

	private JComboBox<String> listFightCombatMaxRoundsMinsTimeSelectionOption;
	
	private static final String[] fightCombatMaxRoundsSecsTimeSelectionOptions = { "Select an option...", "00", "10", "20", "30", "40", "50" };
	
	private static final String[] fightCombatMaxRoundsSecsTimeSelectionOptionsMin = { "Select an option...", "10", "20", "30", "40", "50" };
	
	private static final String[] fightCombatMaxRoundsSecsTimeSelectionOptionsMax = { "Select an option...", "00" };
	
	private JComboBox<String> listFightCombatMaxRoundsSecsTimeSelectionOption;
	
	
	private JButton startButton = new JButton("Start");

	
	
	/**
	 * Constructor #1:
	 * @throws IOException 
	 * 
	 * 
	 */
	public WelcomeScreen() throws IOException {
		initialiseWelcomeScreenWindowFrame();
		initialiseWelcomeScreenTitleLabel();
		initialiseSettingsForm();
		initialiseStartButton();
		initialiseCopyrights();
		
		this.firstTimeChoice = false;
	}

	/**
	 * Initialises the Welcome Screen Window Frame
	 * @throws IOException 
	 */
	private void initialiseWelcomeScreenWindowFrame() throws IOException {
		welcomeScreenWindowFrame = new JFrame();
		
		// Setting the properties of the Welcome Screen Window Frame
		this.welcomeScreenWindowFrame.setTitle("U.F.C. - Ultimate Fighting Championship (Intelligent Agents'/Bots' Game)");
		this.welcomeScreenWindowFrame.setBounds(100, 100, 500, 600);
		
		this.welcomeScreenWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.welcomeScreenWindowFrame.getContentPane().setLayout(null);
		this.welcomeScreenWindowFrame.setResizable(false);
		
		this.welcomeScreenWindowFrame.setIconImage(ImageIO.read(new File("assets/logo/ufc-logo.png")));
	}
	
	/**
	 * Initialises the Application's Title Label
	 * @throws IOException 
	 */
	private void initialiseWelcomeScreenTitleLabel() throws IOException {
		JLabel welcomeScreenWindowTitleLabel = new JLabel("<html><div style='text-align: center;'>U.F.C. - Ultimate Fighting Championship<br>(Intelligent Agents'/Bots' Game)</div></html>");
		
		welcomeScreenWindowTitleLabel.setBounds(40, 0, 400, 80);
		welcomeScreenWindowTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeScreenWindowTitleLabel.setFont(new Font("Leelawadee", Font.BOLD, 20));
		
		this.welcomeScreenWindowFrame.getContentPane().add(welcomeScreenWindowTitleLabel);
		
		BufferedImage ufcLogoImage = ImageIO.read(new File("assets/logo/ufc-logo.png"));
		
		JLabel ufcLogoJLabel = new JLabel(new ImageIcon(ufcLogoImage.getScaledInstance(320, 120, 1)));
		ufcLogoJLabel.setBounds(60, 90, 400, 120);
		ufcLogoJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.welcomeScreenWindowFrame.getContentPane().add(ufcLogoJLabel);
	}
		
	/**
	 * Initialises the 'Start' button
	 */
	private void initialiseStartButton() {
		JLabel labelStartButton = new JLabel("Ready?! Fight!");

		labelStartButton.setHorizontalAlignment(SwingConstants.CENTER);
		labelStartButton.setBounds(125, 490, 240, 14);
		this.welcomeScreenWindowFrame.getContentPane().add(labelStartButton);
		
		this.startButton.setBounds(200, 510, 90, 20);
		this.welcomeScreenWindowFrame.getContentPane().add(this.startButton);
	}
	
	private void initialiseCopyrights() {
		JLabel labelGenderSelectionOption = new JLabel("Copyrights by: Rúben André Barreiro");

		labelGenderSelectionOption.setHorizontalAlignment(SwingConstants.CENTER);
		labelGenderSelectionOption.setBounds(120, 540, 240, 14);
		this.welcomeScreenWindowFrame.getContentPane().add(labelGenderSelectionOption);
	}
	
	private void initialiseSettingsForm() {
		JLabel labelGenderSelectionOption = new JLabel("<html><p style=\"font-size:14px; text-align:center\">Settings/Configurations</p></html>");

		labelGenderSelectionOption.setHorizontalAlignment(SwingConstants.CENTER);
		labelGenderSelectionOption.setBounds(120, 220, 240, 40);
		this.welcomeScreenWindowFrame.getContentPane().add(labelGenderSelectionOption);
		
		initialiseGenderSelectionOption();
		
		initialiseWeightSelectionOption();
		
		initialiseFighterSelectionOption1();
		initialiseFighterSelectionOption2();
		
		initialiseFightCombatMaxRoundsQuantity();
		initialiseFightCombatMaxRoundsTime();
	}

	private void initialiseGenderSelectionOption() {
		JLabel labelGenderSelectionOption = new JLabel("Select the Gender: ");

		labelGenderSelectionOption.setHorizontalAlignment(SwingConstants.LEFT);
		labelGenderSelectionOption.setBounds(20, 270, 140, 14);
		this.welcomeScreenWindowFrame.getContentPane().add(labelGenderSelectionOption);
		
		this.maleRadioButtonGenderSelectionOption = new JRadioButton("Male", true);
		this.maleRadioButtonGenderSelectionOption.setBounds(200, 270, 60, 14);
	
		this.maleRadioButtonGenderSelectionOption.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				initialiseWeightSelectionOption();
			}
		});
		
		this.welcomeScreenWindowFrame.getContentPane().add(this.maleRadioButtonGenderSelectionOption);	
		
		this.femaleRadioButtonGenderSelectionOption = new JRadioButton("Female");
		this.femaleRadioButtonGenderSelectionOption.setBounds(260, 270, 80, 14);
		
		this.femaleRadioButtonGenderSelectionOption.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				initialiseWeightSelectionOption();
			}
		});
		
		
		this.welcomeScreenWindowFrame.getContentPane().add(this.femaleRadioButtonGenderSelectionOption);	
		
		this.radioButtonGroupGenderSelectionOptions = new ButtonGroup();
		this.radioButtonGroupGenderSelectionOptions.add(this.maleRadioButtonGenderSelectionOption);
		this.radioButtonGroupGenderSelectionOptions.add(this.femaleRadioButtonGenderSelectionOption);
	}
	

	private void initialiseWeightSelectionOption() {
		
		if(this.listComboWeightCategorySelectionOption != null) {
			this.welcomeScreenWindowFrame.getContentPane().remove(this.listComboWeightCategorySelectionOption);
			this.listComboWeightCategorySelectionOption.removeAll();
			this.listComboWeightCategorySelectionOption = null;
		}
		
		JLabel labelWeightCategorySelectionOption = new JLabel("Select the Weight Category: ");

		labelWeightCategorySelectionOption.setHorizontalAlignment(SwingConstants.LEFT);
		labelWeightCategorySelectionOption.setBounds(20, 300, 160, 14);
		this.welcomeScreenWindowFrame.getContentPane().add(labelWeightCategorySelectionOption);
		
		if(this.maleRadioButtonGenderSelectionOption.isSelected()) {
			this.listComboWeightCategorySelectionOption = new JComboBox<String>(weightCategorySelectionOptionsMale);
		}
		else {
			this.listComboWeightCategorySelectionOption = new JComboBox<String>(weightCategorySelectionOptionsFemale);
		}
		
		this.listComboWeightCategorySelectionOption.setBounds(200, 298, 276, 20);
		this.listComboWeightCategorySelectionOption.setAlignmentX(SwingConstants.CENTER);
		this.listComboWeightCategorySelectionOption.setAlignmentY(SwingConstants.CENTER);
		
		this.listComboWeightCategorySelectionOption.setSelectedIndex(5);
		
		this.listComboWeightCategorySelectionOption.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				listComboFighterSelectionOption1.removeAllItems();
				listComboFighterSelectionOption1.removeAll();
				
				listComboFighterSelectionOption2.removeAllItems();
				listComboFighterSelectionOption2.removeAll();
				
				initialiseFighterSelectionOption1();
				initialiseFighterSelectionOption2();
			}
		});
		
		this.welcomeScreenWindowFrame.getContentPane().add(this.listComboWeightCategorySelectionOption);
	}
	
	private void initialiseFighterSelectionOption1() {
		if(this.listComboFighterSelectionOption1 != null) {
			this.welcomeScreenWindowFrame.getContentPane().remove(this.listComboFighterSelectionOption1);
			this.listComboFighterSelectionOption1.removeAll();
			this.listComboFighterSelectionOption1 = null;
		}
		
		JLabel labelFighterSelectionOption1 = new JLabel("Select the Fighter #1: ");

		labelFighterSelectionOption1.setHorizontalAlignment(SwingConstants.LEFT);
		labelFighterSelectionOption1.setBounds(20, 340, 160, 14);
		this.welcomeScreenWindowFrame.getContentPane().add(labelFighterSelectionOption1);
		
		if(this.maleRadioButtonGenderSelectionOption.isSelected()) {
			switch(this.listComboWeightCategorySelectionOption.getSelectedIndex()) {
				case 0:
					break;
				case 1:
					this.listComboFighterSelectionOption1 = new JComboBox<String>(heavyweightFighterSelectionOptionsMale);
					break;
				case 2:
					this.listComboFighterSelectionOption1 = new JComboBox<String>(lightHeavyweightFighterSelectionOptionsMale);
					break;
				case 3:
					this.listComboFighterSelectionOption1 = new JComboBox<String>(middleweightFighterSelectionOptionsMale);
					break;
				case 4:
					this.listComboFighterSelectionOption1 = new JComboBox<String>(welterweightFighterSelectionOptionsMale);
					break;
				case 5:
					this.listComboFighterSelectionOption1 = new JComboBox<String>(lightweightFighterSelectionOptionsMale);
					
					if(firstTimeChoice) {
						this.listComboFighterSelectionOption1.setSelectedIndex(1);
					}
					
					break;
				case 6:
					this.listComboFighterSelectionOption1 = new JComboBox<String>(featherweightFighterSelectionOptionsMale);
					break;
				case 7:
					this.listComboFighterSelectionOption1 = new JComboBox<String>(bantaweightFighterSelectionOptionsMale);
					break;
				default:
					break;
			}
		}
		
		this.listComboFighterSelectionOption1.setBounds(200, 338, 276, 20);
		this.listComboFighterSelectionOption1.setAlignmentX(SwingConstants.CENTER);
		this.listComboFighterSelectionOption1.setAlignmentY(SwingConstants.CENTER);
		this.welcomeScreenWindowFrame.getContentPane().add(this.listComboFighterSelectionOption1);
	}
	
	private void initialiseFighterSelectionOption2() {
		if(this.listComboFighterSelectionOption2 != null) {
			this.welcomeScreenWindowFrame.getContentPane().remove(this.listComboFighterSelectionOption2);
			this.listComboFighterSelectionOption2.removeAll();
			this.listComboFighterSelectionOption2 = null;
		}
		
		JLabel labelFighterSelectionOption2 = new JLabel("Select the Fighter #2: ");

		labelFighterSelectionOption2.setHorizontalAlignment(SwingConstants.LEFT);
		labelFighterSelectionOption2.setBounds(20, 366, 160, 14);
		this.welcomeScreenWindowFrame.getContentPane().add(labelFighterSelectionOption2);
		
		if(this.maleRadioButtonGenderSelectionOption.isSelected()) {
			switch(this.listComboWeightCategorySelectionOption.getSelectedIndex()) {
				case 0:
					break;
				case 1:
					this.listComboFighterSelectionOption2 = new JComboBox<String>(heavyweightFighterSelectionOptionsMale);
					break;
				case 2:
					this.listComboFighterSelectionOption2 = new JComboBox<String>(lightHeavyweightFighterSelectionOptionsMale);
					break;
				case 3:
					this.listComboFighterSelectionOption2 = new JComboBox<String>(middleweightFighterSelectionOptionsMale);
					break;
				case 4:
					this.listComboFighterSelectionOption2 = new JComboBox<String>(welterweightFighterSelectionOptionsMale);
					break;
				case 5:
					this.listComboFighterSelectionOption2 = new JComboBox<String>(lightweightFighterSelectionOptionsMale);
					
					if(firstTimeChoice) {
						this.listComboFighterSelectionOption2.setSelectedIndex(2);
					}
					
					break;
				case 6:
					this.listComboFighterSelectionOption2 = new JComboBox<String>(featherweightFighterSelectionOptionsMale);
					break;
				case 7:
					this.listComboFighterSelectionOption2 = new JComboBox<String>(bantaweightFighterSelectionOptionsMale);
					break;
				default:
					break;
			}
		}
		
		this.listComboFighterSelectionOption2.setBounds(200, 364, 276, 20);
		this.listComboFighterSelectionOption2.setAlignmentX(SwingConstants.CENTER);
		this.listComboFighterSelectionOption2.setAlignmentY(SwingConstants.CENTER);
		
		this.welcomeScreenWindowFrame.getContentPane().add(this.listComboFighterSelectionOption2);
	}

	private void initialiseFightCombatMaxRoundsQuantity() {
				
		JLabel labelFightCombatMaxRoundsQuantity = new JLabel("Select the Max. No. of Rounds: ");

		labelFightCombatMaxRoundsQuantity.setHorizontalAlignment(SwingConstants.LEFT);
		labelFightCombatMaxRoundsQuantity.setBounds(20, 420, 180, 14);
		this.welcomeScreenWindowFrame.getContentPane().add(labelFightCombatMaxRoundsQuantity);
				
		this.listFightCombatMaxRoundsQuantitySelectionOption = new JComboBox<String>(fightCombatMaxRoundsQuantitySelectionOptions);
		
		this.listFightCombatMaxRoundsQuantitySelectionOption.setBounds(200, 418, 276, 20);
		this.listFightCombatMaxRoundsQuantitySelectionOption.setAlignmentX(SwingConstants.CENTER);
		this.listFightCombatMaxRoundsQuantitySelectionOption.setAlignmentY(SwingConstants.CENTER);
		
		if(firstTimeChoice) {
			this.listFightCombatMaxRoundsQuantitySelectionOption.setSelectedIndex(5);
		}
		
		this.welcomeScreenWindowFrame.getContentPane().add(this.listFightCombatMaxRoundsQuantitySelectionOption);
	}
	
	
	
	private void initialiseFightCombatMaxRoundsTime() {
		
		if(this.listFightCombatMaxRoundsSecsTimeSelectionOption != null) {
			this.welcomeScreenWindowFrame.getContentPane().remove(this.listFightCombatMaxRoundsSecsTimeSelectionOption);
			this.listFightCombatMaxRoundsSecsTimeSelectionOption.removeAll();
			this.listFightCombatMaxRoundsSecsTimeSelectionOption = null;
		}
		
		if(firstTimeChoice) {
			JLabel labelFightCombatMaxRoundsMinsTime = new JLabel("Select the Time of Each Round: ");
			
			labelFightCombatMaxRoundsMinsTime.setHorizontalAlignment(SwingConstants.LEFT);
			labelFightCombatMaxRoundsMinsTime.setBounds(20, 450, 180, 14);
			this.welcomeScreenWindowFrame.getContentPane().add(labelFightCombatMaxRoundsMinsTime);
			
			JLabel labelFightCombatMaxRoundsMinsTimeSelectionOption = new JLabel("min");
			
			labelFightCombatMaxRoundsMinsTimeSelectionOption.setHorizontalAlignment(SwingConstants.LEFT);
			labelFightCombatMaxRoundsMinsTimeSelectionOption.setBounds(308, 450, 60, 14);
			
			this.welcomeScreenWindowFrame.getContentPane().add(labelFightCombatMaxRoundsMinsTimeSelectionOption);
			
			
			JLabel labelFightCombatMaxRoundsSeparatorTimeSelectionOption = new JLabel(" : ");
			
			labelFightCombatMaxRoundsSeparatorTimeSelectionOption.setHorizontalAlignment(SwingConstants.LEFT);
			labelFightCombatMaxRoundsSeparatorTimeSelectionOption.setBounds(332, 450, 20, 14);
			this.welcomeScreenWindowFrame.getContentPane().add(labelFightCombatMaxRoundsSeparatorTimeSelectionOption);
			
			JLabel labelFightCombatMaxRoundsSecsTimeSelectionOption= new JLabel("sec");
			
			labelFightCombatMaxRoundsSecsTimeSelectionOption.setHorizontalAlignment(SwingConstants.LEFT);
			labelFightCombatMaxRoundsSecsTimeSelectionOption.setBounds(454, 450, 60, 14);
			this.welcomeScreenWindowFrame.getContentPane().add(labelFightCombatMaxRoundsSecsTimeSelectionOption);
		
			
			this.listFightCombatMaxRoundsMinsTimeSelectionOption = new JComboBox<String>(fightCombatMaxRoundsMinsTimeSelectionOptions);
			
			this.listFightCombatMaxRoundsMinsTimeSelectionOption.setBounds(200, 448, 104, 20);
			this.listFightCombatMaxRoundsMinsTimeSelectionOption.setAlignmentX(SwingConstants.CENTER);
			this.listFightCombatMaxRoundsMinsTimeSelectionOption.setAlignmentY(SwingConstants.CENTER);
			
			if(firstTimeChoice) {
				this.listFightCombatMaxRoundsMinsTimeSelectionOption.setSelectedIndex(6);
				
				this.listFightCombatMaxRoundsMinsTimeSelectionOption.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent actionEvent) {
						listFightCombatMaxRoundsSecsTimeSelectionOption.removeAllItems();
						listFightCombatMaxRoundsSecsTimeSelectionOption.removeAll();
						
						initialiseFightCombatMaxRoundsTime();
					}
				});
			}
		}
		
		
		this.welcomeScreenWindowFrame.getContentPane().add(this.listFightCombatMaxRoundsMinsTimeSelectionOption);
		
		String[] fightCombatMaxRoundsSecsTimeSelectionOptionsCurrent;
		
		if(this.listFightCombatMaxRoundsMinsTimeSelectionOption.getSelectedIndex() == 1) {
			fightCombatMaxRoundsSecsTimeSelectionOptionsCurrent = fightCombatMaxRoundsSecsTimeSelectionOptionsMin;
			this.listFightCombatMaxRoundsSecsTimeSelectionOption = new JComboBox<String>(fightCombatMaxRoundsSecsTimeSelectionOptionsCurrent);
		}
		else if(this.listFightCombatMaxRoundsMinsTimeSelectionOption.getSelectedIndex() == 6) {
			fightCombatMaxRoundsSecsTimeSelectionOptionsCurrent = fightCombatMaxRoundsSecsTimeSelectionOptionsMax;
			this.listFightCombatMaxRoundsSecsTimeSelectionOption = new JComboBox<String>(fightCombatMaxRoundsSecsTimeSelectionOptionsCurrent);
		}
		else {
			fightCombatMaxRoundsSecsTimeSelectionOptionsCurrent = fightCombatMaxRoundsSecsTimeSelectionOptions;
			this.listFightCombatMaxRoundsSecsTimeSelectionOption = new JComboBox<String>(fightCombatMaxRoundsSecsTimeSelectionOptionsCurrent);
		}
		
		this.listFightCombatMaxRoundsSecsTimeSelectionOption.setBounds(346, 448, 104, 20);
		this.listFightCombatMaxRoundsSecsTimeSelectionOption.setAlignmentX(SwingConstants.CENTER);
		this.listFightCombatMaxRoundsSecsTimeSelectionOption.setAlignmentY(SwingConstants.CENTER);
		
		if(firstTimeChoice) {
			this.listFightCombatMaxRoundsSecsTimeSelectionOption.setSelectedIndex(1);
		}
		
		this.welcomeScreenWindowFrame.getContentPane().add(this.listFightCombatMaxRoundsSecsTimeSelectionOption);
	}
	
	
	/**
	 * Returns the Welcome Screen Window Frame
	 * 
	 * @return the Welcome Screen Window Frame
	 */
	public JFrame getWelcomeScreenWindowFrame() {
		return this.welcomeScreenWindowFrame;
	}

}