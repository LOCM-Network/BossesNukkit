package me.phuongaz.boss.command;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class BossCommand extends Command {

    public BossCommand() {
        super("bosses");
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if (sender instanceof Player) {
            //TODO: add boss command
            if (args.length == 0) return false;
            if (args[0].equals("spawn")) {
                sender.sendMessage("ABC");
            }
            return true;
        }
        return false;
    }
}
