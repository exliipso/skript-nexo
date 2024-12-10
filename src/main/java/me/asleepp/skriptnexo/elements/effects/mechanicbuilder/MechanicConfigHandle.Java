import org.yaml.snakeyaml.Yaml;
 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
 
public class MechanicYamlUpdater {
    private static final String MECHANICS_FILE = "path/to/mechanics.yml";
 
    public void addMechanicToFile(String mechanicName, Map<String, Object> config) {
        Yaml yaml = new Yaml();
        Map<String, Object> currentData = yaml.load(new FileInputStream(MECHANICS_FILE));
 
        // Add the new mechanic under the "custom" section
        Map<String, Object> customMechanics = (Map<String, Object>) currentData.get("custom");
        customMechanics.put(mechanicName, config);
 
        // Save back to YAML
        try (FileWriter writer = new FileWriter(MECHANICS_FILE)) {
            yaml.dump(currentData, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }