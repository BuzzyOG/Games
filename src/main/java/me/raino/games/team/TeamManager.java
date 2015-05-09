package me.raino.games.team;

import com.google.common.collect.Maps;
import me.raino.games.api.team.ITeam;
import me.raino.games.api.team.ITeamManager;
import me.raino.games.api.team.TeamType;
import org.bukkit.ChatColor;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public final class TeamManager implements ITeamManager {

    private Map<String, ITeam> teams;

    public TeamManager() {
        this.teams = Maps.newHashMap();
    }

    @Override
    public ITeam getTeam(String team) {
        return this.teams.get(team);
    }

    @Override
    public Collection<ITeam> getTeams() {
        return Collections.unmodifiableCollection(this.teams.values());
    }

    @Override
    public ITeam getDefaultTeam() {
        return new Team("Spectator", ChatColor.AQUA, -1, TeamType.SPECTATING);
    }

}
