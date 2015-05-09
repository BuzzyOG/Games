package me.raino.games;

import me.raino.games.api.game.IGameManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Games extends JavaPlugin {

    private static Games instance;

    private IGameManager gameManager;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static IGameManager getGameManager() {
        return instance.gameManager;
    }

}
