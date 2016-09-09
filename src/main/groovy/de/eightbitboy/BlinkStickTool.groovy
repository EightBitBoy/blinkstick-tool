package de.eightbitboy

import blinkstick.*

class BlinkStickTool {
	static void main(String[] args) {
		println('Hello world!')

		BlinkStick device = BlinkStick.findFirst();
		println(device)
		device.setColor(100, 0, 255)

		System.exit(0)
	}
}
