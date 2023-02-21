package com.binance.logback.utils;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class MsEpochConverter extends ClassicConverter {

  @Override
  public final String convert(final ILoggingEvent e) {
    return Long.toString(e.getTimeStamp());
  }
}
