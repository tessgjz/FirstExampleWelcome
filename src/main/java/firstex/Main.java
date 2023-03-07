package firstex;

import net.minecraft.Util;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("firstexample")
@Mod.EventBusSubscriber
public class Main {

    @SubscribeEvent
    public static void playerenterworld(PlayerEvent.PlayerLoggedInEvent event){
    Player player= event.getPlayer();
    Level level =player.level;

    player.sendMessage(new TextComponent("welcome, "+ player.getDisplayName().getString() + "from" + (level.isClientSide() ? "client" : " server")),Util.NIL_UUID);

    }

}
