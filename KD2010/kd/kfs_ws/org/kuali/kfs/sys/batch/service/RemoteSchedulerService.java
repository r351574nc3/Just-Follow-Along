/**
 * RemoteSchedulerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.kuali.kfs.sys.batch.service;

public interface RemoteSchedulerService extends java.rmi.Remote {
    public boolean runPurgeJob() throws java.rmi.RemoteException;
    public java.lang.String getStatus(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean runPurgeReportsAndStagingJob() throws java.rmi.RemoteException;
    public boolean runRemoteJob(java.lang.String jobName, java.lang.String requestorEmailAddress) throws java.rmi.RemoteException;
}
