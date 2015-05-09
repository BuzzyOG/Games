package me.raino.games.game;

import me.raino.games.api.game.IGame;
import me.raino.games.api.team.ITeam;
import me.raino.games.api.team.ITeamManager;
import me.raino.games.team.TeamManager;

public abstract class Game implements IGame {

    private ITeamManager teamManager;

    public Game() {
        this.teamManager = new TeamManager();
    }

    @Override
    public ITeamManager getTeamManager() {
        return this.teamManager;
    }

    @Override
    public void broadcast(String message, Object... arguments) {
        for (ITeam team : this.teamManager.getTeams())
            team.broadcast(message, arguments);
    }

}
