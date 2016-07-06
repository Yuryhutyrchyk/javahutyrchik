/**
 * 
 */
package lesson2;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;
import java.lang.Math;

/**
 * @author Yura
 *
 */
public class Tasks13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = -4;
		double b = 4;
		double x;
		int y;
		double dx = 0.5;
		for (x = a; x <= b; x += dx) {
			y = (int) (2 * x * x - 5 * x - 8);
			System.out.println(x + " | " + y);
		}
	}
}
