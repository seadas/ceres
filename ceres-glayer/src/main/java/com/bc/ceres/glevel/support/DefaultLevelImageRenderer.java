package com.bc.ceres.glevel.support;

import com.bc.ceres.glevel.LevelImage;
import com.bc.ceres.glevel.LevelImageRenderer;
import com.bc.ceres.grender.Rendering;

import java.awt.geom.AffineTransform;

public class DefaultLevelImageRenderer implements LevelImageRenderer {

    public DefaultLevelImageRenderer() {
    }

    public void renderImage(Rendering rendering, LevelImage levelImage, int level) {
        final AffineTransform i2m = levelImage.getImageToModelTransform(level);
        final AffineTransform m2v = rendering.getViewport().getModelToViewTransform();
        i2m.preConcatenate(m2v);
        rendering.getGraphics().drawRenderedImage(levelImage.getPlanarImage(level), i2m);
    }

    public void dispose() {
        // no state to dispose
    }
}