package com.flowpowered.commands;

import java.util.List;

public interface CompletingCommandExecutor extends CommandExecutor {
    public int complete(Command command, CommandSender sender, CommandArguments args, int argNumber, int offset, List<CharSequence> candidates);
}
