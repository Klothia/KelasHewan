/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelashewan;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class KelasHewan {

public static void main(String[] args) {
new KelasHewan();
}
public KelasHewan()
{
JFrame guiFrame = new JFrame();
//make sure the program exits when the frame closes
guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
guiFrame.setTitle("List Kelas Hewan");
guiFrame.setSize(300,200);
//This will center the JFrame in the middle of the screen
guiFrame.setLocationRelativeTo(null);
//Options for the JComboBox for vertebrata
String[] verOptions = {"Pisces", "Amphibia", "Reptilia"
,"Aves", "Aves", "Mammalia"};
//Options for the JComboBox for invertebrata
String[] inverOptions = {"Protozoa", "Porifera", "Cnidaria", "Ctenophora"
, "Platyhelminthes", "Nematoda", "Annelida", "Mollusca", "Artopoda"};
//The first JPanel contains a JLabel and JCombobox
final JPanel verPanel = new JPanel();
JLabel verLabel = new JLabel("Vertebrata :");
JComboBox vertebrata = new JComboBox(verOptions);
verPanel.add(verLabel);
verPanel.add(vertebrata);
//The next JPanel contains a JLabel and JCombobox too
//make use the JPanel is not visible. This 2nd JPanel won't be shown at first
final JPanel inverPanel = new JPanel();
inverPanel.setVisible(false);
JLabel inverLabel = new JLabel("Invertebrata :");
JComboBox invertebrata = new JComboBox(inverOptions);
inverPanel.add(inverLabel);
inverPanel.add(invertebrata);
JButton verInverButton = new JButton( "GANTI");
//The ActionListener class is used to handle the
//event that happens when the user clicks the button.
//As there is not a lot that needs to happen we can
//define an anonymous inner class to make the code simpler.
verInverButton.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent event)
{
//When the vertebrata of bottom button is pressed
//the setVisible value of the 2nd comboPanel and
//1st comboPanel is switched from true to
//value or vice versa.
inverPanel.setVisible(!inverPanel.isVisible());
verPanel.setVisible(!verPanel.isVisible());
}
});
//The JFrame uses the BorderLayout layout manager.
//Put the two JPanels and JButton in different areas.
guiFrame.add(verPanel, BorderLayout.NORTH);
guiFrame.add(inverPanel, BorderLayout.CENTER);
guiFrame.add(verInverButton,BorderLayout.SOUTH);
//make sure the JFrame is visible
guiFrame.setVisible(true);
}
}