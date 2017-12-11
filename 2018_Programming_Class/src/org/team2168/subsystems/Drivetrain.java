package org.team2168.subsystems;

import org.team2168.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *Drivetrain subsystem
 */
public class Drivetrain extends Subsystem {

	//private Member Variabes for 6 drivetrain motor controllers
	private static VictorSP leftMotor1;
	private static VictorSP leftMotor2;
	private static VictorSP leftMotor3;
	
	private static VictorSP rightMotor1;
	private static VictorSP rightMotor2;
	private static VictorSP rightMotor3;
	
	
	
	
    private static Drivetrain instance =null;
	/**
	 * Private contstructor to init all member variables
	 * Protects against multiple instances
	 */
    
    private Drivetrain()
    {
    	leftMotor1 = new VictorSP(RobotMap.LEFT_MOTOR_1);
    	leftMotor2 = new VictorSP(RobotMap.LEFT_MOTOR_2);
    	leftMotor3 = new VictorSP(RobotMap.LEFT_MOTOR_3);
    	
    	rightMotor1 = new VictorSP(RobotMap.RIGHT_MOTOR_1);
    	rightMotor2 = new VictorSP(RobotMap.RIGHT_MOTOR_2);
    	rightMotor3 = new VictorSP(RobotMap.RIGHT_MOTOR_3);
    
    	
    	
    	
    	
    	//Initialize all member variable hardward
    }
   
    
    public static Drivetrain getInstance() {
    	if(instance == null) {
    		 instance = new Drivetrain();
    	}
    	return instance;
    }
	/**
	 * Drives left motor 1 where speed is a value from -1 to 1
	 * postive is forward
	 * @param speed
	 */
    public void driveLeft1(double speed) 
    {
    	if(RobotMap.DT_REVERSE_LEFT)
    	{	
    		speed = -speed;}
    	leftMotor1.set(speed);
    }
    /**
     * Drive entire left side motors with same speed where speed is a value from -1 to 1
     * postive is forward
     * @param speed
     */
    public void driveleft(double speed)
    {
    	driveLeft1(speed);
    	driveLeft2(speed);
    	driveLeft3(speed);
    }
    
   public void driveRight(Double speed) {
	   driveRight1(speed);
	   driveRight2(speed);
	   driveRight3(speed);
	   
   }
	
	/**
	 * Takes in a double speed and sets it to the second left motor
	 * @param speed is a double from 1 to -1,
	 */
	public void driveLeft2(double speed){
		if(RobotMap.DT_REVERSE_LEFT)
			speed = -speed;
		leftMotor2.set(speed);
	}
	
	/**
	 * Takes in a double speed and sets it to the third left motor
	 * @param speed is a double from 1 to -1,
	 */
	public void driveLeft3(double speed){
		if(RobotMap.DT_REVERSE_LEFT)
			speed = -speed;
		leftMotor3.set(speed);
	}
	
	/**
	 * Takes in a double speed and sets it to the first right motor
	 * @param speed is a double from 1 to -1,
	 */
	public void driveRight1(double speed){
		if(RobotMap.DT_REVERSE_RIGHT)
			speed = -speed;
		rightMotor1.set(speed);
	
	}
	
	/**
	 * Takes in a double speed and sets it to the second right motor
	 * @param speed is a double from 1 to -1,
	 */
	public void driveRight2(double speed){
		if(RobotMap.DT_REVERSE_RIGHT)
			speed = -speed;
		rightMotor2.set(speed);
		
	}
	
	/**
	 * Takes in a double speed and sets it to the third right motor
	 * @param speed is a double from 1 to -1,
	 */
	public void driveRight3(double speed){
		if(RobotMap.DT_REVERSE_RIGHT)
			speed = -speed;
		rightMotor3.set(speed);
	
	} 
    
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
    
    
    
}

