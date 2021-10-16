package com.bankedherblore;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BankedHerbloreTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BankedHerblorePlugin.class);
		RuneLite.main(args);
	}
}