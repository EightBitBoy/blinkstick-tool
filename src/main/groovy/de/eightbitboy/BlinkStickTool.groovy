package de.eightbitboy

import blinkstick.*

class BlinkStickTool {
	static void main(String[] args) {
		println('Hello world!')

		BlinkStick device = BlinkStick.findFirst();
		println(device)

		int i = 1
		while(true){
			sleep(700)

			int prev = (i - 1) % 8
			int current = i % 8
			
			//device.setIndexedColor(0, prev, 0, 0, 0)
			device.setIndexedColor(0, current, 255, 0, 0)

			i++
		}

		System.exit(0)
	}
}
