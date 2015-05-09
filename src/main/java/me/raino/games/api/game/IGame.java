package me.raino.games.api.game;

import me.raino.games.api.INamed;
import me.raino.games.api.team.ITeamManager;

public interface IGame extends INamed {

    ITeamManager getTeamManager();

    void broadcast(String message, Object... arguments);

}
