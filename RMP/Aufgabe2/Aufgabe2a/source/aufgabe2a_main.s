.global	 main              @korrigiert: .main

.section .data
# ---- Zu sortierende Daten -----
DataList:	.byte	35, -1, 13, -12, 100, 101, -3, -5, 0, 7
DataListEnd:



.section .text
# ----- Programmbeginn -----

								@r0 -> Bewegt oder nicht [1/0]
								@r1 -> DataList-Iterator
								@r2 -> benutzt für Dreieckstausch
								@r3 -> benutzt zum Vergleichen
								@r4 -> benutzt zum Vergleichen
								@r5 -> Adresse von DataListEnd
main:

	mov r0, #1					@Setze r0 als byte und lade mit true
	ldr r5, =DataListEnd
	sub r5, #2
	
WHILE_01: 
	cmp r0, #1					@r0 equals #1
	bne ENDWHILE_01				@Wenn nicht gleich springe zu Endwhile01 
	
DO_01:							@Prüfe ob Getauscht == true ist
	mov r0, #0					@Setze r0 auf false
	ldr r1, =DataList			@Setze r1 an den Anfang von DataList
	
WHILE_02: 
	cmp r1, r5
	beq ENDWHILE_02				@r1 unequal DataListEnd 
	
DO_02:							@Sol. wir nicht d. Ende der Liste err. haben

IF_01: 	
	ldrb r3, [r1]				@[r1] > [r1+#1]
	ldrb r4, [r1, #1]
	lsl r3, #24
	lsl r4, #24	
	cmp r3, r4
	lsr r3, #24
	lsr r4, #24	

	blt ENDIF_01
	
THEN_01:	

	strb r4, [r1]	
	strb r3, [r1, #1]			@Wenn der Wert von [r1] > [r1+1]
	mov r0, #1					@r0 auf true setzen
	
ENDIF_01:
	add r1, #1					@r1 um einen nach rechts verschieben
	b WHILE_02
	
ENDWHILE_02:
	b WHILE_01
	
ENDWHILE_01:



loop:   @  Programmende
	b loop

.end



