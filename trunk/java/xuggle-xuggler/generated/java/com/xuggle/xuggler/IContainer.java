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
 * A file (or network data source) that contains one or more {@link 
 * IStream}s of  
 * audio and video data.  
 */
public class IContainer extends RefCounted implements com.xuggle.xuggler.IConfigurable {
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

  protected IContainer(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIContainerUpcast(cPtr), cMemoryOwn);
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
  public static long getCPtr(IContainer obj) {
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
   * Create a new IContainer object that is actually referring to the
   * exact same underlying Native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IContainer copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      IContainer retval = new IContainer(swigCPtr, false);
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
    if (obj instanceof IContainer)
      equal = (((IContainer)obj).swigCPtr == this.swigCPtr);
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
 * Set the buffer length we'll suggest to FFMPEG for reading inputs. 
 *  
 * If called when a IContainer is open, the call is ignored and -1 is 
 * returned.  
 * @param	size The suggested buffer size.  
 * @return	size on success; <0 on error.  
 */
  public int setInputBufferLength(long size) {
    return XugglerJNI.IContainer_setInputBufferLength(swigCPtr, this, size);
  }

/**
 * Return the input buffer length.  
 * @return	The input buffer length we've told FFMPEG to assume. 0 means 
 *		 FFMPEG should choose it's own  
 * size (and it'll probably be 32768).  
 */
  public long getInputBufferLength() {
    return XugglerJNI.IContainer_getInputBufferLength(swigCPtr, this);
  }

/**
 * Is this container opened?  
 * @return	true if opened; false if not.  
 */
  public boolean isOpened() {
    return XugglerJNI.IContainer_isOpened(swigCPtr, this);
  }

/**
 * Has a header been successfully written?  
 * @return	true if yes, false if no.  
 */
  public boolean isHeaderWritten() {
    return XugglerJNI.IContainer_isHeaderWritten(swigCPtr, this);
  }

/**
 * Open this container and make it ready for reading or writing.  
 *  
 * it for them later but warn to the logging system.  
 * This just forwards to {@link #open(String, Type, IContainerFormat, 
 * boolean, boolean)}  
 * passing false for aStreamsCanBeAddedDynamically, and true for aLookForAllStreams. 
 *  
 * @param	url The resource to open; The format of this string is any 
 *		  
 * url that FFMPEG supports (including additional protocols if added 
 *  
 * through the xuggler.io library).  
 * @param	type The type of this container.  
 * @param	pContainerFormat A pointer to a ContainerFormat object specifying 
 *		  
 * the format of this container, or 0 (NULL) if you want us to guess. 
 *  
 * @return	>= 0 on success; < 0 on error.  
 */
  public int open(String url, IContainer.Type type, IContainerFormat pContainerFormat) {
    return XugglerJNI.IContainer_open__SWIG_0(swigCPtr, this, url, type.swigValue(), IContainerFormat.getCPtr(pContainerFormat), pContainerFormat);
  }

/**
 * Open this container and make it ready for reading or writing, optionally 
 *  
 * reading as far into the container as necessary to find all streams. 
 *  
 *  
 * it for them later but warn to the logging system.  
 * @param	url The resource to open; The format of this string is any 
 *		  
 * url that FFMPEG supports (including additional protocols if added 
 *  
 * through the xuggler.io library).  
 * @param	type The type of this container.  
 * @param	pContainerFormat A pointer to a ContainerFormat object specifying 
 *		  
 * the format of this container, or 0 (NULL) if you want us to guess. 
 *  
 * @param	aStreamsCanBeAddedDynamically If true, open() will expect 
 *		 that new  
 * streams can be added at any time, even after the format header has 
 * been read.  
 * @param	aQueryStreamMetaData If true, open() will call {@link #queryStreamMetaData()} 
 *		  
 * on this container, which will potentially block until it has ready 
 *  
 * enough data to find all streams in a container. If false, it will 
 * only  
 * block to read a minimal header for this container format.  
 * @return	>= 0 on success; < 0 on error.  
 */
  public int open(String url, IContainer.Type type, IContainerFormat pContainerFormat, boolean aStreamsCanBeAddedDynamically, boolean aQueryStreamMetaData) {
    return XugglerJNI.IContainer_open__SWIG_1(swigCPtr, this, url, type.swigValue(), IContainerFormat.getCPtr(pContainerFormat), pContainerFormat, aStreamsCanBeAddedDynamically, aQueryStreamMetaData);
  }

/**
 * Returns the IContainerFormat object being used for this IContainer, 
 *  
 * or null if we don't yet know.  
 * @return	the IContainerFormat object, or null.  
 */
  public IContainerFormat getContainerFormat() {
    long cPtr = XugglerJNI.IContainer_getContainerFormat(swigCPtr, this);
    return (cPtr == 0) ? null : new IContainerFormat(cPtr, false);
  }

/**
 * Close the container. open() must have been called first, or  
 * else an error is returned.  
 * @return	>= 0 on success; < 0 on error.  
 */
  public int close() {
    return XugglerJNI.IContainer_close(swigCPtr, this);
  }

/**
 * Find out the type of this container.  
 * @return	The Type of this container. READ if not yet opened.  
 */
  public IContainer.Type getType() {
    return IContainer.Type.swigToEnum(XugglerJNI.IContainer_getType(swigCPtr, this));
  }

/**
 * The number of streams in this container.  
 * If opened in READ mode we'll query the stream and find out  
 * how many streams are in it.  
 *  
 * the caller has added to date.  
 * @return	The number of streams in this container.  
 */
  public int getNumStreams() {
    return XugglerJNI.IContainer_getNumStreams(swigCPtr, this);
  }

/**
 * Get the stream at the given position.  
 * @return	The stream at that position in the container, or null if 
 *		 none there.  
 */
  public IStream getStream(long position) {
    long cPtr = XugglerJNI.IContainer_getStream(swigCPtr, this, position);
    return (cPtr == 0) ? null : new IStream(cPtr, false);
  }

/**
 * Creates a new stream in this container and returns it.  
 * @param	id A format-dependent id for this stream.  
 * @return	A new stream.  
 */
  public IStream addNewStream(int id) {
    long cPtr = XugglerJNI.IContainer_addNewStream(swigCPtr, this, id);
    return (cPtr == 0) ? null : new IStream(cPtr, false);
  }

/**
 * Adds a header, if needed, for this container.  
 * Call this AFTER you've added all streams you want to add,  
 * opened all IStreamCoders for those streams (with proper  
 * configuration) and  
 * before you write the first frame. If you attempt to write  
 * a header but haven't opened all codecs, this method will log  
 * a warning.  
 * @return	0 if successful. < 0 if not. Always -1 if this is  
 * a READ container.  
 */
  public int writeHeader() {
    return XugglerJNI.IContainer_writeHeader(swigCPtr, this);
  }

/**
 * Adds a trailer, if needed, for this container.  
 * Call this AFTER you've written all data you're going to write  
 * to this container but BEFORE you close your IStreamCoders.  
 * <p>  
 * You must call {@link #writeHeader()} before you call  
 * this (and if you don't, we'll warn loudly and not actually write 
 * the trailer).  
 * </p>  
 * <p>  
 * If you have closed any of the IStreamCoder objects that were open 
 * when you called  
 * {@link #writeHeader()}, then this method will fail.  
 * </p>  
 * @return	0 if successful. < 0 if not. Always -1 if this is  
 * a READ container.  
 */
  public int writeTrailer() {
    return XugglerJNI.IContainer_writeTrailer(swigCPtr, this);
  }

/**
 * Reads the next packet into the IPacket. This method will  
 * release any buffers currently help by this packet and allocate  
 * new ones (sorry; such is the way FFMPEG works).  
 * @param	packet [In/Out] The packet we read into.  
 * @return	# of bytes read if successful, or -1 if not.  
 */
  public int readNextPacket(IPacket packet) {
    return XugglerJNI.IContainer_readNextPacket(swigCPtr, this, IPacket.getCPtr(packet), packet);
  }

/**
 * Writes the contents of the packet to the container.  
 * @param	packet [In] The packet to write out.  
 * @param	forceInterleave [In] If true, then we will make sure all packets 
 *		  
 * are interleaved by DTS (even across streams in a container). If false, 
 * we won't,  
 * and it's up to the caller to interleave if necessary.  
 * @return	# of bytes read if successful, or -1 if not.  
 */
  public int writePacket(IPacket packet, boolean forceInterleave) {
    return XugglerJNI.IContainer_writePacket__SWIG_0(swigCPtr, this, IPacket.getCPtr(packet), packet, forceInterleave);
  }

/**
 * Writes the contents of the packet to the container, but make sure 
 * the packets are  
 * interleaved.  
 * This means we may have to queue up packets from one stream while 
 * waiting for  
 * packets from another.  
 * @param	packet [In] The packet to write out.  
 * @return	# of bytes read if successful, or -1 if not.  
 */
  public int writePacket(IPacket packet) {
    return XugglerJNI.IContainer_writePacket__SWIG_1(swigCPtr, this, IPacket.getCPtr(packet), packet);
  }

/**
 * Create a new container object.  
 * @return	a new container, or null on error.  
 */
  public static IContainer make() {
    long cPtr = XugglerJNI.IContainer_make();
    return (cPtr == 0) ? null : new IContainer(cPtr, false);
  }

/**
 * Attempts to read all the meta data in this stream, potentially by 
 * reading ahead  
 * and decoding packets.  
 * Any packets this method reads ahead will be cached and correctly 
 * returned when you  
 * read packets, but this method can be non-blocking potentially until 
 * end of container  
 * to get all meta data. Take care when you call it.  
 * After this method is called, other meta data methods like {@link 
 * #getDuration()} should  
 * work.  
 * @return	>= 0 on success; <0 on failure.  
 */
  public int queryStreamMetaData() {
    return XugglerJNI.IContainer_queryStreamMetaData(swigCPtr, this);
  }

/**
 * Seeks to the key frame at (or the first one after) the given timestamp. 
 * This method will  
 * always fail for any IContainer that is not seekable (e.g. is streamed). 
 * When successful  
 * the next call to {@link #readNextPacket(IPacket)} will get the next 
 * keyframe from the  
 * sought for stream.  
 * @param	streamIndex The stream to search for the keyframe in; must 
 *		 be a stream we've either queried  
 * meta-data about or already ready a packet for.  
 * @param	timestamp The timestamp, in the timebase of the stream you're 
 *		 looking in (not necessarily Microseconds).  
 * @param	flags Flags to pass to com.xuggle.xuggler.io.IURLProtocolHandler's 
 *		 seek method.  
 * @return	>= 0 on success; <0 on failure.  
 */
  public int seekKeyFrame(int streamIndex, long timestamp, int flags) {
    return XugglerJNI.IContainer_seekKeyFrame(swigCPtr, this, streamIndex, timestamp, flags);
  }

/**
 * Gets the duration, if known, of this container.  
 * This will only work for non-streamable containers where we can calculate 
 * the container size.  
 * @return	The duration, or {@link Global#NO_PTS} if not known.  
 */
  public long getDuration() {
    return XugglerJNI.IContainer_getDuration(swigCPtr, this);
  }

/**
 * Get the starting timestamp in microseconds of the first packet of 
 * the earliest stream in this container.  
 * This will only return value values either either (a) for non-streamable 
 *  
 * containers where we can calculate the container size or (b) after 
 * we've actually read the  
 * first packet from a streamable source.  
 * @return	The starting timestamp in microseconds, or {@link Global#NO_PTS} 
 *		 if not known.  
 */
  public long getStartTime() {
    return XugglerJNI.IContainer_getStartTime(swigCPtr, this);
  }

/**
 * Get the file size in bytes of this container.  
 * This will only return a valid value if the container is non-streamed 
 * and supports seek.  
 * @return	The file size in bytes, or <0 on error.  
 */
  public long getFileSize() {
    return XugglerJNI.IContainer_getFileSize(swigCPtr, this);
  }

/**
 * Get the calculated overall bit rate of this file.  
 * This will only return a valid value if the container is non-streamed 
 * and supports seek.  
 * @return	The overall bit rate in bytes per second, or <0 on error. 
 *		  
 */
  public int getBitRate() {
    return XugglerJNI.IContainer_getBitRate(swigCPtr, this);
  }

/**
 * Returns the total number of settable properties on this object  
 * @return	total number of options (not including constant definitions) 
 *		  
 */
  public int getNumProperties() {
    return XugglerJNI.IContainer_getNumProperties(swigCPtr, this);
  }

/**
 * Returns the name of the numbered property.  
 * @param	propertyNo The property number in the options list.  
 * @return	an IProperty value for this properties meta-data  
 */
  public IProperty getPropertyMetaData(int propertyNo) {
    long cPtr = XugglerJNI.IContainer_getPropertyMetaData__SWIG_0(swigCPtr, this, propertyNo);
    return (cPtr == 0) ? null : new IProperty(cPtr, false);
  }

/**
 * Returns the name of the numbered property.  
 * @param	name The property name.  
 * @return	an IProperty value for this properties meta-data  
 */
  public IProperty getPropertyMetaData(String name) {
    long cPtr = XugglerJNI.IContainer_getPropertyMetaData__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new IProperty(cPtr, false);
  }

/**
 * Sets a property on this Object.  
 * All AVOptions supported by the underlying AVClass are supported. 
 *  
 * @param	name The property name. For example "b" for bit-rate.  
 * @param	value The value of the property.  
 * @return	>= 0 if the property was successfully set; <0 on error  
 */
  public int setProperty(String name, String value) {
    return XugglerJNI.IContainer_setProperty__SWIG_0(swigCPtr, this, name, value);
  }

/**
 * Looks up the property 'name' and sets the  
 * value of the property to 'value'.  
 * @param	name name of option  
 * @param	value Value of option  
 * @return	>= 0 on success; <0 on error.  
 */
  public int setProperty(String name, double value) {
    return XugglerJNI.IContainer_setProperty__SWIG_1(swigCPtr, this, name, value);
  }

/**
 * Looks up the property 'name' and sets the  
 * value of the property to 'value'.  
 * @param	name name of option  
 * @param	value Value of option  
 * @return	>= 0 on success; <0 on error.  
 */
  public int setProperty(String name, long value) {
    return XugglerJNI.IContainer_setProperty__SWIG_2(swigCPtr, this, name, value);
  }

/**
 * Looks up the property 'name' and sets the  
 * value of the property to 'value'.  
 * @param	name name of option  
 * @param	value Value of option  
 * @return	>= 0 on success; <0 on error.  
 */
  public int setProperty(String name, boolean value) {
    return XugglerJNI.IContainer_setProperty__SWIG_3(swigCPtr, this, name, value);
  }

/**
 * Looks up the property 'name' and sets the  
 * value of the property to 'value'.  
 * @param	name name of option  
 * @param	value Value of option  
 * @return	>= 0 on success; <0 on error.  
 */
  public int setProperty(String name, IRational value) {
    return XugglerJNI.IContainer_setProperty__SWIG_4(swigCPtr, this, name, IRational.getCPtr(value), value);
  }

/**
 * Gets a property on this Object.  
 * Note for C++ callers; you must free the returned array with  
 * delete[] in order to avoid a memory leak. Other language  
 * folks need not worry.  
 * @param	name property name  
 * @return	an string copy of the option value, or null if the option 
 *		 doesn't exist.  
 */
  public String getPropertyAsString(String name) {
    return XugglerJNI.IContainer_getPropertyAsString(swigCPtr, this, name);
  }

/**
 * Gets the value of this property, and returns as a double;  
 * @param	name name of option  
 * @return	double value of property, or 0 on error.  
 */
  public double getPropertyAsDouble(String name) {
    return XugglerJNI.IContainer_getPropertyAsDouble(swigCPtr, this, name);
  }

/**
 * Gets the value of this property, and returns as an long;  
 * @param	name name of option  
 * @return	long value of property, or 0 on error.  
 */
  public long getPropertyAsLong(String name) {
    return XugglerJNI.IContainer_getPropertyAsLong(swigCPtr, this, name);
  }

/**
 * Gets the value of this property, and returns as an IRational;  
 * @param	name name of option  
 * @return	long value of property, or 0 on error.  
 */
  public IRational getPropertyAsRational(String name) {
    long cPtr = XugglerJNI.IContainer_getPropertyAsRational(swigCPtr, this, name);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Gets the value of this property, and returns as a boolean  
 * @param	name name of option  
 * @return	boolean value of property, or false on error.  
 */
  public boolean getPropertyAsBoolean(String name) {
    return XugglerJNI.IContainer_getPropertyAsBoolean(swigCPtr, this, name);
  }

/**
 * Get the flags associated with this object.  
 * @return	The (compacted) value of all flags set.  
 */
  public int getFlags() {
    return XugglerJNI.IContainer_getFlags(swigCPtr, this);
  }

/**
 * Set the flags to use with this object. All values  
 * must be ORed (|) together.  
 * @see		Flags  
 * @param	newFlags The new set flags for this codec.  
 */
  public void setFlags(int newFlags) {
    XugglerJNI.IContainer_setFlags(swigCPtr, this, newFlags);
  }

/**
 * Get the setting for the specified flag  
 * @param	flag The flag you want to find the setting for  
 * @return	0 for false; non-zero for true  
 */
  public boolean getFlag(IContainer.Flags flag) {
    return XugglerJNI.IContainer_getFlag(swigCPtr, this, flag.swigValue());
  }

/**
 * Set the flag.  
 * @param	flag The flag to set  
 * @param	value The value to set it to (true or false)  
 */
  public void setFlag(IContainer.Flags flag, boolean value) {
    XugglerJNI.IContainer_setFlag(swigCPtr, this, flag.swigValue(), value);
  }

/**
 * Get the URL we've opened, or null if unknown.  
 * @return	the URL opened, or null.  
 */
  public String getURL() {
    return XugglerJNI.IContainer_getURL(swigCPtr, this);
  }

/**
 * Flush all packets to output.  
 * Will only work on output containers.  
 * @return	>= 0 on success; <0 on error  
 */
  public int flushPackets() {
    return XugglerJNI.IContainer_flushPackets(swigCPtr, this);
  }

  public enum Type {
  /**
   * The different types of Containers we support. A container
   * may only be opened in a uni-directional mode.
   */
    READ,
    WRITE;

    public final int swigValue() {
      return swigValue;
    }

    public static Type swigToEnum(int swigValue) {
      Type[] swigValues = Type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Type(Type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum Flags {
    FLAG_GENPTS(XugglerJNI.IContainer_FLAG_GENPTS_get()),
    FLAG_IGNIDX(XugglerJNI.IContainer_FLAG_IGNIDX_get()),
    FLAG_NONBLOCK(XugglerJNI.IContainer_FLAG_NONBLOCK_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Flags swigToEnum(int swigValue) {
      Flags[] swigValues = Flags.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Flags swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Flags.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Flags() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Flags(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Flags(Flags swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
