package org.team2168.subsystems;

import org.team2168.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	

	private static Drivetrain instance = null;
	
	
	
	//Private member variables for six drivetrain motor controllers
	private static VictorSP leftMotor1;
	private static VictorSP leftMotor2;
	private static VictorSP leftMotor3;
	
	private static VictorSP rightMotor1;
	private static VictorSP rightMotor2;
	private static VictorSP rightMotor3;
	
	
	
	/**
	 * Private constructor to init all member variables
	 * Protects against multiple instances
	 */
	
	private Drivetrain()
	{
		//initializes all number variable hardware
		leftMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1_PWM);
		leftMotor2 = new VictorSP(RobotMap.LEFT_MOTOR_2_PWM);
		leftMotor3 = new VictorSP(RobotMap.LEFT_MOTOR_3_PWM);
		
		rightMotor1 = new VictorSP(RobotMap.RIGHT_MOTOR_1_PWM);
		rightMotor2 = new VictorSP(RobotMap.RIGHT_MOTOR_2_PWM);
		rightMotor3 = new VictorSP(RobotMap.RIGHT_MOTOR_3_PWM);
			
}

	
	public static Drivetrain getInstance()
	{
		
		if(instance==null)
			instance = new Drivetrain();
		
		return instance;
	}
	
	
	
	
	/**
	 * Drives Left Motor 1 where speed is a value from -1 to +1
	 * and positive is fwd direction on robot
	 * @param speed
	 */
	
	public void driveLeft1(double speed)
	{
		
		if(RobotMap.REVERSE_LEFT_1_MOTOR_DIRECTION)
			speed=-speed;
		
		leftMotor1.set(speed);
	}
	
	
	/**
	 * Drives entire left side motor with same speed
	 * where speed value is from -1 to 1 and positive is forward
	 */
	
	public void driveLeft(double speed)
	{
		driveLeft1(speed);
		//driveLeft2(speed);
		//driveLeft3(speed);
	}
	 
	
	
	@Override
	protected void initDefaultCommand() {
		//TODO auto-generated method stub
	}
	 
}



