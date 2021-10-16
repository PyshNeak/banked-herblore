package pyshneak.bankedherblore;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;

import javax.swing.*;

@Slf4j
public class Calculator extends JPanel {
    private final Client client;
    private final JLabel xpGainLabel = new JLabel();

    @Getter
    private final BankedHerbloreConfig config;

    Calculator(Client client, BankedHerbloreConfig config) {
        this.client = client;
        this.config = config;
    }



}
