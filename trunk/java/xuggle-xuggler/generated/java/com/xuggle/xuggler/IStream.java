/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * Represents a stream of similar data (eg video) in a {@link IContainer}. 
 *  
 * <p>  
 * Streams are really virtual concepts; {@link IContainer}s really just 
 * contain  
 * a bunch of {@link IPacket}s. But each {@link IPacket} usually has 
 * a stream  
 * id associated with it, and all {@link IPacket}s with that stream 
 * id represent  
 * the same type of (usually time-based) data. For example in many FLV 
 *  
 * video files, there is a stream with id "0" that contains all video 
 * data, and  
 * a stream with id "1" that contains all audio data.  
 * </p><p>  
 * You use an {@link IStream} object to get properly configured {@link 
 * IStreamCoder}  
 * for decoding, and to tell {@link IStreamCoder}s how to encode {@link 
 * IPacket}s when  
 * decoding.  
 * </p>  
 */
public class IStream extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  protected IStream(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIStreamUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IStream obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IStream object that is actually referring to the
   * exact same underlying Native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IStream copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      IStream retval = new IStream(swigCPtr, false);
      retval.acquire();
      return retval;
    }
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IStream)
      equal = (((IStream)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
    super.delete();
  }

/**
 * @return	The direction of this stream.  
 */
  public IStream.Direction getDirection() {
    return IStream.Direction.swigToEnum(XugglerJNI.IStream_getDirection(swigCPtr, this));
  }

/**
 * @return	The Index within the Container of this stream.  
 */
  public int getIndex() {
    return XugglerJNI.IStream_getIndex(swigCPtr, this);
  }

/**
 * @return	The (container format specific) id of this stream.  
 */
  public int getId() {
    return XugglerJNI.IStream_getId(swigCPtr, this);
  }

/**
 * This method gets the StreamCoder than can manipulate this stream. 
 *  
 * If the stream is an INBOUND stream, then the StreamCoder can  
 * do a IStreamCoder::DECODE. IF this stream is an OUTBOUND stream, 
 *  
 * then the StreamCoder can do all IStreamCoder::ENCODE methods.  
 * @return	The StreamCoder assigned to this object.  
 */
  public IStreamCoder getStreamCoder() {
    long cPtr = XugglerJNI.IStream_getStreamCoder(swigCPtr, this);
    return (cPtr == 0) ? null : new IStreamCoder(cPtr, false);
  }

/**
 * Get the (sometimes estimated) frame rate of this container.  
 *  
 * an approimation. Better to use getTimeBase().  
 * For contant frame-rate containers, this will be 1 ( getTimeBase() 
 * )  
 * @return	The frame-rate of this container.  
 */
  public IRational getFrameRate() {
    long cPtr = XugglerJNI.IStream_getFrameRate(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * The time base in which all timestamps (e.g. Presentation Time Stamp 
 * (PTS)  
 * and Decompression Time Stamp (DTS)) are represented. For example 
 *  
 * if the time base is 1/1000, then the difference between a PTS of 
 * 1 and  
 * a PTS of 2 is 1 millisecond. If the timebase is 1/1, then the difference 
 *  
 * between a PTS of 1 and a PTS of 2 is 1 second.  
 * @return	The time base of this stream.  
 */
  public IRational getTimeBase() {
    long cPtr = XugglerJNI.IStream_getTimeBase(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * @return	The start time, in getTimeBase units, when this stream started. 
 *		  
 */
  public long getStartTime() {
    return XugglerJNI.IStream_getStartTime(swigCPtr, this);
  }

/**
 * @return	The duration (in getTimeBase units) of this stream, if known. 
 *		  
 */
  public long getDuration() {
    return XugglerJNI.IStream_getDuration(swigCPtr, this);
  }

/**
 * @return	The current Decompression Time Stamp that will be used on 
 *		 this stream.  
 */
  public long getCurrentDts() {
    return XugglerJNI.IStream_getCurrentDts(swigCPtr, this);
  }

/**
 * @return	The number of index entries in this stream.  
 */
  public int getNumIndexEntries() {
    return XugglerJNI.IStream_getNumIndexEntries(swigCPtr, this);
  }

/**
 * Returns the number of encoded frames if known. Note that frames here 
 * means  
 * encoded frames, which can consist of many encoded audio samples, 
 * or  
 * an encoded video frame.  
 * @return	The number of frames (encoded) in this stream.  
 */
  public long getNumFrames() {
    return XugglerJNI.IStream_getNumFrames(swigCPtr, this);
  }

/**
 * Gets the sample aspect ratio.  
 * @return	The sample aspect ratio.  
 */
  public IRational getSampleAspectRatio() {
    long cPtr = XugglerJNI.IStream_getSampleAspectRatio(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Sets the sample aspect ratio.  
 * @param	newRatio The new ratio.  
 */
  public void setSampleAspectRatio(IRational newRatio) {
    XugglerJNI.IStream_setSampleAspectRatio(swigCPtr, this, IRational.getCPtr(newRatio), newRatio);
  }

/**
 * Get the 4-character language setting for this stream.  
 * This will return null if no setting. When calling  
 * from C++, callers must ensure that the IStream outlives the  
 * value returned.  
 */
  public String getLanguage() {
    return XugglerJNI.IStream_getLanguage(swigCPtr, this);
  }

/**
 * Set the 4-character language setting for this stream.  
 * If a string longer than 4 characters is passed in, only the  
 * first 4 characters is copied.  
 * @param	language The new language setting. null is equivalent to the 
 *		  
 * empty string. strings longer than 4 characters will be truncated 
 *  
 * to first 4 characters.  
 */
  public void setLanguage(String language) {
    XugglerJNI.IStream_setLanguage(swigCPtr, this, language);
  }

/**
 * Get the underlying container for this stream, or null if we  
 * don't know.  
 * @return	the container, or null if we don't know.  
 */
  public IContainer getContainer() {
    long cPtr = XugglerJNI.IStream_getContainer(swigCPtr, this);
    return (cPtr == 0) ? null : new IContainer(cPtr, false);
  }

/**
 * Sets the stream coder to use for this stream.  
 * This method will only cause a change if the IStreamCoder currently 
 * set on this  
 * IStream is not open. Otherwise the call is ignore and an error is 
 * returned.  
 * @param	newCoder The new stream coder to use.  
 * @return	>= 0 on success; < 0 on error.  
 */
  public int setStreamCoder(IStreamCoder newCoder) {
    return XugglerJNI.IStream_setStreamCoder(swigCPtr, this, IStreamCoder.getCPtr(newCoder), newCoder);
  }

  public enum Direction {
  /**
   * The direction this stream is going (based on the container).
   * If the container Container is opened in Container::READ mode
   * then this will be INBOUND. If it's opened in Container::WRITE
   * mode, then this will be OUTBOUND.
   */
    INBOUND,
    OUTBOUND;

    public final int swigValue() {
      return swigValue;
    }

    public static Direction swigToEnum(int swigValue) {
      Direction[] swigValues = Direction.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Direction swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Direction.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Direction() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Direction(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Direction(Direction swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
