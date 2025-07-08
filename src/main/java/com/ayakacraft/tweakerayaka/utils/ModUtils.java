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

package com.ayakacraft.tweakerayaka.utils;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

import java.util.Optional;

public final class ModUtils {

    public static final FabricLoader LOADER = FabricLoader.getInstance();

    public static final String MALILIB_ID = "malilib";

    @Deprecated
    public static boolean isModLoaded(String modId) {
        return LOADER.isModLoaded(modId);
    }

    public static Optional<ModContainer> getModContainer(String modId) {
        return LOADER.getModContainer(modId);
    }

}
