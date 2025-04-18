

import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardBattleForm extends JFrame {
    public JPanel panelStatus1P = new JPanel(null);
    public JLabel labelLife1P = new JLabel("Life");
    public JLabel labelLifeValue1P = new JLabel();
    public JLabel labelPower1P = new JLabel("Power");
    public JLabel labelPowerValue1P = new JLabel();
    public JLabel labelYellDeck1P = new JLabel("Yell");
    public JLabel labelYellDeckValue1P = new JLabel();
    public JLabel labelMainDeck1P = new JLabel("Deck");
    public JLabel labelMainDeckValue1P = new JLabel();
    public JLabel labelHand1P = new JLabel("Hand");
    public JLabel labelHandValue1P = new JLabel();
    public JLabel labelArchive1P = new JLabel("Archive");
    public JLabel labelArchiveValue1P = new JLabel();

    public JPanel panelStage1P = new JPanel(null);
    public JLabel labelLeader1P = new JLabel("Leader");
    public JLabel labelLeaderValue1P = new JLabel();
    public JLabel labelCenter1P = new JLabel("Center");
    public JLabel labelCenterValue1P = new JLabel();
    public JLabel labelCollab1P = new JLabel("Collab");
    public JLabel labelCollabValue1P = new JLabel();
    public JLabel labelBack11P = new JLabel("Back-1");
    public JLabel labelBack1Value1P = new JLabel();
    public JLabel labelBack21P = new JLabel("Back-2");
    public JLabel labelBack2Value1P = new JLabel();
    public JLabel labelBack31P = new JLabel("Back-3");
    public JLabel labelBack3Value1P = new JLabel();
    public JLabel labelBack41P = new JLabel("Back-4");
    public JLabel labelBack4Value1P = new JLabel();
    public JLabel labelBack51P = new JLabel("Back-5");
    public JLabel labelBack5Value1P = new JLabel();

    public JPanel panelStatus2P = new JPanel(null);
    public JLabel labelLife2P = new JLabel("Life");
    public JLabel labelLifeValue2P = new JLabel();
    public JLabel labelPower2P = new JLabel("Power");
    public JLabel labelPowerValue2P = new JLabel();
    public JLabel labelYellDeck2P = new JLabel("Yell");
    public JLabel labelYellDeckValue2P = new JLabel();
    public JLabel labelMainDeck2P = new JLabel("Deck");
    public JLabel labelMainDeckValue2P = new JLabel();
    public JLabel labelHand2P = new JLabel("Hand");
    public JLabel labelHandValue2P = new JLabel();
    public JLabel labelArchive2P = new JLabel("Archive");
    public JLabel labelArchiveValue2P = new JLabel();

    public JPanel panelStage2P = new JPanel(null);
    public JLabel labelLeader2P = new JLabel("Leader");
    public JLabel labelLeaderValue2P = new JLabel();
    public JLabel labelCenter2P = new JLabel("Center");
    public JLabel labelCenterValue2P = new JLabel();
    public JLabel labelCollab2P = new JLabel("Collab");
    public JLabel labelCollabValue2P = new JLabel();
    public JLabel labelBack12P = new JLabel("Back-1");
    public JLabel labelBack1Value2P = new JLabel();
    public JLabel labelBack22P = new JLabel("Back-2");
    public JLabel labelBack2Value2P = new JLabel();
    public JLabel labelBack32P = new JLabel("Back-3");
    public JLabel labelBack3Value2P = new JLabel();
    public JLabel labelBack42P = new JLabel("Back-4");
    public JLabel labelBack4Value2P = new JLabel();
    public JLabel labelBack52P = new JLabel("Back-5");
    public JLabel labelBack5Value2P = new JLabel();

    public String[] strings = {
            "one","two",
            "three","four",
            "five","six",
            "seven","eight",
            "nine","ten",
            "eleven","twelve"};
    public JList<String> listHand = new JList<>(strings);
    public JScrollPane scrollPaneHand = new JScrollPane(listHand);

    public JPanel panelAction = new JPanel();
    public JButton buttonCommand1 = new JButton("command1");
    public JButton buttonCommand2 = new JButton("command2");
    public JButton buttonCommand3 = new JButton("command3");
    public JButton buttonCommand4 = new JButton("command4");

    public JTextArea textAreaCard = new JTextArea();
    public JScrollPane scrollPaneCard = new JScrollPane(textAreaCard);

    public JTextArea textAreaLog = new JTextArea();
    public JScrollPane scrollPaneLog = new JScrollPane(textAreaLog);

    public JPanel panelOption = new JPanel();
    public JButton buttonOption = new JButton("Next");

    public JPanel panel = new JPanel();

    public CardBattleForm(){
        super("Holoca Battle Simulator");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(640,480);
        this.setResizable(false);

        panelStatus1P.setBorder(new TitledBorder("1P Status"));
        panelStatus1P.setBounds(5,5,150,90);
        labelLife1P.setBounds(10,20,45,20);
        labelLifeValue1P.setBounds(45,20,20,20);
        labelLifeValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelPower1P.setBounds(70,20,45,20);
        labelPowerValue1P.setBounds(120,20,20,20);
        labelPowerValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelYellDeck1P.setBounds(10,40,45,20);
        labelYellDeckValue1P.setBounds(45,40,20,20);
        labelYellDeckValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelMainDeck1P.setBounds(70,40,45,20);
        labelMainDeckValue1P.setBounds(120,40,20,20);
        labelMainDeckValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelHand1P.setBounds(10,60,45,20);
        labelHandValue1P.setBounds(45,60,20,20);
        labelHandValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelArchive1P.setBounds(70,60,45,20);
        labelArchiveValue1P.setBounds(120,60,20,20);
        labelArchiveValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        panelStatus1P.add(labelLife1P);
        panelStatus1P.add(labelLifeValue1P);
        panelStatus1P.add(labelPower1P);
        panelStatus1P.add(labelPowerValue1P);
        panelStatus1P.add(labelYellDeck1P);
        panelStatus1P.add(labelYellDeckValue1P);
        panelStatus1P.add(labelMainDeck1P);
        panelStatus1P.add(labelMainDeckValue1P);
        panelStatus1P.add(labelHand1P);
        panelStatus1P.add(labelHandValue1P);
        panelStatus1P.add(labelArchive1P);
        panelStatus1P.add(labelArchiveValue1P);
        this.add(panelStatus1P);

        panelStage1P.setBorder(new TitledBorder("1P Stage"));
        panelStage1P.setBounds(5,95,150,190);
        labelLeader1P.setBounds(10,20,45,20);
        labelLeaderValue1P.setBounds(55,20,85,20);
        labelLeaderValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelCenter1P.setBounds(10,40,45,20);
        labelCenterValue1P.setBounds(55,40,85,20);
        labelCenterValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelCollab1P.setBounds(10,60,45,20);
        labelCollabValue1P.setBounds(55,60,85,20);
        labelCollabValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack11P.setBounds(10,80,45,20);
        labelBack1Value1P.setBounds(55,80,85,20);
        labelBack1Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack21P.setBounds(10,100,45,20);
        labelBack2Value1P.setBounds(55,100,85,20);
        labelBack2Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack31P.setBounds(10,120,45,20);
        labelBack3Value1P.setBounds(55,120,85,20);
        labelBack3Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack41P.setBounds(10,140,45,20);
        labelBack4Value1P.setBounds(55,140,85,20);
        labelBack4Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack51P.setBounds(10,160,45,20);
        labelBack5Value1P.setBounds(55,160,85,20);
        labelBack5Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        panelStage1P.add(labelLeader1P);
        panelStage1P.add(labelLeaderValue1P);
        panelStage1P.add(labelCenter1P);
        panelStage1P.add(labelCenterValue1P);
        panelStage1P.add(labelCollab1P);
        panelStage1P.add(labelCollabValue1P);
        panelStage1P.add(labelBack11P);
        panelStage1P.add(labelBack1Value1P);
        panelStage1P.add(labelBack21P);
        panelStage1P.add(labelBack2Value1P);
        panelStage1P.add(labelBack31P);
        panelStage1P.add(labelBack3Value1P);
        panelStage1P.add(labelBack41P);
        panelStage1P.add(labelBack4Value1P);
        panelStage1P.add(labelBack51P);
        panelStage1P.add(labelBack5Value1P);
        this.add(panelStage1P);

        panelStatus2P.setBorder(new TitledBorder("2P Status"));
        panelStatus2P.setBounds(470,5,150,90);
        labelLife2P.setBounds(10,20,45,20);
        labelLifeValue2P.setBounds(45,20,20,20);
        labelLifeValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelPower2P.setBounds(70,20,45,20);
        labelPowerValue2P.setBounds(120,20,20,20);
        labelPowerValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelYellDeck2P.setBounds(10,40,45,20);
        labelYellDeckValue2P.setBounds(45,40,20,20);
        labelYellDeckValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelMainDeck2P.setBounds(70,40,45,20);
        labelMainDeckValue2P.setBounds(120,40,20,20);
        labelMainDeckValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelHand2P.setBounds(10,60,45,20);
        labelHandValue2P.setBounds(45,60,20,20);
        labelHandValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelArchive2P.setBounds(70,60,45,20);
        labelArchiveValue2P.setBounds(120,60,20,20);
        labelArchiveValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        panelStatus2P.add(labelLife2P);
        panelStatus2P.add(labelLifeValue2P);
        panelStatus2P.add(labelPower2P);
        panelStatus2P.add(labelPowerValue2P);
        panelStatus2P.add(labelYellDeck2P);
        panelStatus2P.add(labelYellDeckValue2P);
        panelStatus2P.add(labelMainDeck2P);
        panelStatus2P.add(labelMainDeckValue2P);
        panelStatus2P.add(labelHand2P);
        panelStatus2P.add(labelHandValue2P);
        panelStatus2P.add(labelArchive2P);
        panelStatus2P.add(labelArchiveValue2P);
        this.add(panelStatus2P);

        panelStage2P.setBorder(new TitledBorder("2P Stage"));
        panelStage2P.setBounds(470,95,150,190);
        labelLeader2P.setBounds(10,20,45,20);
        labelLeaderValue2P.setBounds(55,20,85,20);
        labelLeaderValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelCenter2P.setBounds(10,40,45,20);
        labelCenterValue2P.setBounds(55,40,85,20);
        labelCenterValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelCollab2P.setBounds(10,60,45,20);
        labelCollabValue2P.setBounds(55,60,85,20);
        labelCollabValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack12P.setBounds(10,80,45,20);
        labelBack1Value2P.setBounds(55,80,85,20);
        labelBack1Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack22P.setBounds(10,100,45,20);
        labelBack2Value2P.setBounds(55,100,85,20);
        labelBack2Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack32P.setBounds(10,120,45,20);
        labelBack3Value2P.setBounds(55,120,85,20);
        labelBack3Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack42P.setBounds(10,140,45,20);
        labelBack4Value2P.setBounds(55,140,85,20);
        labelBack4Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack52P.setBounds(10,160,45,20);
        labelBack5Value2P.setBounds(55,160,85,20);
        labelBack5Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        panelStage2P.add(labelLeader2P);
        panelStage2P.add(labelLeaderValue2P);
        panelStage2P.add(labelCenter2P);
        panelStage2P.add(labelCenterValue2P);
        panelStage2P.add(labelCollab2P);
        panelStage2P.add(labelCollabValue2P);
        panelStage2P.add(labelBack12P);
        panelStage2P.add(labelBack1Value2P);
        panelStage2P.add(labelBack22P);
        panelStage2P.add(labelBack2Value2P);
        panelStage2P.add(labelBack32P);
        panelStage2P.add(labelBack3Value2P);
        panelStage2P.add(labelBack42P);
        panelStage2P.add(labelBack4Value2P);
        panelStage2P.add(labelBack52P);
        panelStage2P.add(labelBack5Value2P);
        this.add(panelStage2P);

        scrollPaneHand.setBorder(new TitledBorder("Hand"));
        scrollPaneHand.setBounds(5,285,150,150);
        this.add(scrollPaneHand);

        textAreaCard.setEditable(false);
        scrollPaneCard.setBorder(new TitledBorder("Card Status"));
        scrollPaneCard.setBounds(160,95,305,190);
        this.add(scrollPaneCard);

        panelAction.setBorder(new TitledBorder("Commands"));
        panelAction.setBounds(160,5,305,90);
        panelAction.add(buttonCommand1);
        panelAction.add(buttonCommand2);
        panelAction.add(buttonCommand3);
        panelAction.add(buttonCommand4);
        this.add(panelAction);

        textAreaLog.setEditable(false);
        scrollPaneLog.setBorder(new TitledBorder("Battle Log"));
        scrollPaneLog.setBounds(160,285,305,150);
        this.add(scrollPaneLog);

        panelOption.setBorder(new TitledBorder("Option"));
        panelOption.setBounds(470,285,150,150);
        panelOption.add(buttonOption);
        this.add(panelOption);

        buttonOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
