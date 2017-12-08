package org.team2168.subsystems;

import edu.wpi.first.wpilibj.command.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem;
{

	private static Drivetrain instance = null;
	
	//Private member variables for six drivetrain motor controllers
	private static edu.wpi.first.wpilibj.VictorSP leftMotor1;
	private static VictorSP leftMotor2;
	private static VictorSP leftMotor3;
	
	private static VictorSP rightMotor1;
	private static VictorSP rightMotor2;
	private static VictorSP rightMotor3;
	
	/**
	 * Private instructor to init all number varibles
	 * Protects against multiple instances
	 */
	
	private Drivetrain() {
	//initializes all number variable hardware
	leftMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1_PWN);
	leftMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1_PWN);
	leftMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1_PWN);
	
	rightMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1_PWN);
	rightMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1_PWN);
	rightMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1_PWN);
		
}
	
	/**
	 * 
	 * 
	 */
	
	//write methods for left 2 and 3 plus right 2 and 3
	
	public void driveLeft1(double speed) {
		leftMotor1.set(speed);
		if(RobotMap.REVERSE_LEFT_1_MOTOR_DIRECTION)
	}
	
	//drive entire left side motors with same speed where speed value is from -1 to 1 and positive is forward
	public void driveLeft(double speed) {
		leftMotor1.set(speed);
	}
	 
	@Override
	protected void 
	 
}



