package trivial.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import trivial.logic.Player;

public class Table extends JFrame {
	
	private Map<Player, JButton> positions = new HashMap<Player, JButton>();

	private ArrayList<Player> players = new ArrayList<Player>();
	
	private JPanel contentPane;
	private JButton tilt1;
	private JButton tilt2;
	private JButton tilt3;
	private JButton tilt4;
	private JButton tilt5;
	private JButton tilt6;
	private JButton tilt7;
	private JButton tilt8;
	private JButton tilt9;
	private JButton tilt10;
	private JButton tilt11;
	private JButton tilt12;
	private JButton tilt13;
	private JButton tilt14;
	private JButton tilt15;
	private JButton tilt16;
	private JButton tilt17;
	private JButton tilt18;
	private JButton tilt19;
	private JButton tilt20;
	private JButton tilt21;
	private JButton tilt22;
	private JButton tilt23;
	private JButton tilt24;
	private JButton tilt25;
	private JButton tilt26;
	private JButton tilt27;
	private JButton tilt28;
	private JButton tilt29;
	private JButton tilt30;
	private JButton tilt31;
	private JButton tilt32;
	private JButton tiltV1;
	private JButton tiltV2;
	private JButton tiltC;
	private JButton tiltV3;
	private JButton tiltV4;
	private JButton tiltH1;
	private JButton tiltH2;
	private JButton tiltH3;
	private JButton tiltH4;
	private JButton tiltH5;
	private JButton tiltH6;
	private JButton tiltH7;
	private JButton tiltH8;
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
		contentPane.add(getTilt1());
		contentPane.add(getTilt2());
		contentPane.add(getTilt3());
		contentPane.add(getTilt4());
		contentPane.add(getTilt5());
		contentPane.add(getTilt6());
		contentPane.add(getTilt7());
		contentPane.add(getTilt8());
		contentPane.add(getTilt9());
		contentPane.add(getTilt10());
		contentPane.add(getTilt11());
		contentPane.add(getTilt12());
		contentPane.add(getTilt13());
		contentPane.add(getTilt14());
		contentPane.add(getTilt15());
		contentPane.add(getTilt16());
		contentPane.add(getTilt17());
		contentPane.add(getTilt18());
		contentPane.add(getTilt19());
		contentPane.add(getTilt20());
		contentPane.add(getTilt21());
		contentPane.add(getTilt22());
		contentPane.add(getTilt23());
		contentPane.add(getTilt24());
		contentPane.add(getTilt25());
		contentPane.add(getTilt26());
		contentPane.add(getTilt27());
		contentPane.add(getTilt28());
		contentPane.add(getTilt29());
		contentPane.add(getTilt30());
		contentPane.add(getTilt31());
		contentPane.add(getTilt32());
		contentPane.add(getTiltV1());
		contentPane.add(getTiltV2());
		contentPane.add(getTiltC());
		contentPane.add(getTiltV3());
		contentPane.add(getTiltV4());
		contentPane.add(getTiltH1());
		contentPane.add(getTiltH2());
		contentPane.add(getTiltH3());
		contentPane.add(getTiltH4());
		contentPane.add(getTiltH5());
		contentPane.add(getTiltH6());
		contentPane.add(getTiltH7());
		contentPane.add(getTiltH8());
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
		
		
	}
	private JButton getTilt1() {
		if (tilt1 == null) {
			tilt1 = new JButton("");
			tilt1.setBounds(44, 47, 80, 80);
		}
		return tilt1;
	}
	private JButton getTilt2() {
		if (tilt2 == null) {
			tilt2 = new JButton("");
			tilt2.setBounds(123, 47, 80, 80);
		}
		return tilt2;
	}
	private JButton getTilt3() {
		if (tilt3 == null) {
			tilt3 = new JButton("");
			tilt3.setBounds(203, 47, 80, 80);
		}
		return tilt3;
	}
	private JButton getTilt4() {
		if (tilt4 == null) {
			tilt4 = new JButton("");
			tilt4.setBounds(281, 47, 80, 80);
		}
		return tilt4;
	}
	private JButton getTilt5() {
		if (tilt5 == null) {
			tilt5 = new JButton("");
			tilt5.setBounds(361, 47, 80, 80);
		}
		return tilt5;
	}
	private JButton getTilt6() {
		if (tilt6 == null) {
			tilt6 = new JButton("");
			tilt6.setBounds(440, 47, 80, 80);
		}
		return tilt6;
	}
	private JButton getTilt7() {
		if (tilt7 == null) {
			tilt7 = new JButton("");
			tilt7.setBounds(520, 47, 80, 80);
		}
		return tilt7;
	}
	private JButton getTilt8() {
		if (tilt8 == null) {
			tilt8 = new JButton("");
			tilt8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			tilt8.setBounds(598, 47, 80, 80);
		}
		return tilt8;
	}
	private JButton getTilt9() {
		if (tilt9 == null) {
			tilt9 = new JButton("");
			tilt9.setBounds(678, 47, 80, 80);
		}
		return tilt9;
	}
	private JButton getTilt10() {
		if (tilt10 == null) {
			tilt10 = new JButton("");
			tilt10.setBounds(758, 47, 80, 80);
		}
		return tilt10;
	}
	private JButton getTilt11() {
		if (tilt11 == null) {
			tilt11 = new JButton("");
			tilt11.setBounds(837, 47, 80, 80);
		}
		return tilt11;
	}
	private JButton getTilt12() {
		if (tilt12 == null) {
			tilt12 = new JButton("");
			tilt12.setBounds(837, 127, 80, 80);
		}
		return tilt12;
	}
	private JButton getTilt13() {
		if (tilt13 == null) {
			tilt13 = new JButton("");
			tilt13.setBounds(837, 206, 80, 80);
		}
		return tilt13;
	}
	private JButton getTilt14() {
		if (tilt14 == null) {
			tilt14 = new JButton("");
			tilt14.setBounds(837, 286, 80, 80);
		}
		return tilt14;
	}
	private JButton getTilt15() {
		if (tilt15 == null) {
			tilt15 = new JButton("");
			tilt15.setBounds(837, 365, 80, 80);
		}
		return tilt15;
	}
	private JButton getTilt16() {
		if (tilt16 == null) {
			tilt16 = new JButton("");
			tilt16.setBounds(837, 445, 80, 80);
		}
		return tilt16;
	}
	private JButton getTilt17() {
		if (tilt17 == null) {
			tilt17 = new JButton("");
			tilt17.setBounds(837, 524, 80, 80);
		}
		return tilt17;
	}
	private JButton getTilt18() {
		if (tilt18 == null) {
			tilt18 = new JButton("");
			tilt18.setBounds(758, 524, 80, 80);
		}
		return tilt18;
	}
	private JButton getTilt19() {
		if (tilt19 == null) {
			tilt19 = new JButton("");
			tilt19.setBounds(678, 524, 80, 80);
		}
		return tilt19;
	}
	private JButton getTilt20() {
		if (tilt20 == null) {
			tilt20 = new JButton("");
			tilt20.setBounds(598, 524, 80, 80);
		}
		return tilt20;
	}
	private JButton getTilt21() {
		if (tilt21 == null) {
			tilt21 = new JButton("");
			tilt21.setBounds(520, 524, 80, 80);
		}
		return tilt21;
	}
	private JButton getTilt22() {
		if (tilt22 == null) {
			tilt22 = new JButton("");
			tilt22.setBounds(440, 524, 80, 80);
		}
		return tilt22;
	}
	private JButton getTilt23() {
		if (tilt23 == null) {
			tilt23 = new JButton("");
			tilt23.setBounds(361, 524, 80, 80);
		}
		return tilt23;
	}
	private JButton getTilt24() {
		if (tilt24 == null) {
			tilt24 = new JButton("");
			tilt24.setBounds(281, 524, 80, 80);
		}
		return tilt24;
	}
	private JButton getTilt25() {
		if (tilt25 == null) {
			tilt25 = new JButton("");
			tilt25.setBounds(203, 524, 80, 80);
		}
		return tilt25;
	}
	private JButton getTilt26() {
		if (tilt26 == null) {
			tilt26 = new JButton("");
			tilt26.setBounds(123, 524, 80, 80);
		}
		return tilt26;
	}
	private JButton getTilt27() {
		if (tilt27 == null) {
			tilt27 = new JButton("");
			tilt27.setBounds(44, 524, 80, 80);
		}
		return tilt27;
	}
	private JButton getTilt28() {
		if (tilt28 == null) {
			tilt28 = new JButton("");
			tilt28.setBounds(44, 445, 80, 80);
		}
		return tilt28;
	}
	private JButton getTilt29() {
		if (tilt29 == null) {
			tilt29 = new JButton("");
			tilt29.setBounds(44, 365, 80, 80);
		}
		return tilt29;
	}
	private JButton getTilt30() {
		if (tilt30 == null) {
			tilt30 = new JButton("");
			tilt30.setBounds(44, 286, 80, 80);
		}
		return tilt30;
	}
	private JButton getTilt31() {
		if (tilt31 == null) {
			tilt31 = new JButton("");
			tilt31.setBounds(44, 206, 80, 80);
		}
		return tilt31;
	}
	private JButton getTilt32() {
		if (tilt32 == null) {
			tilt32 = new JButton("");
			tilt32.setBounds(44, 127, 80, 80);
		}
		return tilt32;
	}
	private JButton getTiltV1() {
		if (tiltV1 == null) {
			tiltV1 = new JButton("");
			tiltV1.setBounds(440, 127, 80, 80);
		}
		return tiltV1;
	}
	private JButton getTiltV2() {
		if (tiltV2 == null) {
			tiltV2 = new JButton("");
			tiltV2.setBounds(440, 206, 80, 80);
		}
		return tiltV2;
	}
	private JButton getTiltC() {
		if (tiltC == null) {
			tiltC = new JButton("");
			tiltC.setBounds(440, 286, 80, 80);
		}
		return tiltC;
	}
	private JButton getTiltV3() {
		if (tiltV3 == null) {
			tiltV3 = new JButton("");
			tiltV3.setBounds(440, 365, 80, 80);
		}
		return tiltV3;
	}
	private JButton getTiltV4() {
		if (tiltV4 == null) {
			tiltV4 = new JButton("");
			tiltV4.setBounds(440, 445, 80, 80);
		}
		return tiltV4;
	}
	private JButton getTiltH1() {
		if (tiltH1 == null) {
			tiltH1 = new JButton("");
			tiltH1.setBounds(123, 286, 80, 80);
		}
		return tiltH1;
	}
	private JButton getTiltH4() {
		if (tiltH4 == null) {
			tiltH4 = new JButton("");
			tiltH4.setBounds(361, 286, 80, 80);
		}
		return tiltH4;
	}
	private JButton getTiltH3() {
		if (tiltH3 == null) {
			tiltH3 = new JButton("");
			tiltH3.setBounds(281, 286, 80, 80);
		}
		return tiltH3;
	}
	private JButton getTiltH2() {
		if (tiltH2 == null) {
			tiltH2 = new JButton("");
			tiltH2.setBounds(203, 286, 80, 80);
		}
		return tiltH2;
	}
	private JButton getTiltH5() {
		if (tiltH5 == null) {
			tiltH5 = new JButton("");
			tiltH5.setBounds(520, 286, 80, 80);
		}
		return tiltH5;
	}
	private JButton getTiltH6() {
		if (tiltH6 == null) {
			tiltH6 = new JButton("");
			tiltH6.setBounds(598, 286, 80, 80);
		}
		return tiltH6;
	}
	private JButton getTiltH7() {
		if (tiltH7 == null) {
			tiltH7 = new JButton("");
			tiltH7.setBounds(678, 286, 80, 80);
		}
		return tiltH7;
	}
	private JButton getTiltH8() {
		if (tiltH8 == null) {
			tiltH8 = new JButton("");
			tiltH8.setBounds(758, 286, 80, 80);
		}
		return tiltH8;
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
}
