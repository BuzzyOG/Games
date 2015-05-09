package me.raino.games.api.game.loader;

import me.raino.games.api.game.IGame;

import java.util.Collection;

public interface IGameLoader {

    Collection<IGame> loadGames();

}
