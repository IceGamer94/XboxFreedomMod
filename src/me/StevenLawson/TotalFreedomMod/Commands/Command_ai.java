package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import net.minecraft.util.org.apache.commons.lang3.ArrayUtils;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(
        description = "See how to become admin.",
        aliases = "admininfo",
        usage = "/<command>")
public class Command_ai extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.playerMsg(sender_p, "So you wish to apply for admin do you?", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "Go to http://xboxfreedom.boards.net", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "Don't ask Admins for Rec's and TPaS or SPaS If you asking you not being admin,", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "Applications Status: You can Apply now :) (Non-Halted).", ChatColor.RED);
        return true;
    }
}

