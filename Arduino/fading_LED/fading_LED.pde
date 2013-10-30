// Example 04: Fade an LED in and out like on
// a sleeping Apple computer
#define LED 9 // the pin for the LED
int i = 0;
// We’ll use this to count up and down
void setup() {
pinMode(LED, OUTPUT); // tell Arduino LED is an output
}
void loop(){
//for (i = 0; i < 255; i++) { // loop from 0 to 254 (fade in)
analogWrite(LED, HIGH);
// set the LED brightness
//delay(20); // Wait 10ms because analogWrite
// is instantaneous and we would
// not see any change
//}
for (i = 255; i > 0; i--) { // loop from 255 to 1 (fade out)
analogWrite(LED, i); // set the LED brightness
delay(20);
// Wait 10ms
}
}

