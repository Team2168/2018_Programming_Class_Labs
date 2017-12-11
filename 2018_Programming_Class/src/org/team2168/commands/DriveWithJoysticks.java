package org.team2168.commands;
import org.team2168.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoysticks extends Command
{
	public DriveWithJoysticks()
	{
		requires(Robot.drivetrain);
	}
	
	public void initialize()
	{	
	}
	
	public void execute()
	{
		if (Robot.oi.driverJoystick.getLeftTriggerAxisRaw() > 0.5){
			Robot.drivetrain.driveLeft(Robot.oi.driverJoystick.getLeftStickRaw_Y() * 0.5);
			Robot.drivetrain.driveRight(Robot.oi.driverJoystick.getRightStickRaw_Y() * 0.5);
		}
		else{
			Robot.drivetrain.driveLeft(Robot.oi.driverJoystick.getLeftStickRaw_Y());
			Robot.drivetrain.driveRight(Robot.oi.driverJoystick.getRightStickRaw_Y());
		}
	}
	
	public boolean isFinished()
	
	
	{
		return false;
	}
	
	public void end(){
	}
	
	public void interrupted(){
	}
	
}
