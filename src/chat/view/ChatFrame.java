package chat.view;

import chat.controller.ChatController;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	private ChatController appController;
//	private ChatPanel appPanel;
	
	public ChatFrame(ChatController appController)
	{
		super();
		this.appController = appController;
//		appPanel = new ChatPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
//		this.setContentPane(appPanel);
		this.setTitle("Chatbot 2017");
		this.setVisible(true);
		this.setResizable(false);
		this.setVisible(true);
	}
}
