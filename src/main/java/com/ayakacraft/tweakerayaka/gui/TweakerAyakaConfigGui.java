/*
 * This file is part of the TweakerAyaka project, licensed under the
 * GNU General Public License v3.0
 *
 * Copyright (C) 2025  Calboot and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.ayakacraft.tweakerayaka.gui;

import com.ayakacraft.tweakerayaka.TweakerAyakaMod;
import fi.dy.masa.malilib.gui.GuiConfigsBase;

import java.util.List;

public class TweakerAyakaConfigGui extends GuiConfigsBase {

    public TweakerAyakaConfigGui() {
        super(10, 50, TweakerAyakaMod.MOD_ID, null, "tweakerayaka.gui.title", TweakerAyakaMod.MOD_VERSION);
    }

    @Override
    public List<ConfigOptionWrapper> getConfigs() {
        return List.of();
    }

}
