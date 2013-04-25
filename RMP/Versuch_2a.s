.global	 main              @korrigiert: .main

.section .data
# ---- Zu sortierende Daten -----
DataList:	.byte	35, -1, 13, -12, 100, 101, -3, -5, 0, 7
DataListEnd:



.section .text
# ----- Programmbeginn -----
main:

	mov r0, #1					@Setze r0 als byte und lade mit true
	
WHILE_01: 
	cmp r0, #1					@r0 equals #1
	bne ENDWHILE_01				@Wenn nicht gleich springe zu Endwhile01 
	
DO_01							@Prüfe ob Getauscht == true ist
	mov r0, #0					@Setze r0 auf false
	ldr r1 =DataList			@Setze r1 an den Anfang von DataList
	
WHILE_02: 
	cmp r1, DataListEnd
	beq ENDWHILE_02				@r1 unequal DataListEnd 
	
DO_02							@Sol. wir nicht d. Ende der Liste err. haben

IF_01 	
	ldr r3, [r1]				@[r1] > [r1+#1]
	ldr r4, [r1+1]
	cmp r3, r4
	blt ENDIF_01
	
THEN_01							@Wenn der Wert von [r1] > [r1+1]
	ldrb r2, [r1]				@Dreieckstausch
	strb [r1+#1], [r1]			@Dreieckstausch
	strb r2, [r1+#1]			@Dreieckstausch
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



