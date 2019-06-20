package org.cloudbus.cloudsim.power;

import org.cloudbus.cloudsim.CloudletScheduler;

public class DRLVm extends PowerVm {

    /**
     * Instantiates a new PowerVm.
     *
     * @param id the id
     * @param userId the user id
     * @param mips the mips
     * @param pesNumber the pes number
     * @param ram the ram
     * @param bw the bw
     * @param size the size
     * @param priority the priority
     * @param vmm the vmm
     * @param cloudletScheduler the cloudlet scheduler
     * @param schedulingInterval the scheduling interval
     */
    public DRLVm(
            final int id,
            final int userId,
            final double mips,
            final int pesNumber,
            final int ram,
            final long bw,
            final long size,
            final int priority,
            final String vmm,
            final CloudletScheduler cloudletScheduler,
            final double schedulingInterval) {
        super(id, userId, mips, pesNumber, ram, bw, size, priority, vmm, cloudletScheduler, schedulingInterval);
    }
}
