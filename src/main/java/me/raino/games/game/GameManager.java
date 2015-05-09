package me.raino.games.game;

import com.google.common.collect.Maps;
import me.raino.games.api.exception.GameException;
import me.raino.games.api.game.IGame;
import me.raino.games.api.game.IGameManager;
import me.raino.games.api.game.loader.IGameLoader;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public final class GameManager implements IGameManager {

    private Map<String, IGame> games;

    public GameManager() {
        this.games = Maps.newHashMap();
    }

    @Override
    public void load(IGameLoader loader) {
        loader.loadGames().forEach(this::loadGame);
    }

    @Override
    public void loadGame(IGame game) {
        String name = game.getName().toLowerCase();
        if (this.games.containsKey(name))
            throw new GameException("Game {0} already loaded", game.getName());
        this.games.put(name, game);
    }

    @Override
    public IGame getGame(String game) {
        return this.games.get(game.toLowerCase());
    }

    @Override
    public Collection<IGame> getGames() {
        return Collections.unmodifiableCollection(this.games.values());
    }

}
