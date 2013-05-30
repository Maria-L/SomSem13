@ Versuch 3: Reaktionstester
@ --------------------------

.global	main, ConfigurePorts, TestIfPushButtonPressed, OutputLEDBar, LEDBarEndReached, SefeDelay

              .equ    GPIO1_BASE, 0xE0028010

              .equ    GPIO1_PIN,  GPIO1_BASE+0x00	@IO - Register
 			  .equ    GPIO1_SET,  GPIO1_BASE+0x04	@LEDs schalten
			  .equ    GPIO1_DIR,  GPIO1_BASE+0x08	@Richtungsregister
			  .equ    GPIO1_CLR,  GPIO1_BASE+0x0C



# --- Initialisierung der Daten ---
.section	.data	
	.align	4

LCDText1:	.asciz	"Zum Starten - Taste S7 druecken"
LCDText2:	.asciz	"Achtung!!!"
LCDText3:	.asciz	"Stopped"

# --- Hauptprogramm ---
.section 	.text
	.align	4	



main:

     
     bl	BaseStickConfig		@ NXP LPC-Stick konfigurieren (muss sein)
	 bl ConfigurePorts		@ Ports initialisieren

 	 mov	r0,#0 
	 bl     init_delay		@ Timer initialisieren

###################### Programm #######################

##### start_wait #####
START_WAIT:
	bl LCD_cls			@ Display Ausgabe löschen
	ldr r0, =LCDText1	@ LCDText1 laden
	bl LCD_puts			@ Text ausgeben

##### while_button #####
WHILE_BUTTON:			@ Warte auf S7
	bl TestIfPushButtonPressed
	cmp r0, #0			@ Prüft auf den Rückgabewert von TextIf..
	beq WHILE_BUTTON	@ Springt zurück, wenn S7 nicht gedürckt wurde

##### start_delay #####
START_DELAY:
	bl LCD_cls			@ Display Ausgabe löschen
	ldr r0, =LCDText2	@ LCDText2 laden
	bl LCD_puts			@ Text ausgeben

	ldr r1, =GPIO1_PIN	@ IO-Pin abrufen
	mov r2, #0			@ r2 für Überschreiben vorbereiten
	str r2, [r1]		@ Überschreiben von IO-Pin

	ldr r0,=30000		@ r0 für den SafeDelay vorbereiten
	bl SafeDelay		@ Um 3Sekunden (30.000 / 0.1 = 3000ms = 3s) verzögern

##### run #####
RUN:
	mov r0, #200		@ r0 für den SafeDelay vorbereiten
	bl SafeDelay		@ Um 0,02 Sekunden verzögern

	bl TestIfPushButtonPressed	@ Ist S7 gedrückt?
	cmp r0, #1			@ Test aus r0 ob S7 gedrückt ist?
	beq SHOW_RESULT		@ Falls gedrückt, springe zu SHOW_RESULT

	mov r2, r2, LSL #1	@ Balken nach links verschieben
	add r2, #1			@ Erstes Bit in r2 auffüllen
	mov r0,r2			@ Balken in die Übergabe verschieben
	bl OutputLEDBar		@ in die IO springen
	bl LEDBarEndReached	@ in LEDBarEndReached springen
	cmp r0, #1			@ prüfen ob alle LEDs leuchten
	bne RUN				@ Wenn nicht alle LEDs leuchten, springe zum Anfang

##### show_result #####
SHOW_RESULT:
	bl LCD_cls			@ Display Ausgabe löschen
	ldr r0, =LCDText3	@ LCDText3 laden
	bl LCD_puts			@ Text ausgeben

	ldr r0, =30000		@ r0 für den SafeDelay vorbereiten
	bl SafeDelay		@ Um 3Sekunden (30.000 / 0.1 = 3000ms = 3s) verzögern

	b START_WAIT

###################### Funktionen #######################


######## ConfigurePorts ########
ConfigurePorts:
	stmfd sp!, {r1-r3,lr}

	ldr r1, =GPIO1_DIR		@ Richtungsregister
	ldr r2, [r1]			@ Input -> 0, Output -> 1
	ldr r3, =0x7FFF			@ 15 Einsen für Output, eine Null für Input
	orr r3, r2				@ 1.0 - 1.14 auf 1, 1.15 auf 0 setzen
	str r3, [r1]			@ zurück in r1 schreiben

	ldmfd sp!, {r1-r3,lr}
	bx lr

######## TestIfPushButtonPressed ########
TestIfPushButtonPressed:
	stmfd sp!, {r1-r2,lr}

	ldr r1, =GPIO1_PIN		@ IO-Register Addresse laden
	ldr r2, [r1]			@ Wert aus em IO-Register laden
	ands r2, r2, #0x8000	@ Ist der Input-Port 1?
	moveq r0, #1			@ ja -> r0 auf 1 Setzen
	movne r0, #0			@ nein -> r0 auf 0 setzen

	ldmfd sp!, {r1-r2,lr}
	bx lr

######## OutputLEDBar ########
OutputLEDBar:
	stmfd sp!, {r1,lr}

	ldr r1, =GPIO1_PIN	@ IO-Register Addresse laden
	str r0, [r1]		@ Wert aus r0 ins IO-Register laden

	ldmfd sp!, {r1,lr}
	bx lr

######## LEDBarEndReached ########
LEDBarEndReached:
	stmfd sp!, {r1-r4,lr}

	ldr r1, =GPIO1_PIN	@ IO-Register Addresse laden
	ldr r3, [r1]		@ Inhalt des IO-Registers laden
	ldr r2, =0x7FFF		@ 15 Einsen in r2 laden
	and r3,r2			@ leuchten alle 15 LEDs?
	cmp r3,r2
	moveq r0, #1		@ Wenn ja, r0 -> 1
	movne r0, #0		@ Wenn nein, r0 -> 0

	ldmfd sp!, {r1-r4,lr}
	bx lr

######## SafeDelay ########
SafeDelay:
	stmfd sp!, {r1-r4,lr}	@ Explizit retten, weil wir nicht wissen, was
	bl delay				@ delay mit unseren Registern macht
	ldmfd sp!, {r1-r4,lr}
	bx lr


@Programmende
    .end

     
@************************************** EOF *********************************
