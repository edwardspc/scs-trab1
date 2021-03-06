package log_viewer;


/**
* log_viewer/ViewAdministrationMonitoringHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from logs.idl
* Wednesday, October 28, 2009 3:16:59 AM BRST
*/

abstract public class ViewAdministrationMonitoringHelper
{
  private static String  _id = "IDL:log_viewer/ViewAdministrationMonitoring:1.0";

  public static void insert (org.omg.CORBA.Any a, log_viewer.ViewAdministrationMonitoring that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static log_viewer.ViewAdministrationMonitoring extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (log_viewer.ViewAdministrationMonitoringHelper.id (), "ViewAdministrationMonitoring");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static log_viewer.ViewAdministrationMonitoring read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ViewAdministrationMonitoringStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, log_viewer.ViewAdministrationMonitoring value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static log_viewer.ViewAdministrationMonitoring narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof log_viewer.ViewAdministrationMonitoring)
      return (log_viewer.ViewAdministrationMonitoring)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      log_viewer._ViewAdministrationMonitoringStub stub = new log_viewer._ViewAdministrationMonitoringStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static log_viewer.ViewAdministrationMonitoring unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof log_viewer.ViewAdministrationMonitoring)
      return (log_viewer.ViewAdministrationMonitoring)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      log_viewer._ViewAdministrationMonitoringStub stub = new log_viewer._ViewAdministrationMonitoringStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
