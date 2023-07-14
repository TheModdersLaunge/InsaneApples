package themodderslaunge.insaneapples;

import com.mojang.logging.LogUtils;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(InsaneApples.MODID)
public class InsaneApples {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "insaneapples";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public InsaneApples() {

    }
}
