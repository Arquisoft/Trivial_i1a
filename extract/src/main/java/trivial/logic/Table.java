package trivial.logic;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import serializer.ParserBuilder;
import es.uniovi.asw.quizStructure.Question;


public class Table extends JFrame {
	
	private Map<Player, JButton> positions = new HashMap<Player, JButton>();

	private ArrayList<Player> players = new ArrayList<Player>();
	
	private JPanel contentPane;
	private JButton Dice;
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
	private Game game;
	
	private JButton[][] board = new JButton[7][9];
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btn_0_1;
	private JButton btn_0_0;
	private JButton btn_0_2;
	private JButton btn_0_3;
	private JButton btn_0_4;
	private JButton btn_0_5;
	private JButton btn_0_7;
	private JButton btn_0_6;
	private JButton btn_0_8;
	private JButton button_2;
	private JButton btn_2_0;
	private JButton btn_1_8;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton btn_5_0;
	private JButton btn_4_8;
	private JButton btn_5_4;
	private JButton button_12;
	private JButton button_13;
	private JButton btn_4_4;
	private JButton button_15;
	private JButton button_16;
	private JButton btn_3_3;
	private JButton btn_3_1;
	private JButton button_19;
	private JButton button_20;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	private JButton btn_5_8;
	private JButton btn_6_0;
	private JButton btn_6_2;
	private JButton btn_6_1;
	private JButton button_28;
	private JButton btn_4_0;
	private JButton btn_3_8;
	private JButton btn_3_7;
	private JButton btn_3_6;
	private JButton btn_3_5;
	private JButton btn_3_4;
	private JButton btn_3_2;
	private JButton button_36;
	private JButton btn_3_0;
	private JButton btn_2_8;
	private JButton button_39;
	private JButton button_40;
	private JButton btn_1_0;
	private JButton btn_1_4;
	private JButton button_43;
	private JButton button_44;
	private JButton btn_2_4;
	private JButton button_46;
	private JButton button_47;
	private JButton button_48;
	private JButton btn_6_3;
	private JButton btn_6_4;
	private JButton btn_6_5;
	private JButton btn_6_6;
	private JButton btn_6_7;
	private JButton btn_6_8;
	private JTextField txDado;

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
	public static List<Question> cargarPreguntas() throws IOException{
		String inputFilePath = "questions.gift";
		String inputFileFormat = "gift";
		List<Question> questions = ParserBuilder.build(inputFilePath,
						inputFileFormat).parse();
		return questions;
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Table() throws IOException {
		//TODO recoger array de jugadores llamada players
		//TODO recoger array de preguntas llamada questions
		Game game = new Game(players, cargarPreguntas(), board);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getDice());
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
		contentPane.add(getTxDado());
		generarMatriz();
		
		
	}
	private JButton getDice() {
		if (Dice == null) {
			Dice = new JButton("");
			Dice.addActionListener(new ActionListener() {
				private int DiceNumber;
				

				public void actionPerformed(ActionEvent e) {
				game.getRoll();
				}
			});
			Dice.setBounds(974, 49, 151, 132);
		}
		return Dice;
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
			panel.add(getBtn_0_0());
			panel.add(getBtn_0_1());
			panel.add(getBtn_0_2());
			panel.add(getBtn_0_3());
			panel.add(getBtn_0_4());
			panel.add(getBtn_0_5());
			panel.add(getBtn_0_6());
			panel.add(getBtn_0_7());
			panel.add(getBtn_0_8());
			panel.add(getBtn_1_0());
			panel.add(getButton_39());
			panel.add(getButton_44());
			panel.add(getButton_43());
			panel.add(getBtn_1_4());
			panel.add(getButton_36());
			panel.add(getButton_2());
			panel.add(getBtnNewButton());
			panel.add(getBtn_1_8());
			panel.add(getBtn_2_0());
			panel.add(getButton_48());
			panel.add(getButton_47());
			panel.add(getButton_46());
			panel.add(getBtn_2_4());
			panel.add(getButton_20());
			panel.add(getButton_40());
			panel.add(getButton_19());
			panel.add(getBtn_2_8());
			panel.add(getBtn_3_0());
			panel.add(getBtn_3_1());
			panel.add(getBtn_3_2());
			panel.add(getBtn_3_3());
			panel.add(getBtn_3_4());
			panel.add(getBtn_3_5());
			panel.add(getBtn_3_6());
			panel.add(getBtn_3_7());
			panel.add(getBtn_3_8());
			panel.add(getBtn_4_0());
			panel.add(getButton_28());
			panel.add(getButton_16());
			panel.add(getButton_15());
			panel.add(getBtn_4_4());
			panel.add(getButton_7());
			panel.add(getButton_6());
			panel.add(getButton_5());
			panel.add(getBtn_4_8());
			panel.add(getBtn_5_0());
			panel.add(getButton_8());
			panel.add(getButton_13());
			panel.add(getButton_12());
			panel.add(getBtn_5_4());
			panel.add(getButton_22());
			panel.add(getButton_21());
			panel.add(getButton_23());
			panel.add(getBtn_5_8());
			panel.add(getBtn_6_0());
			panel.add(getBtn_6_1());
			panel.add(getBtn_6_2());
			panel.add(getBtn_6_3());
			panel.add(getBtn_6_4());
			panel.add(getBtn_6_5());
			panel.add(getBtn_6_6());
			panel.add(getBtn_6_7());
			panel.add(getBtn_6_8());
			generarMatriz();
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
	private JButton getBtn_0_1() {
		if (btn_0_1 == null) {
			
			btn_0_1 = new JButton("");
			btn_0_1.setName("btn_0_1");
		}
		return btn_0_1;
	}
	private JButton getBtn_0_0() {
		if (btn_0_0 == null) {
			btn_0_0 = new JButton("");
			btn_0_0.setName("btn_0_0");
			btn_0_0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
		}
		return btn_0_0;
	}
	private JButton getBtn_0_2() {
		if (btn_0_2 == null) {
			btn_0_2 = new JButton("");
			btn_0_2.setName("btn_0_2");
		}
		return btn_0_2;
	}
	private JButton getBtn_0_3() {
		if (btn_0_3 == null) {
			btn_0_3 = new JButton("");
			btn_0_3.setName("btn_0_3");
		}
		return btn_0_3;
	}
	private JButton getBtn_0_4() {
		if (btn_0_4 == null) {
			btn_0_4 = new JButton("");
			btn_0_4.setName("btn_0_4");
		}
		return btn_0_4;
	}
	private JButton getBtn_0_5() {
		if (btn_0_5 == null) {
			btn_0_5 = new JButton("");
			btn_0_5.setName("btn_0_5");
		}
		return btn_0_5;
	}
	private JButton getBtn_0_7() {
		if (btn_0_7 == null) {
			btn_0_7 = new JButton("");
			btn_0_7.setName("btn_0_7");
		}
		return btn_0_7;
	}
	private JButton getBtn_0_6() {
		if (btn_0_6 == null) {
			btn_0_6 = new JButton("");
			btn_0_6.setName("btn_0_6");
		}
		return btn_0_6;
	}
	private JButton getBtn_0_8() {
		if (btn_0_8 == null) {
			btn_0_8 = new JButton("");
			btn_0_8.setName("btn_0_8");
		}
		return btn_0_8;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("");
			button_2.setEnabled(false);
			button_2.setVisible(false);
		}
		return button_2;
	}
	private JButton getBtn_2_0() {
		if (btn_2_0 == null) {
			btn_2_0 = new JButton("");
			btn_2_0.setName("btn_2_0");
		}
		return btn_2_0;
	}
	private JButton getBtn_1_8() {
		if (btn_1_8 == null) {
			btn_1_8 = new JButton("");
			btn_1_8.setName("btn_1_8");
		}
		return btn_1_8;
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
	private JButton getBtn_5_0() {
		if (btn_5_0 == null) {
			btn_5_0 = new JButton("");
			btn_5_0.setName("btn_5_0");
		}
		return btn_5_0;
	}
	private JButton getBtn_4_8() {
		if (btn_4_8 == null) {
			btn_4_8 = new JButton("");
			btn_4_8.setName("btn_4_8");
		}
		return btn_4_8;
	}
	private JButton getBtn_5_4() {
		if (btn_5_4 == null) {
			btn_5_4 = new JButton("");
			btn_5_4.setName("btn_5_4");
		}
		return btn_5_4;
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
	private JButton getBtn_4_4() {
		if (btn_4_4 == null) {
			btn_4_4 = new JButton("");
			btn_4_4.setName("btn_4_4");
		}
		return btn_4_4;
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
	private JButton getBtn_3_3() {
		if (btn_3_3 == null) {
			btn_3_3 = new JButton("");
			btn_3_3.setName("btn_3_3");
		}
		return btn_3_3;
	}
	private JButton getBtn_3_1() {
		if (btn_3_1 == null) {
			btn_3_1 = new JButton("");
		}
		return btn_3_1;
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
	private JButton getBtn_5_8() {
		if (btn_5_8 == null) {
			btn_5_8 = new JButton("");
			btn_5_8.setName("btn_5_8");
		}
		return btn_5_8;
	}
	private JButton getBtn_6_0() {
		if (btn_6_0 == null) {
			btn_6_0 = new JButton("");
			btn_6_0.setName("btn_6_0");
		}
		return btn_6_0;
	}
	private JButton getBtn_6_2() {
		if (btn_6_2 == null) {
			btn_6_2 = new JButton("");
			btn_6_2.setName("btn_6_2");
		}
		return btn_6_2;
	}
	private JButton getBtn_6_1() {
		if (btn_6_1 == null) {
			btn_6_1 = new JButton("");
			btn_6_1.setName("btn_6_1");
		}
		return btn_6_1;
	}
	private JButton getButton_28() {
		if (button_28 == null) {
			button_28 = new JButton("");
			button_28.setEnabled(false);
			button_28.setVisible(false);
		}
		return button_28;
	}
	private JButton getBtn_4_0() {
		if (btn_4_0 == null) {
			btn_4_0 = new JButton("");
			btn_4_0.setName("btn_4_0");
		}
		return btn_4_0;
	}
	private JButton getBtn_3_8() {
		if (btn_3_8 == null) {
			btn_3_8 = new JButton("");
			btn_3_8.setName("btn_3_8");
		}
		return btn_3_8;
	}
	private JButton getBtn_3_7() {
		if (btn_3_7 == null) {
			btn_3_7 = new JButton("");
			btn_3_7.setName("btn_3_7");
		}
		return btn_3_7;
	}
	private JButton getBtn_3_6() {
		if (btn_3_6 == null) {
			btn_3_6 = new JButton("");
			btn_3_6.setName("btn_3_6");
		}
		return btn_3_6;
	}
	private JButton getBtn_3_5() {
		if (btn_3_5 == null) {
			btn_3_5 = new JButton("");
			btn_3_5.setName("btn_3_5");
		}
		return btn_3_5;
	}
	private JButton getBtn_3_4() {
		if (btn_3_4 == null) {
			btn_3_4 = new JButton("");
			btn_3_4.setName("btn_3_4");
		}
		return btn_3_4;
	}
	private JButton getBtn_3_2() {
		if (btn_3_2 == null) {
			btn_3_2 = new JButton("");
			btn_3_2.setName("btn_3_2");
		}
		return btn_3_2;
	}
	private JButton getButton_36() {
		if (button_36 == null) {
			button_36 = new JButton("");
			button_36.setEnabled(false);
			button_36.setVisible(false);
		}
		return button_36;
	}
	private JButton getBtn_3_0() {
		if (btn_3_0 == null) {
			btn_3_0 = new JButton("");
			btn_3_0.setName("btn_3_0");
		}
		return btn_3_0;
	}
	private JButton getBtn_2_8() {
		if (btn_2_8 == null) {
			btn_2_8 = new JButton("");
			btn_2_8.setName("btn_2_8");
		}
		return btn_2_8;
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
	private JButton getBtn_1_0() {
		if (btn_1_0 == null) {
			btn_1_0 = new JButton("");
			btn_1_0.setName("btn_1_0");
		}
		return btn_1_0;
	}
	private JButton getBtn_1_4() {
		if (btn_1_4 == null) {
			btn_1_4 = new JButton("");
			btn_1_4.setName("btn_1_4");
		}
		return btn_1_4;
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
	private JButton getBtn_2_4() {
		if (btn_2_4 == null) {
			btn_2_4 = new JButton("");
			btn_2_4.setName("btn_2_4");
		}
		return btn_2_4;
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
	private JButton getBtn_6_3() {
		if (btn_6_3 == null) {
			btn_6_3 = new JButton("");
			btn_6_3.setName("btn_6_3");
		}
		return btn_6_3;
	}
	private JButton getBtn_6_4() {
		if (btn_6_4 == null) {
			btn_6_4 = new JButton("");
			btn_6_4.setName("btn_6_4");
		}
		return btn_6_4;
	}
	private JButton getBtn_6_5() {
		if (btn_6_5 == null) {
			btn_6_5 = new JButton("");
			btn_6_5.setName("btn_6_5");
		}
		return btn_6_5;
	}
	private JButton getBtn_6_6() {
		if (btn_6_6 == null) {
			btn_6_6 = new JButton("");
			btn_6_6.setName("btn_6_6");
		}
		return btn_6_6;
	}
	private JButton getBtn_6_7() {
		if (btn_6_7 == null) {
			btn_6_7 = new JButton("");
			btn_6_7.setName("btn_6_7");
		}
		return btn_6_7;
	}
	private JButton getBtn_6_8() {
		if (btn_6_8 == null) {
			btn_6_8 = new JButton("");
			btn_6_8.setName("btn_6_8");
		}
		return btn_6_8;
	}
	private JTextField getTxDado() {
		if (txDado == null) {
			txDado = new JTextField();
			txDado.setEnabled(false);
			txDado.setEditable(false);
			txDado.setBounds(1135, 77, 119, 53);
			txDado.setColumns(10);
		}
		return txDado;
	}
	
	public void generarMatriz(){
		Component[] cp = panel.getComponents();
		for (int i = 0; i < cp.length; i++) {
			if(cp[i].getName()!=null){
			String[] temp = cp[i].getName().split("_");
			int j = Integer.parseInt(temp[1]);
			int k = Integer.parseInt(temp[2]);
			System.out.println("Coordinates: "+j+","+k+"  Button:"+cp[i].getName());
			
			board[j][k]= (JButton) cp[i];
			System.out.println(board[j][k].getName());
			}
		}
		
		
	}
}
