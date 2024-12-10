package me.asleepp.skriptnexo.elements.effects.mechanicbuilder;

import java.util.Map;

public class MechanicLoader {
    public void loadMechanic(String mechanicName, Map<String, Object> config) {
        // Converts the Mechanic to a format Nexo understands
        Mechanic newMechanic = new Mechanic(mechanicName, config);

        // Use Nexo Registry to add Mechanic
        NexoMechanicFactory(newMechanic);
    }
}
