package com.bc.ceres.glevel;

import java.awt.image.RenderedImage;

// todo - replace by LevelImageSource
/**
 * TODO - Apidoc
 *
 * @author Norman Fomferra
 * @version $revision$ $date$
 */
public interface LevelImageFactory {
    RenderedImage createLevelImage(int level);
}