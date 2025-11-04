package rocks.friedrich.jwinf.blockly_robot.gui;

import de.pirckheimer_gymnasium.engine_pi.animation.Interpolator;
import de.pirckheimer_gymnasium.engine_pi.animation.interpolation.EaseInOutDouble;
import rocks.friedrich.jwinf.blockly_robot.gui.robot.ImageRobot;
import rocks.friedrich.jwinf.blockly_robot.logic.Task;
import rocks.friedrich.jwinf.blockly_robot.logic.level.Level;
import rocks.friedrich.jwinf.blockly_robot.logic.menu.Menu;

public class State
{
    public static int pixelPerMeter = 60;

    public static Interpolator<Double> interpolator = new EaseInOutDouble(0, 1);

    public static int speed = 1;

    /**
     * Die aktuelle Trainingsaufgabe.
     */
    public static Task task;

    /**
     * Der aktuelle Schwierigkeitsgrad.
     */
    public static Level level;

    /**
     * Die aktuelle Figur.
     */
    public static ImageRobot actor;

    public static Menu menu = new Menu();
}
