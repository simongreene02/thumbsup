package com.djd.fun.thumbsup.util;

import java.nio.file.Paths;

import com.google.common.collect.ImmutableSet;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MoreMoreFilesTest {

  @Test
  public void anyExtensionMatches() {
    assertTrue(MoreMoreFiles.anyExtensionMatches(Paths.get("test.jpg"), ImmutableSet.of("JPG")));
  }

  @Test
  public void anyExtensionMatches_noMatch() {
    assertFalse(MoreMoreFiles.anyExtensionMatches(Paths.get("test.txt"), ImmutableSet.of("JPG")));
  }

  @Test
  public void isImageType_jpg_true() throws Exception {
    assertTrue(MoreMoreFiles.isImageType(Paths.get("test.jpg")));
  }

  @Test
  public void isImageType_JPG_true() throws Exception {
    assertTrue(MoreMoreFiles.isImageType(Paths.get("test.JPG")));
  }

  @Test
  public void isImageType_png_true() throws Exception {
    assertTrue(MoreMoreFiles.isImageType(Paths.get("test.png")));
  }

  @Test
  public void isImageType_PNG_true() throws Exception {
    assertTrue(MoreMoreFiles.isImageType(Paths.get("test.PNG")));
  }

  @Test
  public void isImageType_txt_false() throws Exception {
    assertFalse(MoreMoreFiles.isImageType(Paths.get("test.txt")));
  }
}