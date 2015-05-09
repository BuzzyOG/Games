package me.raino.games.api.team;

import me.raino.games.api.INamed;
import me.raino.games.api.player.IPlayer;
import org.bukkit.ChatColor;

import java.util.Collection;

public interface ITeam extends INamed {

    ChatColor getColor();

    int getMax();

    TeamType getType();

    Collection<IPlayer> getPlayers();

    void broadcast(String message, Object... arguments);

}
