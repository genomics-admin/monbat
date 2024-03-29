/*
 * Ejemplo para probar interrupciones en Arduino 
 */
#include <Time.h>
#include <TimeAlarms.h> // Require the TimeAlarms.ccp file modification
                        // to add the Arduino.h in the include files
//#include <Wire.h>
//#include <Fifo.h>
#include <Streaming.h>

const int GreenLED = 12;
const int RedLED = 11;
const int InterruptPin = 2;
const int debounceDelay = 10;
void setup()
{
  pinMode(GreenLED, OUTPUT);
  pinMode(RedLED, OUTPUT);
  pinMode(InterruptPin, INPUT);
  digitalWrite(InterruptPin,HIGH);
  attachInterrupt(0,interrupHandler,CHANGE);
  Serial.begin(9600);
}

void interrupHandler()
{
  noInterrupts();
  switch(debounce(InterruptPin))
  {
  case HIGH:
    Serial.print("s");
    //digitalWrite(GreenLED,HIGH);
    //delay(1000);
    //digitalWrite(GreenLED,LOW);
    Serial.print("1");
    Serial.println("e");
    break;

  case LOW:
    Serial.print("s");
    //digitalWrite(RedLED,HIGH);
    //delay(1000);
    //digitalWrite(RedLED,LOW);
    Serial.print("0");
    Serial.println("e");
    break;
  }
  interrupts();  
}

boolean debounce(int pin)
{
  boolean state;
  boolean previousState;
  
  Serial.print("i");
  previousState = digitalRead(pin); //store pin state
  for (int counter=0; counter < debounceDelay; counter++)
  {
    delay(1);  // wait for 1 milisecond
    state = digitalRead(pin);
    if (state != previousState)
    {
      counter = 0; // reset the counter if the state changes
      previousState = state;
    }
  }
  // here when the switch state has been stable longer than debounce time
  Serial.print("f");
  return state;
}


void loop()
{
  while (true)
  {
    delay(10);
  }
  
}


