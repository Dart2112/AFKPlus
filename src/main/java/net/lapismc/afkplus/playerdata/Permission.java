/*
 * Copyright 2018 Benjamin Martin
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

package net.lapismc.afkplus.playerdata;

import net.lapismc.lapiscore.LapisPermission;

public enum Permission {

    AFKSelf(new AFKSelf()), AFKOthers(new AFKOthers()), TimeToAFK(new TimeToAFK()),
    TimeToWarning(new TimeToWarning()), TimeToAction(new TimeToAction());

    private final LapisPermission permission;

    Permission(LapisPermission permission) {
        this.permission = permission;
    }

    public LapisPermission getPermission() {
        return this.permission;
    }

    private static class AFKSelf extends LapisPermission {
        //Allows a player to set their own AFK status
        AFKSelf() {
            super("AFKSelf");
        }
    }

    private static class AFKOthers extends LapisPermission {
        //Allows a player to set the AFK status of other players
        AFKOthers() {
            super("AFKOthers");
        }
    }

    private static class TimeToAFK extends LapisPermission {
        //The time in seconds of inactivity required to set a player AFK
        TimeToAFK() {
            super("TimeToAFK");
        }
    }

    private static class TimeToWarning extends LapisPermission {
        //The time in seconds that a player must be AFK before being warned of action
        TimeToWarning() {
            super("TimeToWarning");
        }
    }

    private static class TimeToAction extends LapisPermission {
        //The time in seconds that a player must be AFK before being acted upon
        TimeToAction() {
            super("TimeToAction");
        }
    }
}
