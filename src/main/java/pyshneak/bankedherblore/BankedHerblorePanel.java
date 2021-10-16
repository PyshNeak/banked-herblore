package pyshneak.bankedherblore;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.PluginPanel;
import net.runelite.api.Client;
import java.awt.*;
import javax.swing.border.EmptyBorder;

@Slf4j
public class BankedHerblorePanel extends PluginPanel {
    private final Calculator calculator;

    /**
     *
     * @param calculator
     */
    public BankedHerblorePanel(Client client, BankedHerbloreConfig config) {
        super(); // BankedHerblorePanel now has PluginPanels... stuff.

        // idk what this do
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        calculator = new Calculator(client, config); // Fill in...
    }
}
