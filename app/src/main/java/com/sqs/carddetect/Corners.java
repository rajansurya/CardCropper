package com.sqs.carddetect;

import org.opencv.core.Point;
import org.opencv.core.Size;

import java.util.List;

public class Corners {
    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public List<Point> getCorners() {
        return corners;
    }

    public void setCorners(List<Point> corners) {
        this.corners = corners;
    }

    private List<Point> corners;
}
