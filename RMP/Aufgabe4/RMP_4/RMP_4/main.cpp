#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "stringsort.h"


int main(int argc)
{
	char *pMS[] = {
					"Haller       25 EUR",
					"Kandinsky    13 EUR",
					"Brombach      5 EUR",
					"Zaluskowski 120 EUR",
					"Osman        17 EUR",
					"Hans       1254 EUR",
					"Olaf        423 EUR",
					"Oracle        0 EUR",
					"Hollande     43 EUR",
					"Merkel       42 EUR",
					"\0\0"
	};

	sortiereStrings(pMS);
	printStringListe(pMS);
	system("pause");
	return 0;
}
