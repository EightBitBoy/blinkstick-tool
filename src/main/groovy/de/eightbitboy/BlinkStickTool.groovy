package de.eightbitboy

import blinkstick.*

class BlinkStickTool {
	static int PAUSE = 20

	static void main(String[] args) {
		println('Hello world!')

		BlinkStick device = BlinkStick.findFirst();
		println(device)

		int i = 1
		while(true){
			sleep(20)

			int index0 = (i + 0) % 8
			int index1 = (i + 1) % 8
			int index2 = (i + 2) % 8
			int index3 = (i + 3) % 8
			int index4 = (i + 4) % 8
			int index5 = (i + 5) % 8
			int index6 = (i + 6) % 8
			int index7 = (i + 7) % 8
			
			device.setIndexedColor(0, index0, (i * 4) % 255, 255, (i * 4) % 255)
			sleep(PAUSE)
			device.setIndexedColor(0, index1, 0, 255, (i * 4) % 255)
			sleep(PAUSE)
			device.setIndexedColor(0, index2, 255, 0, (i * 4) % 255)
			sleep(PAUSE)
			device.setIndexedColor(0, index3, 255, (i * 4) % 255, 0)
			sleep(PAUSE)
			device.setIndexedColor(0, index4, 0, (i * 4) % 255, 255)
			sleep(PAUSE)
			device.setIndexedColor(0, index5, (i * 4) % 255, 0, 255)
			sleep(PAUSE)
			device.setIndexedColor(0, index6, (i * 4) % 255, 255, 0)
			sleep(PAUSE)
			device.setIndexedColor(0, index7, (i * 4) % 255, (i * 4) % 255, 255)
			sleep(PAUSE)

			i++
			i = i % 255
		}

		System.exit(0)
	}
}
