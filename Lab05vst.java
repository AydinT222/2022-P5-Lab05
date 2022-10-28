// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial") // java kept giving this warning
public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int offsetX = 20;
        int offsetY = 12;
        int ref_x1 = 10;
        int ref_y = 640;
        int ref_x2 = 990;
        int x1 = ref_x1;
        int y1 = ref_y;
        int x2 = ref_x2;
        int y2 = ref_y;
        
        final int interations = 50;
        
        g.drawRect(10,10,width,height);
        // this all probably could be optimized into a function
        for (int k = 0; k < interations; k++) {
            g.drawLine(
                    x1,
                    y1,
                    x2,
                    y2
            );
            x1 += offsetX;
            y2 -= offsetY;
        }
        // just inversing on X
        x1 = ref_x1;
        y2 = ref_y;
        for (int k = 0; k < interations; k++) {
            g.drawLine(
                    x2,
                    y2,
                    x1,
                    y1
            );
            x2 -= offsetX;
            y1 -= offsetY;
        }
        // flip Y
        y1 = ref_x1;
        x2 = ref_x2;
        y2 = ref_x1;
        for (int k = 0; k < interations; k++) {
            g.drawLine(
                    x1,
                    y1,
                    x2,
                    y2
            );
            x1 += offsetX;
            y2 += offsetY;
        }
        // inverse XY
        x1 = ref_x1;
        y2 = ref_x1;
        for (int k = 0; k < interations; k++) {
            g.drawLine(
                    x2,
                    y2,
                    x1,
                    y1
            );
            x2 -= offsetX;
            y1 += offsetY;
        }
        
        // the smaller scaled part
        /*offsetY = 14;
        ref_x1 = 260;
        ref_y = 495;
        ref_x2 = 750;
        x1 = ref_x1;
        y1 = ref_y;
        x2 = ref_x2;
        y2 = ref_y;
        iterations = 25;*/
        offsetX = offsetX / 2;
        offsetY = (offsetY / 2) + 1;
        ref_x1 = 255;
        ref_y = 495;
        ref_x2 = 745;
        x1 = ref_x1;
        y1 = ref_y;
        x2 = ref_x2;
        y2 = ref_y;
        // now just repeat
        for (int k = 0; k < interations; k++) {
            g.drawLine(
                    x1,
                    y1,
                    x2,
                    y2
            );
            x1 += offsetX;
            y2 -= offsetY;
        }
        // just inversing on X
        x1 = ref_x1;
        y2 = ref_y;
        for (int k = 0; k < interations; k++) {
            g.drawLine(
                    x2,
                    y2,
                    x1,
                    y1
            );
            x2 -= offsetX;
            y1 -= offsetY;
        }
        // flip Y
        ref_y = 155; // 150 (170)

        y1 = ref_y;
        x2 = ref_x2;
        y2 = ref_y;
        for (int k = 0; k < interations; k++) {
            g.drawLine(
                    x1,
                    y1,
                    x2,
                    y2
            );
            x1 += offsetX;
            y2 += offsetY;
        }
        // inverse XY
        x1 = ref_x1;
        y2 = ref_y;
        for (int k = 0; k < interations; k++) {
            g.drawLine(
                    x2,
                    y2,
                    x1,
                    y1
            );
            x2 -= offsetX;
            y1 += offsetY;
        }
    }
}
