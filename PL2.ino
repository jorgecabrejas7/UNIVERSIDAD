#include "DHT.h"
#define DHTTYPE DHT11

//LDR
const int ledLuz = 13;
const int ldrPin = A0;
//BUZZER
const int buzzerPin = 12;
//TEMPERATURA
const int tmpPin = 5;
//PRESION
const int fsrPin = 11;
const int ledRojo = 3;
const int ledVerde = 2;
const int presion = 0;
//MICROFONO
const int micdigital = 4;
const int estado = 0;
const int valor = 0;

DHT dht(tmpPin, DHTTYPE);

void setup() 
{
  Serial.begin(9600);
  //LDR
  pinMode(ldrPin, INPUT);
  pinMode(ledLuz, OUTPUT);
  //BUZZER
  pinMode (buzzerPin, OUTPUT);
  //TEMPERATURA
  pinMode(tmpPin, INPUT);
  dht.begin();
  //PRESION
  pinMode(fsrPin, INPUT);
  pinMode(ledRojo, OUTPUT);
  pinMode(ledVerde, OUTPUT);
  //MICROFONO
  pinMode(micdigital, INPUT);
  
}

void loop() 
{
  //TEMPERATURA
  mostrarTemperatura();
  
  //PRESION
  //mostrarPresion(ledRojo, ledVerde, fsrPin, presion);
  
  //LDR
  //cambiarLuzLDR(ledLuz,ldrPin);
  
  //BUZZER 
  //musicaPiratasDelCaribe(ledLuz, buzzerPin, ldrPin);
  
  //MICRO Y BUZZER
  //captarsonido(micdigital, valor, estado, ledLuz, buzzerPin, ldrPin);
}

//MICROFONO
void captarsonido(int micdigital, int valor, int estado, int ledLuz, int buzzerPin, int ldrPin)
{
  valor = digitalRead(micdigital);
  if (valor == HIGH){   
    musicaPiratasDelCaribe(ledLuz, buzzerPin, ldrPin);  
    delay(500); 
  }
}

//PRESION
void mostrarPresion(int ledRojo, int ledVerde, int fsrPin, int presion)
{
  presion = digitalRead(fsrPin);
  Serial.print("Lectura digital = ");
  Serial.print(presion); 
  if (presion == HIGH){
      Serial.println(" - Presion alta"); 
      digitalWrite(ledRojo, HIGH);
      digitalWrite(ledVerde, LOW);  
   }
   else {
      Serial.println(" - Presion ligera");
      digitalWrite(ledVerde, HIGH);
      digitalWrite(ledRojo, LOW);
   }
   delay(1000);
} 

//TEMPERATURA
void mostrarTemperatura()
{
  float t = dht.readTemperature();
  float h = dht.readHumidity();
  Serial.print("Temperatura = ");
  Serial.print(t);
  Serial.println("°C ");
  Serial.print("Humedad = ");
  Serial.println(h);
  delay(2000);
}

//LDR
void cambiarLuzLDR(int ledLuz,int ldrPin)
{
  int ldrStatus = analogRead(ldrPin);
  if (ldrStatus <=650) {
  digitalWrite(ledLuz, HIGH);
  Serial.println("Habitacion oscura, LED encendido");
  }
  else {
  digitalWrite(ledLuz, LOW);
  Serial.println("Habitacion con luz");
  }
}

//BUZZER
void musicaPiratasDelCaribe(int ledLuz, int buzzerPin, int ldrPin)
{
  // funcion = tone(pin, frequency, duration)
  tone(buzzerPin,293.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,293.66,200);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,293.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,293.66,200);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,293.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,293.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,293.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,293.66,200);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,293.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,293.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,440,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,523.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,783.99,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,523.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,523.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(300);
  tone(buzzerPin,440,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,523.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,783.99,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,523.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(400);
  tone(buzzerPin,440,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,523.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,783.99,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,783.99,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,783.99,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,880,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,932.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,932.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,880,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,783.99,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,880,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(300);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,783.99,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,880,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(300);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,698.45,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,659.25,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(400);
  tone(buzzerPin,880,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1046.50,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1046.50,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1046.50,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(300);
  tone(buzzerPin,880,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1046.50,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1046.50,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(400);
  tone(buzzerPin,880,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1046.50,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1760,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1864.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1864.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1760,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1760,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(300);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1760,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(300);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1108.73,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1318.51,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,1760,300);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(400);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,880,300);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(600);
  tone(buzzerPin,1864.66,300);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(400);
  tone(buzzerPin,1396.91,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1174.66,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,932.33,300);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(600);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,440,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(200);
  tone(buzzerPin,587.33,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(300);
  tone(buzzerPin,554.36,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
  tone(buzzerPin,1567.98,100);
  cambiarLuzLDR(ledLuz,ldrPin);
  delay(100);
}
