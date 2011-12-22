/*
 * Copyright (c) 2010 Mark Allen.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.restfb.types;

import java.util.Date;

import com.restfb.Facebook;
import com.restfb.util.DateUtils;

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/video">Video Graph
 * API type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class Video extends FacebookType {
  @Facebook
  private CategorizedFacebookType from;

  @Facebook
  private String message;

  @Facebook
  private String description;

  @Facebook
  private Integer length;

  @Facebook("created_time")
  private String createdTime;

  @Facebook("updated_time")
  private String updatedTime;

  /**
   * An object containing the name and ID of the user who posted the video.
   * 
   * @return An object containing the name and ID of the user who posted the
   *         video.
   */
  public CategorizedFacebookType getFrom() {
    return from;
  }

  /**
   * The video title / caption.
   * 
   * @return The video title / caption.
   */
  public String getMessage() {
    return message;
  }

  /**
   * The long-form HTML description of the video.
   * 
   * @return The long-form HTML description of the video.
   */
  public String getDescription() {
    return description;
  }

  /**
   * The length of the video, in seconds.
   * 
   * @return The length of the video, in seconds.
   */
  public Integer getLength() {
    return length;
  }

  /**
   * The time the video was initially published.
   * 
   * @return The time the video was initially published.
   */
  public Date getCreatedTime() {
    return DateUtils.toDateFromLongFormat(createdTime);
  }

  /**
   * The last time the video or its caption were updated.
   * 
   * @return The last time the video or its caption were updated.
   */
  public Date getUpdatedTime() {
    return DateUtils.toDateFromLongFormat(updatedTime);
  }
}