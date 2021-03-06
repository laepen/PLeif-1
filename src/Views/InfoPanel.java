package Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Marcus on 2/4/2015.
 */
public class InfoPanel extends JPanel{
    private NamePanel namePanel;
    private PortraitPanel portraitPanel;
    private StatsInfoPanel statsInfoPanel;
    private EquippedPanel equippedPanel;
    private InventoryPanel inventoryPanel;

    public InfoPanel(){
        setPreferredSize(new Dimension(200,500));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        add(new JLabel("Info"));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        makePanels();
    }

    private void makePanels() {
        namePanel = new NamePanel();
        portraitPanel = new PortraitPanel();
        statsInfoPanel = new StatsInfoPanel();
        equippedPanel = new EquippedPanel();
        inventoryPanel = new InventoryPanel();
        add(namePanel);
        add(portraitPanel);
        add(statsInfoPanel);
        add(equippedPanel);
        add(inventoryPanel);
    }
}
