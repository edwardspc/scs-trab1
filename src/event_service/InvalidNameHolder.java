package event_service;

/**
* event_service/InvalidNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from events.idl
* Tuesday, October 27, 2009 9:23:50 PM BRST
*/

public final class InvalidNameHolder implements org.omg.CORBA.portable.Streamable
{
  public event_service.InvalidName value = null;

  public InvalidNameHolder ()
  {
  }

  public InvalidNameHolder (event_service.InvalidName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = event_service.InvalidNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    event_service.InvalidNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return event_service.InvalidNameHelper.type ();
  }

}