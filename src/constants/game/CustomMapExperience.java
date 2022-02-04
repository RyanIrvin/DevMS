package constants.game;

import java.util.HashMap;

public final class CustomMapExperience
{
    //Applies experience multiplier to MapID
    public static final HashMap<Integer, Integer> CUSTOM_MAP_EXPERIENCE = new HashMap<Integer, Integer>() {{
        put(50000, 20);
    }};

    public static boolean HasCustomExpValue(int mapId)
    {
        return CUSTOM_MAP_EXPERIENCE.containsKey(mapId);
    }

    public static int GetCustomExpMultiplier(int mapId)
    {
        return CUSTOM_MAP_EXPERIENCE.get(mapId);
    }
}