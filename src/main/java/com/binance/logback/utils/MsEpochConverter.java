package com.binance.logback.utils;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class MsEpochConverter extends ClassicConverter {

/**
 * A logback converter that returns event's time in milliseconds since the epoch to String
 * 
 * @param e ILoggingEvent
 * @return the logging event time in milliseconds since the epoch as a String
 * 
 */

  @Override
  public final String convert(final ILoggingEvent e) {
    return Long.toString(e.getTimeStamp());
  }
}
