/*
 * Copyright 2020 Benjamin Martin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.lapismc.afkplus.api;

import net.lapismc.afkplus.playerdata.AFKPlusPlayer;

/**
 * A cancellable event to notify plugins when a player is exiting AFK
 * Cancelling this event is silent and will simply stop it from happening
 * If this was caused by an event it is likely to happen again very soon
 */
@SuppressWarnings("unused")
public class AFKStopEvent extends AFKCommandEvent {

    private final AFKPlusPlayer player;

    /**
     * @param player  The player being set as AFK
     * @param command The command to be run after the event has finished
     */
    public AFKStopEvent(AFKPlusPlayer player, String command) {
        super(command);
        this.player = player;
    }

    /**
     * Get the player that is exiting AFK
     *
     * @return Returns the {@link AFKPlusPlayer} for the events target
     */
    public AFKPlusPlayer getPlayer() {
        return player;
    }
}
