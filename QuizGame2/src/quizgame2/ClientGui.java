package quizgame2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class QuizSwingTest extends JFrame implements ActionListener {


    String savedUserName;

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
    JLabel startHeaderLbl = new JLabel("Quiz Game");

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
        remove(panelEndScene);
        panelStartScene.add(startInputLbl);
        panelStartScene.add(startInputFld);
        panelStartScene.add(startPlayBtn);
        startPlayBtn.addActionListener(this);
        panelStartScene.add(startHeaderLbl);

        add(panelStartScene);
        //panelStartScene.setBackground(Color.getHSBColor(10, 30, 60));

        gui();
    }

    public void showWaitScene() {
        remove(panelStartScene);
        panelWaitScene.add(waitMessageLbl);

        add(panelWaitScene);
        //panelWaitScene.setBackground(Color.getHSBColor(10, 30, 60));

        gui();
    }

    public void showCategoryScene() {
        remove(panelWaitScene);
        remove(panelScoreScene);
        remove(panelQuestionScene);
        remove(panelStartScene);
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
        //panelCategoryScene.setBackground(Color.getHSBColor(10, 30, 60));

        gui();
    }

    public void showQuestionScene() {
        remove(panelCategoryScene);
        remove(panelScoreScene);
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
        //panelQuestionScene.setBackground(Color.getHSBColor(10, 30, 60));

        gui();
    }

    public void showScoreScene() {
        remove(panelQuestionScene);
        panelScoreScene.add(scoreHeaderLbl);
        panelScoreScene.add(scoreNamePlayer1);
        panelScoreScene.add(scoreScorePlayer1);
        panelScoreScene.add(scoreNamePlayer2);
        panelScoreScene.add(scoreScorePlayer2);
        panelScoreScene.add(scoreContinueBtn);
        scoreContinueBtn.addActionListener(this);


        add(panelScoreScene);
        //panelScoreScene.setBackground(Color.getHSBColor(10, 30, 60));

        gui();
    }

    public void showEndScene() {
        remove(panelQuestionScene);
        remove(panelScoreScene);
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
        //panelEndScene.setBackground(Color.getHSBColor(10, 30, 60));
        repaint();
        revalidate();
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

        if (e.getSource() == startPlayBtn) {
            savedUserName = startInputFld.getText();
            showWaitScene();
        }

        else if(e.getSource() == categoryBtn1) {  }

        else if(e.getSource() == categoryBtn2) { }

        else if(e.getSource() == categoryBtn3) { }

        else if(e.getSource() == categoryBtn4) { }

        else if(e.getSource() == categoryBtn5) { }

        else if(e.getSource() == categoryBtn6) { }

        else if(e.getSource() == questionAnswerBtn1) { }

        else if(e.getSource() == questionAnswerBtn2) { }

        else if(e.getSource() == questionAnswerBtn3) { }

        else if(e.getSource() == questionAnswerBtn4) { }

        else if(e.getSource() == scoreContinueBtn) {
            showCategoryScene();
        }

        else if(e.getSource() == endNewGameBtn) {
            showStartScene();
        }

        else if(e.getSource() == endExitGameBtn) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        QuizSwingTest launch = new QuizSwingTest();
        launch.showStartScene();
    }

}
