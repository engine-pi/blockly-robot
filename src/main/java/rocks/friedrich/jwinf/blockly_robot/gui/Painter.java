package rocks.friedrich.jwinf.blockly_robot.gui;

import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.actor.Text;
import rocks.friedrich.jwinf.blockly_robot.logic.level.Difficulty;

public class Painter
{
    public static void paintVersionHeading(Scene scene, double x, double y,
            Difficulty difficulty)
    {
        Text text = TextMaker.createText(
                "Version " + "*".repeat(difficulty.getIndex() + 2), 1);
        text.setPosition(x, y);
        scene.add(text);
    }
}
