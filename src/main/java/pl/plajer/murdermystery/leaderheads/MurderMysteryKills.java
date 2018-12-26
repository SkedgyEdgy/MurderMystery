/*
 * MurderMystery - Find the murderer, kill him and survive!
 * Copyright (C) 2018  Plajer's Lair - maintained by Plajer and Tigerpanzer
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Murder Mystery is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Murder Mystery is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Murder Mystery.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.plajer.murdermystery.leaderheads;

import java.util.Arrays;

import me.robin.leaderheads.datacollectors.OnlineDataCollector;
import me.robin.leaderheads.objects.BoardType;

import org.bukkit.entity.Player;

import pl.plajer.murdermystery.api.StatsStorage;
import pl.plajer.murdermystery.handlers.ChatManager;

/**
 * @author Plajer
 * <p>
 * Created at 08.08.2018
 */
public class MurderMysteryKills extends OnlineDataCollector {

  public MurderMysteryKills() {
    super("murdermystery-kills", "MurderMystery", BoardType.DEFAULT, ChatManager.colorMessage("Leaderheads.Top-Command-Inv-Title"),
        ChatManager.colorMessage("Leaderheads.Top-Command-Name").replace("%stat%", "kills"), Arrays.asList(null, null, ChatManager.colorMessage("Leaderheads.Leaderboard-Value.Kills"), null));
  }

  @Override
  public Double getScore(Player player) {
    // Return the score of this player.
    return (double) StatsStorage.getUserStats(player, StatsStorage.StatisticType.KILLS);
  }

}
