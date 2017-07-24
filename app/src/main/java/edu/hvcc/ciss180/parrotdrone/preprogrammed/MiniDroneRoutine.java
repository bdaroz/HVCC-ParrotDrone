package edu.hvcc.ciss180.parrotdrone.preprogrammed;

import com.parrot.arsdk.arcommands.ARCOMMANDS_MINIDRONE_PILOTINGSTATE_FLYINGSTATECHANGED_STATE_ENUM;
import edu.hvcc.ciss180.parrotdrone.drone.MiniDrone;

/**
 * This class will be called on when the "Execute Program" Button is pushed on the drone controller.
 */
public class MiniDroneRoutine {

    private MiniDrone mMiniDrone;

    /**
     * Create the MiniDroneRoutine object and being the pre-programmed sequence. Will only begin the sequence if
     * the drone is currently hovering.
     *
     * @param miniDrone {@link MiniDrone} object to use to send commands
     */
    public MiniDroneRoutine(MiniDrone miniDrone) {
        mMiniDrone = miniDrone;

        // If the drone is not HOVERING, then don't execute.
        if (miniDrone.getFlyingState().equals(ARCOMMANDS_MINIDRONE_PILOTINGSTATE_FLYINGSTATECHANGED_STATE_ENUM
                .ARCOMMANDS_MINIDRONE_PILOTINGSTATE_FLYINGSTATECHANGED_STATE_HOVERING)) {
            execute();
        }
    }

    /**
     * This method is called when the class is initialized and should contain the sequence to command the drone.
     */
    public void execute() {
        // Make your drone do things here....

        // Some quick help:

        // Use "mMiniDrone.setRoll(n);" where n is a number from -100 to 100 to fly the drone left or right.
        // Negative numbers are left, positive right. Use numbers closer to 0 for slower speeds, and closer to
        // +- 100 for faster speeds. 0 to stop the roll.

        // Use "mMiniDrone.setPitch(n);" where n is a number from -100 to 100 to fly the drone forward or backward.
        // Negative numbers are backward, positive forward. Use numbers closer to 0 for slower speeds, and closer to
        // +- 100 for faster speeds. 0 to stop the pitch.

        // Use "mMiniDrone.setFlag(n);" where n is a 0 or 1, to tell the drone to use the pitch and/or roll values,
        // if set to 1, or to ignore them, if set to 0. In other words, this needs to be set to 1 if you want to pitch
        // or roll the drone.

        // Use "mMiniDrone.setYaw(n);" where n is a number from -100 to 100 to spin the drone clockwise or
        // counterclockwise. Negative numbers are counter-clockwise, positive clockwise. Use numbers closer to 0 for
        // slower speeds, and closer to +- 100 for faster speeds. 0 to stop the spin.

        // Use "mMiniDrone.setGaz(n);" where n is a number from -100 to 100 to fly the drone up or down vertically.
        // Negative numbers are down, positive up. Use numbers closer to 0 for slower speeds, and closer to
        // +- 100 for faster speeds. 0 to stop the vertical motion.

        // Keep in mind these method will return immediately... If you want your drone do maintain an action for
        // some amount of time, you will need to sleep the thread.
        // Use "Thread.sleep(mills);"
    }
}
