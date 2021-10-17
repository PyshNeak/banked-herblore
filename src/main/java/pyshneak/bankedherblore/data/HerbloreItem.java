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

package pyshneak.bankedherblore.data;

import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum HerbloreItem {

    // Clean Herbs
    GUAM_LEAF(ItemID.GUAM_LEAF, "Clean"),
    MARRENTILL(ItemID.MARRENTILL, "Clean"),
    TARROMIN(ItemID.TARROMIN, "Clean"),
    HARRALANDER(ItemID.HARRALANDER, "Clean"),
    RANARR_WEED(ItemID.RANARR_WEED, "Clean"),
    TOADFLAX(ItemID.TOADFLAX, "Clean"),
    IRIT_LEAF(ItemID.IRIT_LEAF, "Clean"),
    AVANTOE(ItemID.AVANTOE, "Clean"),
    KWUARM(ItemID.KWUARM, "Clean"),
    SNAPDRAGON(ItemID.SNAPDRAGON, "Clean"),
    CADANTINE(ItemID.CADANTINE, "Clean"),
    LANTADYME(ItemID.LANTADYME, "Clean"),
    DWARF_WEED(ItemID.DWARF_WEED, "Clean"),
    TORSTOL(ItemID.TORSTOL, "Clean"),

    // Grimy Herbs
    GRIMY_GUAM_LEAF(ItemID.GRIMY_GUAM_LEAF, "Grimy"),
    GRIMY_MARRENTILL(ItemID.GRIMY_MARRENTILL, "Grimy"),
    GRIMY_TARROMIN(ItemID.GRIMY_TARROMIN, "Grimy"),
    GRIMY_HARRALANDER(ItemID.GRIMY_HARRALANDER, "Grimy"),
    GRIMY_RANARR_WEED(ItemID.GRIMY_RANARR_WEED, "Grimy"),
    GRIMY_TOADFLAX(ItemID.GRIMY_TOADFLAX, "Grimy"),
    GRIMY_IRIT_LEAF(ItemID.GRIMY_IRIT_LEAF, "Grimy"),
    GRIMY_AVANTOE(ItemID.GRIMY_AVANTOE, "Grimy"),
    GRIMY_KWUARM(ItemID.GRIMY_KWUARM, "Grimy"),
    GRIMY_SNAPDRAGON(ItemID.GRIMY_SNAPDRAGON, "Grimy"),
    GRIMY_CADANTINE(ItemID.GRIMY_CADANTINE, "Grimy"),
    GRIMY_LANTADYME(ItemID.GRIMY_LANTADYME, "Grimy"),
    GRIMY_DWARF_WEED(ItemID.GRIMY_DWARF_WEED, "Grimy"),
    GRIMY_TORSTOL(ItemID.GRIMY_TORSTOL, "Grimy");


    private final int itemID;
    private final String category;

    /**
     * Constructor.
     *
     * @param itemID    item ID
     * @param category  for determining actions
     */
    HerbloreItem(int itemID, String category) {
        this.itemID = itemID;
        this.category = category;
    }

    public static boolean match(int id) {
        for (HerbloreItem item : HerbloreItem.values())
            if (item.getItemID() == id) {
                System.out.print(item);
                return true;
            }
        return false;
    }
}
