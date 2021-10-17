/*
 * Copyright (c) 2021, PyshNeak
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package pyshneak.bankedherblore;

import pyshneak.bankedherblore.data.HerbloreItem;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;

import java.awt.image.BufferedImage;
import java.util.HashMap;

@Slf4j
@PluginDescriptor(
		name = "1111MINEBanked Herblore XP"
)
public class BankedHerblorePlugin extends Plugin
{
	// Data stuff
	private HashMap<Integer, Integer> bankMap;
	private HashMap<Integer, HashMap<Integer, Integer>> map;
	private HerbloreItem enums;

	// Display stuff
	private static final BufferedImage ICON = ImageUtil.loadImageResource(BankedHerblorePlugin.class, "shittylettuce.png");
	private BankedHerblorePanel panel;
	private NavigationButton navButton;

	@Inject
	private Client client;

	@Inject
	private ItemManager itemManager;

	@Inject
	private ConfigManager configManager;

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private BankedHerbloreConfig config;

	@Override
	protected void startUp() throws Exception
	{
		// Build and display sidebar
		panel = new BankedHerblorePanel(client, config);//, itemManager, configManager);
		navButton = NavigationButton.builder()
				.tooltip("Herblore XP")
				.icon(ICON)
				.priority(10)
				.panel(panel)
				.build();
		clientToolbar.addNavigation(navButton);

		// Build empty map
		//TODO: hashmaps have a default capacity of 16, this is not enough for the bankMap, vaultMap, invMap, etc.
		bankMap = new HashMap<>();
		map = new HashMap<>();
		map.put(InventoryID.BANK.getId(), bankMap);

		// Load enums of items
		//enums = new HerbloreItem();




		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientToolbar.removeNavigation(navButton);
		panel = null; //TODO: is this needed?
		navButton = null;
		log.info("Example stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says yo whatsup, welcome to my super special herblore calculator!1!!11!11 " , null);
		}
	}

	@Subscribe
	public void onItemContainerChanged(ItemContainerChanged container) {
		if (container.getContainerId() == InventoryID.BANK.getId()) {

			// return if container has no new items
			if (container.getItemContainer() == null) {
				return;
			}

			// iterate through all items in container...
			for (Item item : container.getItemContainer().getItems()) {

				// im confused
				try {
					if (enums.match(item.getId())) {
						System.out.println(" x  " + item.getQuantity());

					}
				} catch (NullPointerException e) {
					// do nothing     System.out.println("Exception...");
				}

			}

		}

	}

	@Provides
	BankedHerbloreConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BankedHerbloreConfig.class);
	}
}
