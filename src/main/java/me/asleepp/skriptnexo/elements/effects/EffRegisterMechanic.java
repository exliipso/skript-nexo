package me.asleepp.skriptnexo.elements.effects;

import me.asleepp.skriptnexo.elements.effects.mechanicbuilder.MechanicLoader;
import ch.njol.skript.Skript;
import ch.njol.skript.doc.Description;
import ch.njol.skript.doc.Examples;
import ch.njol.skript.doc.Name;
import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.doc.RequiredPlugins;
import ch.njol.skript.doc.Since;
import org.bukkit.event.Event;
import java.util.Map;

@Name("Register New Nexo Mechanic")
@Description({"Register New Nexo Mechanic to use at your leasure"})
@Examples({"create mechanic"})
@Since("1.0.5")
@RequiredPlugins("Nexo")

public class EffRegisterMechanic extends Effect {
    private String mechanicName;
    private Map<String, Object> mechanicConfig;
 
     static  {
        Skript.registerEffect(EffRegisterMechanic.class, "create mechanic %string% with: %objects%");
    }

    @Override
    protected void execute(Event event) {
        // Pass the mechanic name and configuration to Nexo
        new MechanicLoader().loadMechanic(mechanicName, mechanicConfig);
    }
 
    @Override
    public String toString(Event event, boolean debug) {
        return "Register mechanic: " + mechanicName;
    }
}

