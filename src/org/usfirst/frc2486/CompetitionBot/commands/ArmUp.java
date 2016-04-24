package org.usfirst.frc2486.CompetitionBot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2486.CompetitionBot.Robot;

public class ArmUp extends Command {

    public ArmUp() {
        requires(Robot.arm);
    }

    protected void initialize() {}

    protected void execute() {
    	Robot.arm.setPower(1);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {}
    
    protected void interrupted() {}
}
