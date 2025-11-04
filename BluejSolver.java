import de.pirckheimer_gymnasium.blockly_robot.jwinf.en.tasks.conditionals_excercises.find_the_way_to_the_lake.TaskSolver;
import de.pirckheimer_gymnasium.blockly_robot.jwinf.en.tasks.conditionals_excercises.find_the_way_to_the_lake.Robot;

class Solver extends TaskSolver
{
    public void easy(Robot r)
    {
        r.forward();
    }

    public static void main(String[] args)
    {
        new Solver().solve("easy");
    }
}
