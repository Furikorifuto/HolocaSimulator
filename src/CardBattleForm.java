

import cardApi.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CardBattleForm extends JFrame{
    public String count = "start";
    public int nextTime = 100;
    public Timer timer;
    public boolean reDrawFlag = false;
    public boolean timerStopFlag = false;
    public boolean is2p = false;
    public BaseDeck baseDeck1P;
    public BaseDeck baseDeck2P;
    //stage
    public LeaderCard leader1P;
    public LeaderCard leader2P;
    public List<BaseCard> hand1p = new ArrayList<>();
    public List<BaseCard> hand2p = new ArrayList<>();
    public MemberCard center1P;
    public MemberCard center2P;
    public MemberCard collab1P;
    public MemberCard collab2P;
    public MemberCard[] back_1P;
    public MemberCard[] back_2P;
    //swing
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

    public DefaultListModel<BaseCard> listModel = new DefaultListModel<>();
    public JList<BaseCard> listHand = new JList<>(listModel);
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

    public CardBattleForm() {
        super("Holoca Battle Simulator");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(640, 480);
        this.setResizable(false);

        this.mainDeck1PCreate();
        this.mainDeck2PCreate();

        panelStatus1P.setBorder(new TitledBorder("1P Status"));
        panelStatus1P.setBounds(5, 5, 150, 90);
        labelLife1P.setBounds(10, 20, 45, 20);
        labelLifeValue1P.setBounds(45, 20, 20, 20);
        labelLifeValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelPower1P.setBounds(70, 20, 45, 20);
        labelPowerValue1P.setBounds(120, 20, 20, 20);
        labelPowerValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelYellDeck1P.setBounds(10, 40, 45, 20);
        labelYellDeckValue1P.setBounds(45, 40, 20, 20);
        labelYellDeckValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelMainDeck1P.setBounds(70, 40, 45, 20);
        labelMainDeckValue1P.setBounds(120, 40, 20, 20);
        labelMainDeckValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelHand1P.setBounds(10, 60, 45, 20);
        labelHandValue1P.setBounds(45, 60, 20, 20);
        labelHandValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelArchive1P.setBounds(70, 60, 45, 20);
        labelArchiveValue1P.setBounds(120, 60, 20, 20);
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
        panelStage1P.setBounds(5, 95, 150, 190);
        labelLeader1P.setBounds(10, 20, 45, 20);
        labelLeaderValue1P.setBounds(55, 20, 85, 20);
        labelLeaderValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelCenter1P.setBounds(10, 40, 45, 20);
        labelCenterValue1P.setBounds(55, 40, 85, 20);
        labelCenterValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelCollab1P.setBounds(10, 60, 45, 20);
        labelCollabValue1P.setBounds(55, 60, 85, 20);
        labelCollabValue1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack11P.setBounds(10, 80, 45, 20);
        labelBack1Value1P.setBounds(55, 80, 85, 20);
        labelBack1Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack21P.setBounds(10, 100, 45, 20);
        labelBack2Value1P.setBounds(55, 100, 85, 20);
        labelBack2Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack31P.setBounds(10, 120, 45, 20);
        labelBack3Value1P.setBounds(55, 120, 85, 20);
        labelBack3Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack41P.setBounds(10, 140, 45, 20);
        labelBack4Value1P.setBounds(55, 140, 85, 20);
        labelBack4Value1P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack51P.setBounds(10, 160, 45, 20);
        labelBack5Value1P.setBounds(55, 160, 85, 20);
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
        panelStatus2P.setBounds(470, 5, 150, 90);
        labelLife2P.setBounds(10, 20, 45, 20);
        labelLifeValue2P.setBounds(45, 20, 20, 20);
        labelLifeValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelPower2P.setBounds(70, 20, 45, 20);
        labelPowerValue2P.setBounds(120, 20, 20, 20);
        labelPowerValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelYellDeck2P.setBounds(10, 40, 45, 20);
        labelYellDeckValue2P.setBounds(45, 40, 20, 20);
        labelYellDeckValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelMainDeck2P.setBounds(70, 40, 45, 20);
        labelMainDeckValue2P.setBounds(120, 40, 20, 20);
        labelMainDeckValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelHand2P.setBounds(10, 60, 45, 20);
        labelHandValue2P.setBounds(45, 60, 20, 20);
        labelHandValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelArchive2P.setBounds(70, 60, 45, 20);
        labelArchiveValue2P.setBounds(120, 60, 20, 20);
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
        panelStage2P.setBounds(470, 95, 150, 190);
        labelLeader2P.setBounds(10, 20, 45, 20);
        labelLeaderValue2P.setBounds(55, 20, 85, 20);
        labelLeaderValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelCenter2P.setBounds(10, 40, 45, 20);
        labelCenterValue2P.setBounds(55, 40, 85, 20);
        labelCenterValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelCollab2P.setBounds(10, 60, 45, 20);
        labelCollabValue2P.setBounds(55, 60, 85, 20);
        labelCollabValue2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack12P.setBounds(10, 80, 45, 20);
        labelBack1Value2P.setBounds(55, 80, 85, 20);
        labelBack1Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack22P.setBounds(10, 100, 45, 20);
        labelBack2Value2P.setBounds(55, 100, 85, 20);
        labelBack2Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack32P.setBounds(10, 120, 45, 20);
        labelBack3Value2P.setBounds(55, 120, 85, 20);
        labelBack3Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack42P.setBounds(10, 140, 45, 20);
        labelBack4Value2P.setBounds(55, 140, 85, 20);
        labelBack4Value2P.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelBack52P.setBounds(10, 160, 45, 20);
        labelBack5Value2P.setBounds(55, 160, 85, 20);
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
        scrollPaneHand.setBounds(5, 285, 150, 150);
        this.add(scrollPaneHand);

        textAreaCard.setEditable(false);
        scrollPaneCard.setBorder(new TitledBorder("Card Status"));
        scrollPaneCard.setBounds(160, 95, 305, 190);
        this.add(scrollPaneCard);

        panelAction.setBorder(new TitledBorder("Commands"));
        panelAction.setBounds(160, 5, 305, 90);
        buttonCommand1.setVisible(false);
        buttonCommand2.setVisible(false);
        buttonCommand3.setVisible(false);
        buttonCommand4.setVisible(false);
        panelAction.add(buttonCommand1);
        panelAction.add(buttonCommand2);
        panelAction.add(buttonCommand3);
        panelAction.add(buttonCommand4);
        this.add(panelAction);

        buttonCommand1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //redraw
                if(Objects.equals(buttonCommand1.getText(), "ReDraw")){
                    if(is2p) {
                        AllHandToDeck(true);
                        mainDeckShuffle(true);
                    }else{
                        AllHandToDeck(false);
                        mainDeckShuffle(false);
                    }
                    reDrawFlag = true;
                    timerStopFlag = false;
                    buttonCommand1.setVisible(false);
                    buttonCommand2.setVisible(false);
                }
            }
        });
        buttonCommand2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(buttonCommand2.getText(), "Continue")){
                    timerStopFlag = false;
                    buttonCommand1.setVisible(false);
                    buttonCommand2.setVisible(false);
                }
            }
        });
        textAreaLog.setEditable(false);
        scrollPaneLog.setBorder(new TitledBorder("Battle Log"));
        scrollPaneLog.setBounds(160, 285, 305, 150);
        this.add(scrollPaneLog);

        panelOption.setBorder(new TitledBorder("Option"));
        panelOption.setBounds(470, 285, 150, 150);
        panelOption.add(buttonOption);
        this.add(panelOption);
        this.add(panel);

        this.setLocationRelativeTo(null);
        this.setVisible(true);

        timer = new Timer(nextTime, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!timerStopFlag){
                    switch (count) {
                        case "start":
                            mainDeckShuffle(false);
                            mainDeckShuffle(true);
                            yellDeckShuffle(false);
                            yellDeckShuffle(true);
                            leaderCardPlace();
                            drawCard(false,7);
                            drawCard(true,7);
                            setCount(1000,"firstDraw");
                            break;
                        case "reDraw":
                            while (!hasDebutInHand(true)) {
                                AllHandToDeck(true);
                                drawCard(true,7);
                            }
                            while (!hasDebutInHand(false)) {
                                AllHandToDeck(false);
                                drawCard(false,7);
                            }
                            setCount(1000,"placeDebutCard");
                            break;
                        case "placeDebutCard":
                            break;
                    }
                }
            }
        });
        timer.start();
    }
    public void mainDeck1PCreate() {
        baseDeck1P = new BaseDeck(RegisterCards.LUNA);
        List<BaseCard> list = new ArrayList<>();
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_90);
        list.addLast(RegisterCards.LUNA_80);
        list.addLast(RegisterCards.LUNA_80);
        list.addLast(RegisterCards.LUNA_80);
        list.addLast(RegisterCards.LUNA_80);
        list.addLast(RegisterCards.LUNA_150);
        list.addLast(RegisterCards.LUNA_150);
        list.addLast(RegisterCards.LUNA_150);
        list.addLast(RegisterCards.LUNA_150);
        list.addLast(RegisterCards.LUNA_120);
        list.addLast(RegisterCards.LUNA_120);
        list.addLast(RegisterCards.LUNA_120);
        list.addLast(RegisterCards.LUNA_120);
        list.addLast(RegisterCards.LUNA_110);
        list.addLast(RegisterCards.LUNA_110);
        list.addLast(RegisterCards.LUNA_180);
        list.addLast(RegisterCards.LUNA_180);
        list.addLast(RegisterCards.LUNA_180);
        list.addLast(RegisterCards.LUNA_180);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.OLD_PC);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.INTIMIDATION);
        list.addLast(RegisterCards.MIKORONE24);
        list.addLast(RegisterCards.MIKORONE24);
        list.addLast(RegisterCards.FORTH);
        list.addLast(RegisterCards.FORTH);
        list.addLast(RegisterCards.FORTH);
        list.addLast(RegisterCards.LUKNIGHT);
        list.addLast(RegisterCards.LUKNIGHT);
        list.addLast(RegisterCards.LUKNIGHT);
        list.addLast(RegisterCards.LUKNIGHT);
        baseDeck1P.setMemberCards(list);
        List<YellCard> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list2.addLast(RegisterCards.WHITE_YELL);
        }
        baseDeck1P.setYellCards(list2);
    }
    public void mainDeck2PCreate(){
        baseDeck2P = new BaseDeck(RegisterCards.MIKO);
        List<BaseCard> list = new ArrayList<>();
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_100);
        list.addLast(RegisterCards.MIKO_80);
        list.addLast(RegisterCards.MIKO_80);
        list.addLast(RegisterCards.MIKO_80);
        list.addLast(RegisterCards.MIKO_80);
        list.addLast(RegisterCards.MIKO_150);
        list.addLast(RegisterCards.MIKO_150);
        list.addLast(RegisterCards.MIKO_150);
        list.addLast(RegisterCards.MIKO_130_A);
        list.addLast(RegisterCards.MIKO_130_A);
        list.addLast(RegisterCards.MIKO_130_B);
        list.addLast(RegisterCards.MIKO_130_B);
        list.addLast(RegisterCards.MIKO_130_B);
        list.addLast(RegisterCards.MIKO_130_B);
        list.addLast(RegisterCards.MIKO_200);
        list.addLast(RegisterCards.MIKO_200);
        list.addLast(RegisterCards.MIKO_200);
        list.addLast(RegisterCards.MIKO_200);
        list.addLast(RegisterCards.Kintoki);
        list.addLast(RegisterCards.Kintoki);
        list.addLast(RegisterCards.Kintoki);
        list.addLast(RegisterCards.Kintoki);
        list.addLast(RegisterCards.Magchi);
        list.addLast(RegisterCards.THE_35P);
        list.addLast(RegisterCards.THE_35P);
        list.addLast(RegisterCards.THE_35P);
        list.addLast(RegisterCards.THE_35P);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.GENERAL_PC);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.NODOKA);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MANAGER);
        list.addLast(RegisterCards.MIKORONE24);
        list.addLast(RegisterCards.MIKORONE24);
        list.addLast(RegisterCards.INTIMIDATION);
        list.addLast(RegisterCards.WAIT_REQUEST);
        baseDeck2P.setMemberCards(list);
        List<YellCard> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list2.addLast(RegisterCards.RED_YELL);
        }
        baseDeck2P.setYellCards(list2);

    }
    public void setCount(int timeCount,String key){
        nextTime = timeCount;
        count = key;
    }
    public void mainDeckShuffle(boolean flag2P){
        if(flag2P) {
            Collections.shuffle(baseDeck2P.getMemberCards());
            labelMainDeckValue2P.setText(Integer.toString(baseDeck2P.getMemberCards().size()));
            textAreaLog.append("2P main deck shuffled\n");
        }else {
            Collections.shuffle(baseDeck1P.getMemberCards());
            labelMainDeckValue1P.setText(Integer.toString(baseDeck1P.getMemberCards().size()));
            textAreaLog.append("1P main deck shuffled\n");
        }
    }
    public void yellDeckShuffle(boolean flag2P){
        if(flag2P) {
            Collections.shuffle(baseDeck2P.getYellCards());
            labelYellDeckValue2P.setText(Integer.toString(baseDeck2P.getYellCards().size()));
            textAreaLog.append("2P yell deck shuffled\n");
        }else {
            Collections.shuffle(baseDeck1P.getYellCards());
            labelYellDeckValue1P.setText(Integer.toString(baseDeck1P.getYellCards().size()));
            textAreaLog.append("1P yell deck shuffled\n");
        }
    }
    public void leaderCardPlace(){
        leader1P = baseDeck1P.getLeader();
        labelLeaderValue1P.setText("???");
        textAreaLog.append("1P Leader card pleased\n");
        leader2P = baseDeck2P.getLeader();
        labelLeaderValue2P.setText("???");
        textAreaLog.append("2P Leader card pleased\n");
    }
    public void drawCard(boolean flag2,int cards){
        for(int i=0;i<cards;i++) {
            if (flag2) {
                BaseCard card = baseDeck2P.getMemberCards().getLast();
                hand2p.add(card);
                if (card.isMember()) {
                    MemberCard memberCard = (MemberCard) card;
                    listModel.addElement(memberCard);
                } else {
                    SupportCard supportCard = (SupportCard) card;
                    listModel.addElement(supportCard);
                }
                baseDeck2P.getMemberCards().removeLast();
                textAreaLog.append("2P draw 1 card\n");
                labelHandValue2P.setText(String.valueOf(hand2p.size()));
                labelMainDeckValue2P.setText(Integer.toString(baseDeck2P.getMemberCards().size()));
            } else {
                BaseCard card = baseDeck1P.getMemberCards().getLast();
                hand1p.add(card);
                if (card.isMember()) {
                    MemberCard memberCard = (MemberCard) card;
                    listModel.addElement(memberCard);
                } else {
                    SupportCard supportCard = (SupportCard) card;
                    listModel.addElement(supportCard);
                }
                baseDeck1P.getMemberCards().removeLast();
                textAreaLog.append("1P draw 1 card\n");
                labelHandValue1P.setText(String.valueOf(hand1p.size()));
                labelMainDeckValue1P.setText(Integer.toString(baseDeck1P.getMemberCards().size()));
            }
        }
    }
    public void AllHandToDeck(boolean flag2P){
        if(flag2P) {
            for (int i = 0; i < hand2p.size(); ) {
                BaseCard baseCard = baseDeck2P.getMemberCards().getLast();
                baseDeck2P.getMemberCards().add(baseCard);
                listModel.remove(hand2p.size() - 1);
                hand2p.removeLast();
                textAreaLog.append("2P Puts the cards back into the deck.\n");
                labelMainDeckValue2P.setText(Integer.toString(baseDeck2P.getMemberCards().size()));
            }
        }else {
            for (int i = 0; i < hand1p.size(); ) {
                BaseCard baseCard = baseDeck1P.getMemberCards().getLast();
                baseDeck1P.getMemberCards().add(baseCard);
                listModel.remove(hand1p.size() - 1);
                hand1p.removeLast();
                textAreaLog.append("1P Puts the cards back into the deck.\n");
                labelMainDeckValue1P.setText(Integer.toString(baseDeck1P.getMemberCards().size()));
            }
        }
    }
    public boolean hasDebutInHand(boolean flag2P) {
        if (flag2P) {
            for (BaseCard baseCard : hand2p) {
                if (baseCard.getCardType() == EnumCardType.Debut) {
                    return true;
                }
            }
        }else {
            for (BaseCard baseCard : hand1p) {
                if (baseCard.getCardType() == EnumCardType.Debut) {
                    return true;
                }
            }
        }
        return false;
    }





}
