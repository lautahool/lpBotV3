import Command.CommandInterface;
import Command.Commands.Photos;
import Command.Commands.Ping;
import Command.Commands.ProfilePicture;
import Command.Commands.Samo;
import Command.Embeds.Help;
import Command.Embeds.ServerInfo;
import Command.Embeds.Staff;
import Command.Music.*;
import LeagueOfLegends.League;
import LeagueOfLegends.SetLeagueCommand;

import java.util.HashMap;
import java.util.List;

public class CommandManager {

    HashMap<CommandInterface,List<String>> commands = new HashMap<>();

    public CommandManager() {
        addCommand(new Pause());
        addCommand(new Ping());
        addCommand(new Help());
        addCommand(new ServerInfo());
        addCommand(new Staff());
        addCommand(new Samo());
        addCommand(new League());
        addCommand(new Photos());
        addCommand(new ProfilePicture());
        addCommand(new SetLeagueCommand());
        addCommand(new Join());
        addCommand(new Leave());
        addCommand(new Play());
        addCommand(new Unpause());
        addCommand(new Skip());
        addCommand(new Queue());
        addCommand(new NowPlaying());
        addCommand(new Clear());
        addCommand(new Seek());
        addCommand(new Loop());
    }

    public void addCommand(CommandInterface command) {
        this.commands.put(command, command.getCalls());
    }

    public HashMap<CommandInterface, List<String>> getCommands() {
        return commands;
    }
}
