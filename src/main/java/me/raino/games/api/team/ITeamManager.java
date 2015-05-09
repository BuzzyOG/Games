package me.raino.games.api.team;

import java.util.Collection;

public interface ITeamManager {

    ITeam getTeam(String team);

    Collection<ITeam> getTeams();

    ITeam getDefaultTeam();

}
