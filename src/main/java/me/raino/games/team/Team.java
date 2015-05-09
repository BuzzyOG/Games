package me.raino.games.team;

import com.google.common.collect.Lists;
import me.raino.games.api.player.IPlayer;
import me.raino.games.api.team.ITeam;
import me.raino.games.api.team.TeamType;
import org.bukkit.ChatColor;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Team implements ITeam {

    private String name;
    private ChatColor color;
    private int max;
    private TeamType type;

    private List<IPlayer> players;

    public Team(String name, ChatColor color, int max, TeamType type) {
        this.name = name;
        this.color = color;
        this.max = max;
        this.type = type;

        this.players = Lists.newArrayList();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ChatColor getColor() {
        return this.color;
    }

    @Override
    public int getMax() {
        return this.max;
    }

    @Override
    public TeamType getType() {
        return this.type;
    }

    @Override
    public Collection<IPlayer> getPlayers() {
        return Collections.unmodifiableCollection(this.players);
    }

    @Override
    public void broadcast(String message, Object... arguments) {
        for (IPlayer player : this.players)
            player.message(message, arguments);
    }

}
