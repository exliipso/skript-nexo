package me.asleepp.skriptnexo.elements.effects;

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

@Name("Register New Nexo Mechanic")
@Description({"Register New Nexo Mechanic to use at your leasure"})
@Examples({"create mechanic"})
@Since("1.0.5")
@RequiredPlugins("Nexo")

public class EffRegisterMechanic extends Effect {

    static  {
        Skript.registerEffect(EffRegisterMechanic.class, "create mechanic %string% with: %objects%");
    }
    @Override
    protected void execute(Event event) {
        //pass the mechanic name and config to Nexo
        new MechanicLoader().loadMechanic(mechanicName, mechanicConfig);
    }
    @Override
    public String toString(Event event, boolean debug) {
        return "Register mechanic: " + mechanicName;
    }
}