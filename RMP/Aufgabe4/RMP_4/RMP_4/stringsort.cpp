//printStringliste
//sortiereStrings

#include "stringsort.h"

void printStringListe(char* pMS[]) {
	int i = 0;
	while(*pMS[i] != '\0') {
		printf("%s\n",pMS[i]);
		i++;
	}
}

int getNum(char* pString) {
	int akku = 0 , k = 0;
	char* savePointer = pString;

	while(*pString != '\0') {
		pString += 1;		//Pointer auf das Ende des Strings setzen
	}
	while(!isInt(*pString) && (pString - savePointer) >= 0) {
		pString -= 1;		//Bis zur letzten Zahl vorspulen
	}
	while(isInt(*pString)) {
		akku += ((*pString - 0x30) * pow(10.0,k));
		pString -= 1;		//Bis zum Anfang des Strings Zahlen aufaddieren
		k ++;
	}
	return akku;
}

bool isInt(char n) {
	n -= 0x30;
	if(n < 0 || n > 9)
		return false;
	else
		return true;
}

void sortiereStrings(char* pMS[]) {
	bool getauscht = true;
	int i = 0;		//i -> Laufvariable für das Array
	char* dreiecksstring = "";

	while(getauscht) {
		getauscht = false;
		i = 0;
		
		while(*(pMS[i+1]) != '\0') {
			if(getNum(pMS[i]) > getNum(pMS[i+1])) {

				dreiecksstring = pMS[i];
				pMS[i] = pMS[i+1];
				pMS[i+1] = dreiecksstring;

				getauscht = true;
			}
			i++;
		}
	}
}