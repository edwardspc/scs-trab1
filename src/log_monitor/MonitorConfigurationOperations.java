package log_monitor;


/**
* log_monitor/MonitorConfigurationOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from logs.idl
* Wednesday, October 28, 2009 3:16:59 AM BRST
*/

public interface MonitorConfigurationOperations 
{
  long getInterval ();
  void setInterval (long interval);
  void addFile (String file);
  String[] getMonitoringFiles ();
  String getHost ();
} // interface MonitorConfigurationOperations
