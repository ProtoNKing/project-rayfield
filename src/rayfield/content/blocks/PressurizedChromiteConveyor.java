package rayfield.content.blocks;

import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.*;

public class PressurizedChromiteConveyor extends Conveyor {

    public PressurizedChromiteConveyor(String name) {
        super(name);

        requirements(Category.distribution, with(
            Items.copper, 1,
            Items.lead, 1
        ));

        health = 55;
        speed = 0.046f;
        displayedSpeed = 5.5f;
        itemCapacity = 3;
    }
}
