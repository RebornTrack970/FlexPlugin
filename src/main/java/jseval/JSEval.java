package jseval;

import arc.util.*;
import mindustry.gen.*;
import mindustry.mod.*;

import static mindustry.Vars.*;

@SuppressWarnings("unused")
public class JSEval extends Plugin {

    @Override
    public void registerClientCommands(CommandHandler handler) {
        handler.<Player>register("flex", "<msg...>", "admin-rank", (args, player) -> {
            if (player.admin) {
                 Call.sendMessage("[#96008c]<ADMIN> [coral][["+player.name+"[coral]]: [white]"+ args[0]);
            }
        });
    }
}
