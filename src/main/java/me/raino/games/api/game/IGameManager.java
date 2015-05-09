package me.raino.games.api.game;

import me.raino.games.api.game.loader.IGameLoader;

import java.util.Collection;

public interface IGameManager {

    void load(IGameLoader loader);

    void loadGame(IGame game);

    IGame getGame(String game);

    Collection<IGame> getGames();

}
