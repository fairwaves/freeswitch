/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.freeswitch.swig;

public class Event {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Event(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Event obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      freeswitchJNI.delete_Event(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setEvent(SWIGTYPE_p_switch_event_t value) {
    freeswitchJNI.Event_event_set(swigCPtr, this, SWIGTYPE_p_switch_event_t.getCPtr(value));
  }

  public SWIGTYPE_p_switch_event_t getEvent() {
    long cPtr = freeswitchJNI.Event_event_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_switch_event_t(cPtr, false);
  }

  public void setSerialized_string(String value) {
    freeswitchJNI.Event_serialized_string_set(swigCPtr, this, value);
  }

  public String getSerialized_string() {
    return freeswitchJNI.Event_serialized_string_get(swigCPtr, this);
  }

  public void setMine(int value) {
    freeswitchJNI.Event_mine_set(swigCPtr, this, value);
  }

  public int getMine() {
    return freeswitchJNI.Event_mine_get(swigCPtr, this);
  }

  public Event(String type, String subclass_name) {
    this(freeswitchJNI.new_Event__SWIG_0(type, subclass_name), true);
  }

  public Event(SWIGTYPE_p_switch_event_t wrap_me, int free_me) {
    this(freeswitchJNI.new_Event__SWIG_1(SWIGTYPE_p_switch_event_t.getCPtr(wrap_me), free_me), true);
  }

  public String serialize(String format) {
    return freeswitchJNI.Event_serialize(swigCPtr, this, format);
  }

  public boolean setPriority(SWIGTYPE_p_switch_priority_t priority) {
    return freeswitchJNI.Event_setPriority(swigCPtr, this, SWIGTYPE_p_switch_priority_t.getCPtr(priority));
  }

  public String getHeader(String header_name) {
    return freeswitchJNI.Event_getHeader(swigCPtr, this, header_name);
  }

  public String getBody() {
    return freeswitchJNI.Event_getBody(swigCPtr, this);
  }

  public String getType() {
    return freeswitchJNI.Event_getType(swigCPtr, this);
  }

  public boolean addBody(String value) {
    return freeswitchJNI.Event_addBody(swigCPtr, this, value);
  }

  public boolean addHeader(String header_name, String value) {
    return freeswitchJNI.Event_addHeader(swigCPtr, this, header_name, value);
  }

  public boolean delHeader(String header_name) {
    return freeswitchJNI.Event_delHeader(swigCPtr, this, header_name);
  }

  public boolean fire() {
    return freeswitchJNI.Event_fire(swigCPtr, this);
  }

}
