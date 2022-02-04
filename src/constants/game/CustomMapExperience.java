package constants.game;

import java.util.HashMap;

public final class CustomMapExperience
{
    //Applies experience multiplier to MapID
    private static final HashMap<Integer, Float> CUSTOM_MAP_EXPERIENCE = new HashMap<Integer, Float>() {{
        put(50000, 20.0f);
    }};

    public static Float GetCustomExpMultiplier(int mapId)
    {
        return CUSTOM_MAP_EXPERIENCE.containsKey(mapId)? CUSTOM_MAP_EXPERIENCE.get(mapId) : 1.0f;
    }
}