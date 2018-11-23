package quizgame2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ClientGui extends JFrame implements ActionListener{

    // Panels
    JPanel panelStartScene = new JPanel();
    JPanel panelWaitScene = new JPanel();
    JPanel panelCategoryScene = new JPanel();
    JPanel panelQuestionScene = new JPanel();
    JPanel panelScoreScene = new JPanel();
    JPanel panelEndScene = new JPanel();

    // StartScene
    JButton startPlayBtn = new JButton("Play!");
    JLabel startInputLbl = new JLabel("Username: ");
    JTextField startInputFld = new JTextField(20);

    // WaitScene
    JLabel waitMessageLbl = new JLabel("Waiting for new player to join...");

    // CategoryScene
    JLabel categoryMessageLbl = new JLabel("Choose Category: ");
    JButton categoryBtn1 = new JButton("1");
    JButton categoryBtn2 = new JButton("2");
    JButton categoryBtn3 = new JButton("3");
    JButton categoryBtn4 = new JButton("4");
    JButton categoryBtn5 = new JButton("5");
    JButton categoryBtn6 = new JButton("6");

    // QuestionScene
    JLabel questionMessageLbl = new JLabel("Question: ");
    JButton questionAnswerBtn1 = new JButton("1");
    JButton questionAnswerBtn2 = new JButton("2");
    JButton questionAnswerBtn3 = new JButton("3");
    JButton questionAnswerBtn4 = new JButton("4");

    // ScoreScene
    JLabel scoreHeaderLbl = new JLabel("Score");
    JLabel scoreNamePlayer1 = new JLabel("Player1: A ");
    JLabel scoreScorePlayer1 = new JLabel(" ? ");
    JLabel scoreNamePlayer2 = new JLabel("Player2: B ");
    JLabel scoreScorePlayer2 = new JLabel(" ? ");
    JButton scoreContinueBtn = new JButton("Continue");

    // EndScene
    JLabel endMessageLbl = new JLabel("Game is over. Result: ");
    JLabel endNamePlayer1 = new JLabel("Player1: A ");
    JLabel endScorePlayer1 = new JLabel(" ? ");
    JLabel endNamePlayer2 = new JLabel("Player 2: B");
    JLabel endScorePlayer2 = new JLabel(" ? ");
    JButton endNewGameBtn = new JButton("New Game");
    JButton endExitGameBtn = new JButton("Exit Game");


    public void showStartScene() {
        panelStartScene.add(startInputLbl);
        panelStartScene.add(startInputFld);
        panelStartScene.add(startPlayBtn);
        startPlayBtn.addActionListener(this);

        add(panelStartScene);
        panelStartScene.setBackground(java.awt.Color.red);

        gui();
    }

    public void showWaitScene() {
        panelWaitScene.add(waitMessageLbl);

        add(panelWaitScene);
        panelWaitScene.setBackground(Color.GREEN);

        gui();
    }

    public void showCategoryScene() {
        panelCategoryScene.add(categoryMessageLbl);
        panelCategoryScene.add(categoryBtn1);
        categoryBtn1.addActionListener(this);
        panelCategoryScene.add(categoryBtn2);
        categoryBtn2.addActionListener(this);
        panelCategoryScene.add(categoryBtn3);
        categoryBtn3.addActionListener(this);
        panelCategoryScene.add(categoryBtn4);
        categoryBtn4.addActionListener(this);
        panelCategoryScene.add(categoryBtn5);
        categoryBtn5.addActionListener(this);
        panelCategoryScene.add(categoryBtn6);
        categoryBtn6.addActionListener(this);

        add(panelCategoryScene);
        panelCategoryScene.setBackground(Color.YELLOW);

        gui();
    }

    public void showQuestionScene() {
        panelQuestionScene.add(questionMessageLbl);
        panelQuestionScene.add(questionAnswerBtn1);
        questionAnswerBtn1.addActionListener(this);
        panelQuestionScene.add(questionAnswerBtn2);
        questionAnswerBtn2.addActionListener(this);
        panelQuestionScene.add(questionAnswerBtn3);
        questionAnswerBtn3.addActionListener(this);
        panelQuestionScene.add(questionAnswerBtn4);
        questionAnswerBtn4.addActionListener(this);

        add(panelQuestionScene);
        panelQuestionScene.setBackground(Color.ORANGE);

        gui();
    }

    public void showScoreScene() {
        panelScoreScene.add(scoreHeaderLbl);
        panelScoreScene.add(scoreNamePlayer1);
        panelScoreScene.add(scoreScorePlayer1);
        panelScoreScene.add(scoreNamePlayer2);
        panelScoreScene.add(scoreScorePlayer2);
        panelScoreScene.add(scoreContinueBtn);
        scoreContinueBtn.addActionListener(this);


        add(panelScoreScene);
        panelScoreScene.setBackground(Color.gray);

        gui();
    }

    public void showEndScene() {
        panelEndScene.add(endMessageLbl);
        panelEndScene.add(endNamePlayer1);
        panelEndScene.add(endScorePlayer1);
        panelEndScene.add(endNamePlayer2);
        panelEndScene.add(endScorePlayer2);
        panelEndScene.add(endNewGameBtn);
        endNewGameBtn.addActionListener(this);
        panelEndScene.add(endExitGameBtn);
        endExitGameBtn.addActionListener(this);

        add(panelEndScene);
        panelEndScene.setBackground(Color.magenta);

        gui();
    }


    public void gui() {
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        repaint();
        revalidate();

    }

    public void actionPerformed (ActionEvent e) {

        if (e.getSource() == startPlayBtn) { System.out.println("testing");}

        else if(e.getSource() == categoryBtn1) {System.out.println("testing"); }

        else if(e.getSource() == categoryBtn2) {System.out.println("testing");}

        else if(e.getSource() == categoryBtn3) {System.out.println("testing");}

        else if(e.getSource() == categoryBtn4) {System.out.println("testing"); }

        else if(e.getSource() == categoryBtn5) {System.out.println("testing");}

        else if(e.getSource() == categoryBtn6) {System.out.println("testing");}

        else if(e.getSource() == questionAnswerBtn1) { System.out.println("testing");}

        else if(e.getSource() == questionAnswerBtn2) {System.out.println("testing");}

        else if(e.getSource() == questionAnswerBtn3) { System.out.println("testing");}

        else if(e.getSource() == questionAnswerBtn4) {System.out.println("testing"); }

        else if(e.getSource() == scoreContinueBtn) { System.out.println("testing"); }

        else if(e.getSource() == endNewGameBtn) {System.out.println("testing");}

        else if(e.getSource() == endExitGameBtn) {System.out.println("testing");}

    }

    public static void main(String[] args) {
        ClientGui launch = new ClientGui();
        launch.showStartScene();
    }

}