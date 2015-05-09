package me.raino.games.player;

import me.raino.games.StringUtil;
import me.raino.games.api.player.IPlayer;
import org.bukkit.entity.Player;

public final class GamePlayer implements IPlayer {

    private Player handle;

    @Override
    public Player getHandle() {
        return this.handle;
    }

    @Override
    public String getName() {
        return this.handle.getName();
    }

    @Override
    public void message(String message, Object... arguments) {
        this.handle.sendMessage(StringUtil.format(message, arguments));
    }

}
