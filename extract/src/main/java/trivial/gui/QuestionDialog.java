package trivial.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import es.uniovi.asw.quizStructure.Answer;
import es.uniovi.asw.quizStructure.Question;

public class QuestionDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4227412559369525920L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblQuestion;
	private JRadioButton[] jB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			QuestionDialog dialog = new QuestionDialog(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param question 
	 */
	public QuestionDialog(Question question) {
		setBounds(100, 100, 923, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
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
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
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
	}
	
}
