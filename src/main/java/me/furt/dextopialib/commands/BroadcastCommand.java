package me.furt.dextopialib.commands;

import java.util.Collections;
import java.util.List;

import org.spongepowered.api.Server;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.TextBuilder;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.CommandCallable;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;

import com.google.common.base.Optional;

public class BroadcastCommand implements CommandCallable {

	private final Server server;
	private final Optional<Text> desc = Optional.of((Text)Texts.of("Sends a message to everyone online."));
	private final Optional<Text> help = Optional.of((Text)Texts.of(""));
	private final Text usage = (Text)Texts.of("/[command] <argument>");
	
	public BroadcastCommand(Server server) {
		this.server = server;
	}
	public Optional<Text> getHelp(CommandSource source) {
		return help;
	}

	public Optional<Text> getShortDescription(CommandSource source) {
		return desc;
	}

	public List<String> getSuggestions(CommandSource source, String args)
			throws CommandException {
		return Collections.emptyList();
	}

	public Text getUsage(CommandSource source) {
		return usage;
	}

	public Optional<CommandResult> process(CommandSource source, String message)
			throws CommandException {
		// Command functionality goes here
		String args[] = message.split(" ");
		int pCount = server.getOnlinePlayers().size();
		// Still working out how to process the command
		return null;
	}

	public boolean testPermission(CommandSource source) {
		// Command permissions go here
		return source.hasPermission("dexlib.broadcast");
	}
	

}
