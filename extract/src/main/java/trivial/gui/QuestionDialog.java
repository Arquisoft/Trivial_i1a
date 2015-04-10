package trivial.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import es.uniovi.asw.quizStructure.Answer;
import es.uniovi.asw.quizStructure.Question;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;

import trivial.logic.Player;

public class QuestionDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4227412559369525920L;
	private final JPanel contentPanel = new JPanel();
	private JRadioButton[] jB;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Question question;
	private Player player;

	/**
	 * Create the dialog.
	 * @param question 
	 */
	public QuestionDialog(Question question, Player player) {
		this.player = player;
		this.question = question;
		
		setBounds(100, 100, 923, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblQuestion = new JLabel(question.title);
		lblQuestion.setBounds(74, 11, 234, 14);
		contentPanel.add(lblQuestion);
		
		
			int counter=0;
			
			
			for(Answer answer: question.answers)
			{
				
				generateRD(answer, counter);
				contentPanel.add(jB[counter]);
			}
		


		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						respondAnswer();
					}

				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void generateRD(Answer answer, int count) 
	{
		JRadioButton rdbtnRespuesta = new JRadioButton();
		
		rdbtnRespuesta = new JRadioButton(answer.getText());
		rdbtnRespuesta.setBounds(28, 300+(25*count), 179, 31);
		
		JRadioButton temp = new JRadioButton(answer.getText());
		temp.setBounds(28, 300+(25*count), 179, 31);
		
		jB[count]=temp;
		buttonGroup.add(temp);
	}
	
	private void respondAnswer() {
		
		 for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();
	            if(button.isSelected() && button.getText().equals(question.getTrueAnswer()))
			{
				player.setScore(question.getCategory());
			}
		
		 }
	}
}
