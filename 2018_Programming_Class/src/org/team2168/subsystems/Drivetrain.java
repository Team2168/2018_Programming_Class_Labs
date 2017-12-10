package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.drivetrain.DriveWithJoysticks;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This object represents the drivetrain subsystem
 * The drivetrain has 6 motor controllers
 * 3 for the left, 3 for the right
 */

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

	
	
	/**
	 * Returns Drivetrain Singleton Object
	 * @return is the current drivetrain object
	 */
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
	 * Drives Left Motor 2 where speed is a value from -1 to +1
	 * and positive is fwd direction on robot
	 */
	public void driveLeft2(double speed)
	{
		
		if(RobotMap.REVERSE_LEFT_2_MOTOR_DIRECTION)
			speed=-speed;
		
		leftMotor2.set(speed);
	}
	
	
	/**
	 * Drives Left Motor 3 where speed is a value from -1 to +1
	 * and positive is fwd direction on robot
	 */
	public void driveLeft3(double speed)
	{
		
		if(RobotMap.REVERSE_LEFT_3_MOTOR_DIRECTION)
			speed=-speed;
		
		leftMotor3.set(speed);
	}
	
	
	/**
	 * Drives entire left side motor with same speed
	 * where speed value is from -1 to 1 and positive is forward
	 */
	public void driveLeft(double speed)
	{
		driveLeft1(speed);
		driveLeft2(speed);
		driveLeft3(speed);
	}
	
	
	
	
	/**
	 * Drives Right Motor 1 where speed is a value from -1 to +1
	 * and positive is fwd direction on robot
	 */
	public void driveRight1(double speed)
	{
		if(RobotMap.REVERSE_RIGHT_1_MOTOR_DIRECTION)
			speed=-speed;
		
		rightMotor1.set(speed);
	}
	
	
	/**
	 * Drives Right Motor 2 where speed is a value from -1 to +1
	 * and positive is fwd direction on robot
	 */
	public void driveRight2(double speed)
	{
		
		if(RobotMap.REVERSE_RIGHT_2_MOTOR_DIRECTION)
			speed=-speed;
		
		rightMotor2.set(speed);
	}
	 
	
	/**
	 * Drives Right Motor 3 where speed is a value from -1 to +1
	 * and positive is fwd direction on robot
	 */
	public void driveRight3(double speed)
	{
		
		if(RobotMap.REVERSE_RIGHT_3_MOTOR_DIRECTION)
			speed=-speed;
		
		rightMotor3.set(speed);
	}
	
	
	/**
	 * Drives entire right side motor with same speed
	 * where speed value is from -1 to 1 and positive is fwd
	 */
	public void driveRight(double speed)
	{
		driveRight1(speed);
		driveRight2(speed);
		driveRight3(speed);
	}
	
	
	
	
	/**
	 * Takes in a speed for the left and right side of the drivetrain and
	 * drives the corresponding motors
	 * @param leftSpeed is a type of double from -1 to 1
	 * @param rightSpeed is a type of double from -1 to 1
	 */
	public void tankDrive(double leftSpeed, double rightSpeed)
	{
		driveLeft(leftSpeed);
		driveRight(rightSpeed);
	}
	
	
	
	
	@Override
	protected void initDefaultCommand() {
		//TODO auto-generated method stub
		setDefaultCommand(new DriveWithJoysticks());
	}
	 
}



