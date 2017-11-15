package chat.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import chat.controller.ChatController;
import java.awt.Color;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	
	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		
		chatButton = new JButton("chat");
		chatArea = new JTextArea(10, 25);
		inputField = new JTextField(20);
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(inputField);
		this.add(chatArea);
	}
	
	private void  setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 72, SpringLayout.SOUTH, chatArea);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -66, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatArea, -68, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, inputField, 10, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}

}
