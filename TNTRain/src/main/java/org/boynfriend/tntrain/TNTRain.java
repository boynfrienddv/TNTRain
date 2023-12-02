package org.boynfriend.tntrain;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import java.util.concurrent.ThreadLocalRandom;
import org.bukkit.plugin.java.JavaPlugin;

public final class TNTRain extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                for (Player p : Bukkit.getOnlinePlayers())
                {
                    int x = ThreadLocalRandom.current().nextInt(-100, 100);
                    int z = ThreadLocalRandom.current().nextInt(-100, 100);
                    TNTPrimed tnt = (TNTPrimed) p.getWorld().spawnEntity(p.getLocation().add(x, 100, z), EntityType.PRIMED_TNT);
                }
            }
        }, 200, 200);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
