package org.team2168.commands;

import org.team2168.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *Drive drivetrain at a constant rate
 */
public class DriveDrivetrainWithConstant extends Command {

    public DriveDrivetrainWithConstant(double leftSpeed, double rightSpeed) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
        speedLeft = leftSpeed;
        speedRight = rightSpeed;
    }
    double speedLeft;
	double speedRight;
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.driveleft(speedLeft);
    	Robot.drivetrain.driveRight(speedRight);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
