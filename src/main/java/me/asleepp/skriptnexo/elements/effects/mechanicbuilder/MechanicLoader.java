package me.asleepp.skriptnexo.elements.effects.mechanicbuilder;

import java.util.Map;
import com.nexomc.nexo.mechanics.Mechanic;
import com.nexomc.nexo.mechanics.MechanicFactory;


public abstract class MechanicLoader {
    public void loadMechanic(String mechanicName, Map<String, Object> config) {
        // Converts the Mechanic to a format Nexo understands
        Mechanic newMechanic = new Mechanic(mechanicName, config);

        // Use Nexo Registry to add Mechanic
        MechanicsManager(newMechanic);
    }
}
