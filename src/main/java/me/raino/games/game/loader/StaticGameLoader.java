package me.raino.games.game.loader;

import me.raino.games.api.game.IGame;
import me.raino.games.api.game.loader.IGameLoader;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class StaticGameLoader implements IGameLoader {

    private List<IGame> games;

    public StaticGameLoader(IGame... games) {
        this.games = Arrays.asList(games);
    }

    @Override
    public Collection<IGame> loadGames() {
        return Collections.unmodifiableCollection(this.games);
    }

}
