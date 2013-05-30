.global        	main

        .equ    GPIO1_BASE, 0xE0028010
        .equ    GPIO1_PIN,  GPIO1_BASE+0x00	@ IO_Register
	  	.equ    GPIO1_DIR,  GPIO1_BASE+0x08	@ Richtungsregister

.section        .text      
main:
	bl	BaseStickConfig 					@ LPC-Stick konfigurieren
	
	@ Richtung der Ports festlegen (0: Eingang, 1: Ausgang)
	@ Die Ports 0...15 und 27...30 sind Ausgaenge
	ldr r1,=GPIO1_DIR						@ Richtungsregister
	ldr	r2, [r1] 
	ldr r3,=0x7800FFFF 
	orr	r3,r2
	str	r3, [r1]   

	mov r5, #0		@r5 auf 0 setzen - für Kommulierte Messergebnisse
	mov r6, #0		@r6 auf 0 setzen - für länge der Messchleife

	@r0		-> Messergebnis und LED-Anzeige
	@r1-r4	-> Register für ADC_get_chanel
	@r5		-> Akkumulator für den Durchschnitt
	@r6		-> Schleifenzähler
	@r7, r8	-> Register für die Umrechnung der Messwerte

Messschleife:
	@ Wert vom 10-Bit-AD-Wandler lesen ([r0] <-- Spannungswert)
	@ Der Wert ist 0x0000 fuer 0V und 0x03FF fuer 3V (Maximalspannung !!!)
	@ Achtung: ADC_get_channel veaeaendert die Reg. r0-r4 !!!

	WHILE_01:
		cmp r6, #16			@Auf Ende der Schleife prüfen
		beq ENDWHILE_01		@Aus der Messschleife springen - Ergebnis in r5

	DO_01:
		mov	r0, #0			@r0 zurücksetzen
		bl	ADC_get_channel	@Messung durchführen - Ergebnis steht in r0

		add r5, r0			@Messergebnis auf r5 addieren
		add r6, #1			@Schleifenzähler inkrementieren
		
		b WHILE_01
	ENDWHILE_01:

	mov r6, #0		@r6 zurücksetzen

	mov r7, r5, lsr #4	@r5 durch 16 teilen um den Druchschnitt zu ermitteln
	mov r5, r7, lsr #6	@Ausgabe in 0.2v/LED konvertieren
	mov r8, #1			@r8 auf 1 setzen um damit die Ausgabe zu ermöglichen	
	mov r0, r8, lsl r5	@Anzeige um Messwert nach links verschieben
	sub r0, #1			@LEDs auffüllen - führt dazu, dass das letzte LED nie leuchtet



	@ Binaerwert auf dem IO_Register ausgeben
 	ldr r1,=GPIO1_PIN	
	mov r3,r0	 						@ Bits 0...15 extrahieren
	ldr	r4,=0xFFFF						@ Ausgabebereich der LEDs erweitern
	and	r3, r4
	str	r3, [r1]

	b	Messschleife
	
@  Programmende  
   .end
@************************************** EOF *********************************
