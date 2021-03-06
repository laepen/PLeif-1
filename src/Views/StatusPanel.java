package Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Marcus on 2/4/2015.
 */
public class StatusPanel extends JPanel{
    private InputPanel inputPanel;
    private OutputPanel outputPanel;

    public StatusPanel(){
        setPreferredSize(new Dimension(500,100));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setLayout(new BorderLayout());
        makePanels();
    }

    private void makePanels() {
        inputPanel = new InputPanel();
        outputPanel = new OutputPanel();
        add(outputPanel, BorderLayout.CENTER);
        add(inputPanel,BorderLayout.SOUTH);
    }
}
