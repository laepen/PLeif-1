package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Marcus on 2/4/2015.
 */
public class GameFrame extends JFrame {
    public static final String TITLE = "Leif: Epic Adventures";
    private BoardPanel boardPanel;
    private InfoPanel infoPanel;
    private StatusPanel statusPanel;

    public GameFrame(){
        super(TITLE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));
        makePanels();
        makeMenu();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void makeMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener((e) -> {System.exit(0);});
        quitItem.setMnemonic(KeyEvent.VK_Q);
        quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        fileMenu.add(quitItem);
        setJMenuBar(menuBar);
    }

    private void makePanels() {
        boardPanel = new BoardPanel();
        infoPanel = new InfoPanel();
        statusPanel = new StatusPanel();
        add(boardPanel,BorderLayout.CENTER);
        add(infoPanel,BorderLayout.EAST);
        add(statusPanel, BorderLayout.SOUTH);
    }
}
