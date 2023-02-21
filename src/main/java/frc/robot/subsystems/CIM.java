package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class CIM extends SubsystemBase {
    public static WPI_TalonSRX cim = new WPI_TalonSRX(RobotMap.CIM);
    public CIM() {
        cim.configFactoryDefault();
        cim.setInverted(true);
        cim.setNeutralMode(NeutralMode.Brake);
    }
    public void setSpeed(double percent) {
        cim.set(percent);
    }

}
