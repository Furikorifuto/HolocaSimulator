import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class DeckEditForm extends JFrame{
    public JPanel panelLeader = new JPanel();
    public JPanel panelMainDeck = new JPanel();
    public JPanel panelAllCards = new JPanel();
    public JPanel panelPowerValue = new JPanel();
    public JComboBox<String> comboBoxLeader = new JComboBox<String>();
    public JTextArea textCardInfo = new JTextArea();
    public JList<String> listMainDeck = new JList<String>();
    public JList<String> listAllCards = new JList<String>();
    public JScrollPane scrollPaneDeck = new JScrollPane();
    public JScrollPane scrollPaneCard = new JScrollPane();
    public JSpinner spinnerWhite = new JSpinner();
    public JSpinner spinnerGreen = new JSpinner();
    public JSpinner spinnerBlue = new JSpinner();
    public JSpinner spinnerRed = new JSpinner();
    public JSpinner spinnerPurple = new JSpinner();
    public JSpinner spinnerYellow = new JSpinner();
    public DeckEditForm(){
        this.setTitle("Holoca Simulator");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(640,480);
        this.setResizable(false);

        comboBoxLeader.addItem("Mumei(StartYellSet)");
        comboBoxLeader.addItem("Pekora(StartYellSet)");
        comboBoxLeader.addItem("Kiara(StartYellSet)");
        comboBoxLeader.addItem("Suisei(StartYellSet)");

        scrollPaneDeck.getViewport().setView(listMainDeck);
        scrollPaneCard.getViewport().setView(listAllCards);
        panelLeader.setBorder(new TitledBorder("Leader Card"));
        panelLeader.setBounds(10,0,150,60);
        panelLeader.add(comboBoxLeader);
        panelMainDeck.setBorder(new TitledBorder("Main Deck 0/50"));
        panelMainDeck.setBounds(160,0,150,320);
        panelMainDeck.add(listMainDeck);
        panelAllCards.setBorder(new TitledBorder("Card List"));
        panelAllCards.setBounds(310,0,150,320);
        panelAllCards.add(listAllCards);
        panelPowerValue.setBorder(new TitledBorder("Powers 0/20"));
        panelPowerValue.setBounds(460,0,150,200);
        panelPowerValue.setLayout(new BoxLayout(panelPowerValue,BoxLayout.Y_AXIS));
        panelPowerValue.add(spinnerWhite);
        panelPowerValue.add(spinnerGreen);
        panelPowerValue.add(spinnerBlue);
        panelPowerValue.add(spinnerRed);
        panelPowerValue.add(spinnerPurple);
        panelPowerValue.add(spinnerYellow);

        this.setLayout(null);
        this.add(panelLeader);
        this.add(panelMainDeck);
        this.add(panelAllCards);
        this.add(panelPowerValue);

        this.setVisible(true);
    }
}