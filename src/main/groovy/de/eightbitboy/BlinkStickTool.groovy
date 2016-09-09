package de.eightbitboy

import blinkstick.*

class BlinkStickTool {
	static void main(String[] args) {
		println('Hello world!')

		BlinkStick device = BlinkStick.findFirst();
		println(device)

		int i = 1
		while(true){
			sleep(70)

			int prev = (i - 1) % 8
			int current = i % 8
			
			device.setIndexedColor(0, prev, 0, 0, 0)
			sleep(20)
			device.setIndexedColor(0, current, 255, 0, (i * 4) % 255)

			i++
			i = i % 255
		}

		System.exit(0)
	}
}
