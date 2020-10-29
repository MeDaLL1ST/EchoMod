package com.example.examplemod;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class EchoCommand extends CommandBase {

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] params) throws CommandException {

                EchoCommandMod.logger.info("execute called");
                String message = "Hello world!";
                TextComponentString text = new TextComponentString(message);
                text.getStyle().setColor(TextFormatting.RED);
                sender.sendMessage(text);
    }

    @Override
    public String getName() {
        return "hi";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "command.echo.usage";
    }
}
