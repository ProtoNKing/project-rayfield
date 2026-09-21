package rayfield;

import arc.util.*;
import mindustry.mod.*;
import rayfield.content.blocks.PressurizedChromiteConveyor;

public class RayFieldJavaMod extends Mod {

    public static PressurizedChromiteConveyor pressurizedChromiteConveyor;

    public RayFieldJavaMod() {
        Log.info("Loaded Project RayField");
    }

    @Override
    public void loadContent() {
        Log.info("Loading RayField content...");
        pressurizedChromiteConveyor = new PressurizedChromiteConveyor("pressurized-chromite-conveyor");
    }
}
