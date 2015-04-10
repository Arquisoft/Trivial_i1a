package trivial.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import trivial.logic.Player;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Table extends JFrame {
	
	private Map<Player, JButton> positions = new HashMap<Player, JButton>();

	private ArrayList<Player> players = new ArrayList<Player>();
	
	private JPanel contentPane;
	private JButton buttonDice;
	private JTextField scoreTxt1;
	private JTextField scoreTxt2;
	private JTextField scoreTxt3;
	private JTextField scoreTxt4;
	private JLabel lblP1;
	private JLabel lblP2;
	private JLabel lblP3;
	private JLabel lblP4;
	private JToolBar toolBar;
	private JButton btnNewGame;
	
	private JButton[][] board;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton btnNewButton_9;
	private JButton button_12;
	private JButton button_13;
	private JButton btnNewButton_8;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JButton button_19;
	private JButton button_20;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	private JButton button_24;
	private JButton button_25;
	private JButton button_26;
	private JButton button_27;
	private JButton button_28;
	private JButton button_29;
	private JButton button_30;
	private JButton button_31;
	private JButton button_32;
	private JButton button_33;
	private JButton button_34;
	private JButton button_35;
	private JButton button_36;
	private JButton button_37;
	private JButton button_38;
	private JButton button_39;
	private JButton button_40;
	private JButton button_41;
	private JButton btnNewButton_10;
	private JButton button_43;
	private JButton button_44;
	private JButton btnNewButton_11;
	private JButton button_46;
	private JButton button_47;
	private JButton button_48;
	private JButton button_49;
	private JButton button_50;
	private JButton button_51;
	private JButton button_52;
	private JButton button_53;
	private JButton button_54;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Table() {
		//TODO recoger array de jugadores llamada players
		//TODO recoger array de preguntas llamada questions
		//Game game = new Game(players, questions);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getButtonDice());
		contentPane.add(getScoreTxt1());
		contentPane.add(getScoreTxt2());
		contentPane.add(getScoreTxt3());
		contentPane.add(getScoreTxt4());
		contentPane.add(getLblP1());
		contentPane.add(getLblP2());
		contentPane.add(getLblP3());
		contentPane.add(getLblP4());
		contentPane.add(getToolBar());
		contentPane.add(getPanel());
		
		
	}
	private JButton getButtonDice() {
		if (buttonDice == null) {
			buttonDice = new JButton("");
			buttonDice.addActionListener(new ActionListener() {
				private int DiceNumber;

				public void actionPerformed(ActionEvent e) {
					Random rn = new Random();
					int maximum=6;
					int minimum=1;
					int n = maximum - minimum + 1;
					int i = rn.nextInt() % n;
					DiceNumber =  minimum + i;
				}
			});
			buttonDice.setBounds(1032, 72, 151, 132);
		}
		return buttonDice;
	}
	private JTextField getScoreTxt1() {
		if (scoreTxt1 == null) {
			scoreTxt1 = new JTextField();
			scoreTxt1.setEditable(false);
			scoreTxt1.setBounds(1130, 337, 109, 29);
			scoreTxt1.setColumns(10);
		}
		return scoreTxt1;
	}
	private JTextField getScoreTxt2() {
		if (scoreTxt2 == null) {
			scoreTxt2 = new JTextField();
			scoreTxt2.setEditable(false);
			scoreTxt2.setBounds(1130, 385, 109, 29);
			scoreTxt2.setColumns(10);
		}
		return scoreTxt2;
	}
	private JTextField getScoreTxt3() {
		if (scoreTxt3 == null) {
			scoreTxt3 = new JTextField();
			scoreTxt3.setEditable(false);
			scoreTxt3.setBounds(1130, 433, 109, 29);
			scoreTxt3.setColumns(10);
		}
		return scoreTxt3;
	}
	private JTextField getScoreTxt4() {
		if (scoreTxt4 == null) {
			scoreTxt4 = new JTextField();
			scoreTxt4.setEditable(false);
			scoreTxt4.setBounds(1130, 481, 109, 29);
			scoreTxt4.setColumns(10);
		}
		return scoreTxt4;
	}
	private JLabel getLblP1() {
		if (lblP1 == null) {
			lblP1 = new JLabel("P1");
			lblP1.setBounds(974, 340, 125, 23);
		}
		return lblP1;
	}
	private JLabel getLblP2() {
		if (lblP2 == null) {
			lblP2 = new JLabel("P2");
			lblP2.setBounds(974, 388, 125, 23);
		}
		return lblP2;
	}
	private JLabel getLblP3() {
		if (lblP3 == null) {
			lblP3 = new JLabel("P3");
			lblP3.setBounds(974, 436, 125, 23);
		}
		return lblP3;
	}
	private JLabel getLblP4() {
		if (lblP4 == null) {
			lblP4 = new JLabel("P4");
			lblP4.setBounds(974, 484, 125, 23);
		}
		return lblP4;
	}
	private JToolBar getToolBar() {
		if (toolBar == null) {
			toolBar = new JToolBar();
			toolBar.setBounds(0, 0, 1256, 38);
			toolBar.add(getBtnNewGame());
		}
		return toolBar;
	}
	private JButton getBtnNewGame() {
		if (btnNewGame == null) {
			btnNewGame = new JButton("New Game");
		}
		return btnNewGame;
	}
	
	private void goToTilt()
	{
		//Players.
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(10, 49, 945, 621);
			panel.setLayout(new GridLayout(7, 0, 0, 0));
			panel.add(getBtnNewButton_2());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_3());
			panel.add(getBtnNewButton_4());
			panel.add(getBtnNewButton_5());
			panel.add(getBtnNewButton_6());
			panel.add(getButton());
			panel.add(getBtnNewButton_7());
			panel.add(getButton_1());
			panel.add(getButton_41());
			panel.add(getButton_39());
			panel.add(getButton_44());
			panel.add(getButton_43());
			panel.add(getBtnNewButton_10());
			panel.add(getButton_36());
			panel.add(getButton_2());
			panel.add(getBtnNewButton());
			panel.add(getButton_4());
			panel.add(getButton_3());
			panel.add(getButton_48());
			panel.add(getButton_47());
			panel.add(getButton_46());
			panel.add(getBtnNewButton_11());
			panel.add(getButton_20());
			panel.add(getButton_40());
			panel.add(getButton_19());
			panel.add(getButton_38());
			panel.add(getButton_37());
			panel.add(getButton_18());
			panel.add(getButton_35());
			panel.add(getButton_17());
			panel.add(getButton_34());
			panel.add(getButton_33());
			panel.add(getButton_32());
			panel.add(getButton_31());
			panel.add(getButton_30());
			panel.add(getButton_29());
			panel.add(getButton_28());
			panel.add(getButton_16());
			panel.add(getButton_15());
			panel.add(getBtnNewButton_8());
			panel.add(getButton_7());
			panel.add(getButton_6());
			panel.add(getButton_5());
			panel.add(getButton_10());
			panel.add(getButton_9());
			panel.add(getButton_8());
			panel.add(getButton_13());
			panel.add(getButton_12());
			panel.add(getBtnNewButton_9());
			panel.add(getButton_22());
			panel.add(getButton_21());
			panel.add(getButton_23());
			panel.add(getButton_24());
			panel.add(getButton_25());
			panel.add(getButton_27());
			panel.add(getButton_26());
			panel.add(getButton_49());
			panel.add(getButton_50());
			panel.add(getButton_51());
			panel.add(getButton_52());
			panel.add(getButton_53());
			panel.add(getButton_54());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setEnabled(false);
			btnNewButton.setVisible(false);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("New button");
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("0_0");
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("New button");
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("New button");
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("New button");
		}
		return btnNewButton_5;
	}
	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("New button");
		}
		return btnNewButton_6;
	}
	private JButton getBtnNewButton_7() {
		if (btnNewButton_7 == null) {
			btnNewButton_7 = new JButton("New button");
		}
		return btnNewButton_7;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("New button");
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("New button");
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("");
			button_2.setEnabled(false);
			button_2.setVisible(false);
		}
		return button_2;
	}
	private JButton getButton_3() {
		if (button_3 == null) {
			button_3 = new JButton("New button");
		}
		return button_3;
	}
	private JButton getButton_4() {
		if (button_4 == null) {
			button_4 = new JButton("New button");
		}
		return button_4;
	}
	private JButton getButton_5() {
		if (button_5 == null) {
			button_5 = new JButton("");
			button_5.setEnabled(false);
			button_5.setVisible(false);
		}
		return button_5;
	}
	private JButton getButton_6() {
		if (button_6 == null) {
			button_6 = new JButton("");
			button_6.setEnabled(false);
			button_6.setVisible(false);
		}
		return button_6;
	}
	private JButton getButton_7() {
		if (button_7 == null) {
			button_7 = new JButton("");
			button_7.setEnabled(false);
			button_7.setVisible(false);
		}
		return button_7;
	}
	private JButton getButton_8() {
		if (button_8 == null) {
			button_8 = new JButton("");
			button_8.setEnabled(false);
			button_8.setVisible(false);
		}
		return button_8;
	}
	private JButton getButton_9() {
		if (button_9 == null) {
			button_9 = new JButton("New button");
		}
		return button_9;
	}
	private JButton getButton_10() {
		if (button_10 == null) {
			button_10 = new JButton("New button");
		}
		return button_10;
	}
	private JButton getBtnNewButton_9() {
		if (btnNewButton_9 == null) {
			btnNewButton_9 = new JButton("New button");
		}
		return btnNewButton_9;
	}
	private JButton getButton_12() {
		if (button_12 == null) {
			button_12 = new JButton("");
			button_12.setEnabled(false);
			button_12.setVisible(false);
		}
		return button_12;
	}
	private JButton getButton_13() {
		if (button_13 == null) {
			button_13 = new JButton("");
			button_13.setEnabled(false);
			button_13.setVisible(false);
		}
		return button_13;
	}
	private JButton getBtnNewButton_8() {
		if (btnNewButton_8 == null) {
			btnNewButton_8 = new JButton("New Button");
		}
		return btnNewButton_8;
	}
	private JButton getButton_15() {
		if (button_15 == null) {
			button_15 = new JButton("");
			button_15.setEnabled(false);
			button_15.setVisible(false);
		}
		return button_15;
	}
	private JButton getButton_16() {
		if (button_16 == null) {
			button_16 = new JButton("");
			button_16.setEnabled(false);
			button_16.setVisible(false);
		}
		return button_16;
	}
	private JButton getButton_17() {
		if (button_17 == null) {
			button_17 = new JButton("New button");
		}
		return button_17;
	}
	private JButton getButton_18() {
		if (button_18 == null) {
			button_18 = new JButton("New button");
		}
		return button_18;
	}
	private JButton getButton_19() {
		if (button_19 == null) {
			button_19 = new JButton("");
			button_19.setEnabled(false);
			button_19.setVisible(false);
		}
		return button_19;
	}
	private JButton getButton_20() {
		if (button_20 == null) {
			button_20 = new JButton("");
			button_20.setEnabled(false);
			button_20.setVisible(false);
		}
		return button_20;
	}
	private JButton getButton_21() {
		if (button_21 == null) {
			button_21 = new JButton("");
			button_21.setEnabled(false);
			button_21.setVisible(false);
		}
		return button_21;
	}
	private JButton getButton_22() {
		if (button_22 == null) {
			button_22 = new JButton("");
			button_22.setEnabled(false);
			button_22.setVisible(false);
		}
		return button_22;
	}
	private JButton getButton_23() {
		if (button_23 == null) {
			button_23 = new JButton("");
			button_23.setEnabled(false);
			button_23.setVisible(false);
		}
		return button_23;
	}
	private JButton getButton_24() {
		if (button_24 == null) {
			button_24 = new JButton("New button");
		}
		return button_24;
	}
	private JButton getButton_25() {
		if (button_25 == null) {
			button_25 = new JButton("New button");
		}
		return button_25;
	}
	private JButton getButton_26() {
		if (button_26 == null) {
			button_26 = new JButton("New button");
		}
		return button_26;
	}
	private JButton getButton_27() {
		if (button_27 == null) {
			button_27 = new JButton("New button");
		}
		return button_27;
	}
	private JButton getButton_28() {
		if (button_28 == null) {
			button_28 = new JButton("");
			button_28.setEnabled(false);
			button_28.setVisible(false);
		}
		return button_28;
	}
	private JButton getButton_29() {
		if (button_29 == null) {
			button_29 = new JButton("New button");
		}
		return button_29;
	}
	private JButton getButton_30() {
		if (button_30 == null) {
			button_30 = new JButton("New button");
		}
		return button_30;
	}
	private JButton getButton_31() {
		if (button_31 == null) {
			button_31 = new JButton("New button");
		}
		return button_31;
	}
	private JButton getButton_32() {
		if (button_32 == null) {
			button_32 = new JButton("New button");
		}
		return button_32;
	}
	private JButton getButton_33() {
		if (button_33 == null) {
			button_33 = new JButton("New button");
		}
		return button_33;
	}
	private JButton getButton_34() {
		if (button_34 == null) {
			button_34 = new JButton("New button");
		}
		return button_34;
	}
	private JButton getButton_35() {
		if (button_35 == null) {
			button_35 = new JButton("New button");
		}
		return button_35;
	}
	private JButton getButton_36() {
		if (button_36 == null) {
			button_36 = new JButton("");
			button_36.setEnabled(false);
			button_36.setVisible(false);
		}
		return button_36;
	}
	private JButton getButton_37() {
		if (button_37 == null) {
			button_37 = new JButton("New button");
		}
		return button_37;
	}
	private JButton getButton_38() {
		if (button_38 == null) {
			button_38 = new JButton("New button");
		}
		return button_38;
	}
	private JButton getButton_39() {
		if (button_39 == null) {
			button_39 = new JButton("");
			button_39.setEnabled(false);
			button_39.setVisible(false);
		}
		return button_39;
	}
	private JButton getButton_40() {
		if (button_40 == null) {
			button_40 = new JButton("");
			button_40.setEnabled(false);
			button_40.setVisible(false);
		}
		return button_40;
	}
	private JButton getButton_41() {
		if (button_41 == null) {
			button_41 = new JButton("New button");
		}
		return button_41;
	}
	private JButton getBtnNewButton_10() {
		if (btnNewButton_10 == null) {
			btnNewButton_10 = new JButton("New Button");
		}
		return btnNewButton_10;
	}
	private JButton getButton_43() {
		if (button_43 == null) {
			button_43 = new JButton("");
			button_43.setEnabled(false);
			button_43.setVisible(false);
		}
		return button_43;
	}
	private JButton getButton_44() {
		if (button_44 == null) {
			button_44 = new JButton("");
			button_44.setEnabled(false);
			button_44.setVisible(false);
		}
		return button_44;
	}
	private JButton getBtnNewButton_11() {
		if (btnNewButton_11 == null) {
			btnNewButton_11 = new JButton("New button");
		}
		return btnNewButton_11;
	}
	private JButton getButton_46() {
		if (button_46 == null) {
			button_46 = new JButton("");
			button_46.setEnabled(false);
			button_46.setVisible(false);
		}
		return button_46;
	}
	private JButton getButton_47() {
		if (button_47 == null) {
			button_47 = new JButton("");
			button_47.setEnabled(false);
			button_47.setVisible(false);
		}
		return button_47;
	}
	private JButton getButton_48() {
		if (button_48 == null) {
			button_48 = new JButton("");
			button_48.setEnabled(false);
			button_48.setVisible(false);
		}
		return button_48;
	}
	private JButton getButton_49() {
		if (button_49 == null) {
			button_49 = new JButton("New button");
		}
		return button_49;
	}
	private JButton getButton_50() {
		if (button_50 == null) {
			button_50 = new JButton("New button");
		}
		return button_50;
	}
	private JButton getButton_51() {
		if (button_51 == null) {
			button_51 = new JButton("New button");
		}
		return button_51;
	}
	private JButton getButton_52() {
		if (button_52 == null) {
			button_52 = new JButton("New button");
		}
		return button_52;
	}
	private JButton getButton_53() {
		if (button_53 == null) {
			button_53 = new JButton("New button");
		}
		return button_53;
	}
	private JButton getButton_54() {
		if (button_54 == null) {
			button_54 = new JButton("New button");
		}
		return button_54;
	}
}
