package abstractt;

abstract class SmartDevice {
 abstract void turnOn();
 abstract void turnOff();
 abstract void perform();
}

class SmartPhone extends SmartDevice {
 void turnOn() {
     System.out.println("SmartPhone is now ON.");
 }
 void turnOff() {
     System.out.println("SmartPhone is now OFF.");
 }
 void perform() {
     System.out.println("SmartPhone: Making calls and browsing the internet.");
 }
}

class SmartWatch extends SmartDevice {
 void turnOn() {
     System.out.println("SmartWatch is now ON.");
 }
 void turnOff() {
     System.out.println("SmartWatch is now OFF.");
 }
 
 void perform() {
     System.out.println("SmartWatch: Tracking fitness and showing time.");
 }
}

class SmartSpeaker extends SmartDevice {
 void turnOn() {
     System.out.println("SmartSpeaker is now ON.");
 }
 
 void turnOff() {
     System.out.println("SmartSpeaker is now OFF.");
 }
 
 void perform() {
     System.out.println("SmartSpeaker: Playing music and responding to voice commands.");
 }
}

public class Q1 {
 public static void main(String[] args) {
     SmartDevice devices = new SmartPhone();
     SmartDevice devices1 = new SmartWatch();
     SmartDevice devices2 = new SmartSpeaker();
     devices.turnOn();
     devices1.perform();
     devices2.turnOff();
     
 }
}
