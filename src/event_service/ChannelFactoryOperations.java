package event_service;


/**
* event_service/ChannelFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from events.idl
* Tuesday, October 27, 2009 9:23:50 PM BRST
*/

public interface ChannelFactoryOperations 
{
  scs.core.IComponent create (String name) throws event_service.NameAlreadyInUse;
  void destroy (String name) throws event_service.InvalidName;
} // interface ChannelFactoryOperations