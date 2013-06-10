//printStringliste
//sortiereStrings

#include "stringsort.h"

void printStringListe(char* pMS[]) {
	int i = 0;
	while(*pMS[i] != '\0') {      //Schleife die überprüft ob der String zu ende ist
		printf("%s\n",pMS[i]);	  //Druckt den String aus und macht danach einen Absatz
		i++;
	}
}

int getNum(char* pString) {
	int akku = 0 , k = 0;			//Der Akku für die Ausgabe und das k um die Wertigkeit der Zahl anzugeben
	char* savePointer = pString;	// Parameter um später zu verhindern, dass der Pointer nach vorne in einen unerlaubten Bereich läuft

	while(*pString != '\0') {       // Solange der String nicht zu Ende ist vorspulen bis zum Ende
		pString += 1;				//Pointer auf das Ende des Strings setzen
	}
	while(!isInt(*pString) && (pString - savePointer) >= 0) {// Zurückspulen bis zum ersten Int oder zum beginn des Strings falls kein Integer vorhanden ist
		pString -= 1;				//Bis zur letzten Zahl vorspulen
	}
	while(isInt(*pString)) {        //Solange Integer folgen die Wertigkeit feststellen und den Wert auf den Akku addieren
		akku += ((*pString - 0x30) * pow(10.0,k));
		pString -= 1;				//Bis zum Anfang des Strings Zahlen aufaddieren
		k ++;
	}
	return akku;
}

bool isInt(char n) {              //Funktion um das getNum zu erleichtern
	n -= 0x30;                    // Wert der aus einer ASCII Zahl eine dezimahlzahl macht
	if(n < 0 || n > 9)            
		return false;
	else
		return true;
}

void sortiereStrings(char* pMS[]) {      //Bubblesort
	bool getauscht = true;
	int i = 0;							//i -> Laufvariable für das Array
	char* dreiecksstring = "";			// Variable für den Dreieckstausch

	while(getauscht) {                  // Solange  noch etwas getauscht wurde, der Algorithmus also noch nicht fertig ist
		getauscht = false;              // Variable für den Fall des nicht Tauschens vorbereiten
		i = 0;                          // Pointer auf den Anfang setzten
		
		while(*(pMS[i+1]) != '\0') {    // Solange das Ende der Liste noch nicht erreicht wurde
			if(getNum(pMS[i]) > getNum(pMS[i+1])) { // Wenn die Verglichenen Werte getauscht werden müssen

				dreiecksstring = pMS[i];	//
				pMS[i] = pMS[i+1];			//Dreieckstausch
				pMS[i+1] = dreiecksstring;	//

				getauscht = true;			// Festhalten, dass getauscht wurde
			}
			i++;							// Pointer einen weiter setzten
		}
	}
}