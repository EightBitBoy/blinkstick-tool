package de.eightbitboy

import blinkstick.*

class BlinkStickTool {
	static void main(String[] args) {
		println('Hello world!')

		BlinkStick device = BlinkStick.findFirst();
		println(device)
	}
}
