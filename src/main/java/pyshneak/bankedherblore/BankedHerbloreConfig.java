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

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("bankedherblore")
public interface BankedHerbloreConfig extends Config {

	// General settings -------------------------------------------------------
	@ConfigSection(
			name = "General",
			description = "General settings",
			position = 0,
			closedByDefault = false
	)
	String generalSettings = "generalSettings";

	@ConfigItem(
			keyName = "ignoreSecondaries",
			name = "Ignore secondary requirements",
			description = "Does not require secondaries for calculation",
			position = 1,
			section= generalSettings
	)
	default boolean ignoreSecondaries() {
		return true;
	}

	// Ignore herbs -----------------------------------------------------------
	@ConfigSection(
			name = "Ignore Herbs",
			description = "Herbs to ignore",
			position = 10,
			closedByDefault = true
	)
	String ignoreHerbSettings = "ignoreHerbSettings";


	@ConfigItem(
			keyName = "ignoreGuam",
			name = "Ignore guam",
			description = "Do not include guam's in experience calculation",
			position = 11,
			section = ignoreHerbSettings
	)
	default boolean ignoreGuam() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreMarrentill",
			name = "Ignore marrentill",
			description = "Do not include marrentill's in experience calculation",
			position = 12,
			section = ignoreHerbSettings
	)
	default boolean ignoreMarrentill() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreTarromin",
			name = "Ignore tarromin",
			description = "Do not include tarromin's in experience calculation",
			position = 13,
			section = ignoreHerbSettings
	)
	default boolean ignoreTarromin() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreHarralander",
			name = "Ignore harralander",
			description = "Do not include harralander's in experience calculation",
			position = 14,
			section = ignoreHerbSettings
	)
	default boolean ignoreHarralander() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreRanarrWeed",
			name = "Ignore ranarr weed",
			description = "Do not include ranarr weed's in experience calculation",
			position = 15,
			section = ignoreHerbSettings
	)
	default boolean ignoreRanarrWeed() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreToadflax",
			name = "Ignore toadflax",
			description = "Do not include toadflax's in experience calculation",
			position = 16,
			section = ignoreHerbSettings
	)
	default boolean ignoreToadflax() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreIrit",
			name = "Ignore irit",
			description = "Do not include irit's in experience calculation",
			position = 17,
			section = ignoreHerbSettings
	)
	default boolean ignoreIrit() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreAvantoe",
			name = "Ignore avantoe",
			description = "Do not include avantoe's in experience calculation",
			position = 18,
			section = ignoreHerbSettings
	)
	default boolean ignoreAvantoe() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreKwuarm",
			name = "Ignore kwuarm",
			description = "Do not include kwuarm's in experience calculation",
			position = 19,
			section = ignoreHerbSettings
	)
	default boolean ignoreKwuarm() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreSnapdragon",
			name = "Ignore snapdragon",
			description = "Do not include snapdragon's in experience calculation",
			position = 20,
			section = ignoreHerbSettings
	)
	default boolean ignoreSnapdragon() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreCadentine",
			name = "Ignore cadentine",
			description = "Do not include cadentine's in experience calculation",
			position = 21,
			section = ignoreHerbSettings
	)
	default boolean ignoreCadentine() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreLantadyme",
			name = "Ignore lantadyme",
			description = "Do not include lantadyme's in experience calculation",
			position = 22,
			section = ignoreHerbSettings
	)
	default boolean ignoreLantadyme() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreDwarfWeed",
			name = "Ignore dwarf weed",
			description = "Do not include dwarf weed's in experience calculation",
			position = 23,
			section = ignoreHerbSettings
	)
	default boolean ignoreDwarfWeed() {
		return false;
	}

	@ConfigItem(
			keyName = "ignoreTorstol",
			name = "Ignore torstol",
			description = "Do not include torstol's in experience calculation",
			position = 24,
			section = ignoreHerbSettings
	)
	default boolean ignoreTorstol() {
		return false;
	}
}