package me.raino.games.api.player;

import me.raino.games.api.INamed;
import me.raino.games.api.IWrapper;
import org.bukkit.entity.Player;

public interface IPlayer extends IWrapper<Player>, INamed {

    void message(String message, Object... arguments);

}
